import java.util.Scanner;
public class Taskes {
    public static void main(String[] args) {
        int a, b, min, two, three, win, draws, losses, num;
        int n, h, w, FPS;
        double prob, prize, pay;
        int val=11;
        System.out.println("Hello World!");
        Scanner in = new Scanner(System.in);
        while (val != 0) {
            System.out.println(" Enter number of task(1-10); \n 0 - stop, else - nothing;");
            val = in.nextInt();
            switch (val) {
                case 1:
                    System.out.println("Enter number of minutes:");
                    min = in.nextInt();
                    System.out.println("You have a " + convert(min) + " seconds");
                    break;
                case 2:
                    System.out.println("Enter number of two point goals:");
                    two = in.nextInt();
                    System.out.println("Enter number of three point goals:");
                    three = in.nextInt();
                    System.out.println("You have a " + points(two, three) + " points");
                    break;
                case 3:
                    System.out.println("Enter number of wins:");
                    win = in.nextInt();
                    System.out.println("Enter number of draws:");
                    draws = in.nextInt();
                    System.out.println("Enter number of losses:");
                    losses = in.nextInt();
                    System.out.println("You have a " + footballPoints(win, draws) + " points");
                    break;
                case 4:
                    System.out.println("Enter a number: ");
                    num = in.nextInt();
                    System.out.println(divisibleByFive(num));
                    break;
                case 5:
                    System.out.println("Enter logical a(1/0): ");
                    a = in.nextInt();
                    System.out.println("Enter logical b(1/0): ");
                    b = in.nextInt();
                    System.out.println(and(a, b));
                    break;
                case 6:
                    System.out.println("Enter how much paint you have: ");
                    n = in.nextInt();
                    System.out.println("Enter a Height: ");
                    h = in.nextInt();
                    System.out.println("Enter a Width: ");
                    w = in.nextInt();
                    System.out.println("You can draw a " + howManyWalls(n, h, w) + " walls");
                    break;
                case 7:
                    System.out.println("Enter a number: ");
                    b = in.nextInt();
                    System.out.println("Squared of ur number is - " + squared(b));
                    break;
                case 8:
                    System.out.println("Enter a prob: ");
                    prob = in.nextDouble();
                    System.out.println("Enter a prize: ");
                    prize = in.nextDouble();
                    System.out.println("Enter a pay: ");
                    pay = in.nextDouble();
                    System.out.println(profitableGamble(prob, prize, pay));
                    break;
                case 9:
                    System.out.println("Enter a minutes: ");
                    min = in.nextInt();
                    System.out.println("Enter a FPS: ");
                    FPS = in.nextInt();
                    System.out.println("You have a " + frames(min, FPS) + " frames");
                    break;
                case 10:
                    System.out.println("Enter a divided: ");
                    a = in.nextInt();
                    System.out.println("Enter a division: ");
                    b = in.nextInt();
                    System.out.println("mod(" + a + ", " + b + ") = " + mod(a, b));
                    break;
            }
        }
        in.close();
        System.out.println("Good Bye!");
    }
    public static int convert(int min){
        return min*60;
    }
    public static int points(int two, int three){
        return (two*2+three*3);
    }
    public static int footballPoints(int win, int draw){
        return (win*3+draw);
    }
    public static boolean divisibleByFive(int num){
        if(num%5==0)
            return true;
        return false;
    }
    public static boolean and(int a, int b){
        boolean aa, bb;
        if(a==1)
            aa = true;
        else
            aa = false;
        if(b==1)
            bb = true;
        else
            bb = false;
        return aa&&bb;
    }
    public static int howManyWalls(int n, int h, int w){
        int metr;
        metr = h*w;
        int k = 0;
        while(n-metr>0){
            k++;
            n-=metr;
        /*
        //mb that will be work, but pofig
        //+some if's
        int ost = n%metr;
        n-=ost;
        k=n/metr;
         */
        }
        return k;
    }
    /*
    public class Challenge {
        public static int squaed(int b) {//squaed!=squared, but nvm
            return a * a//a? we have only b! and where ';'???
        }
    }
     */
    public static int squared(int b){
        return b*b;
    }
    public static boolean profitableGamble(double prob,double prize, double pay){
        return (prob * prize > pay);
    }
    public static int frames(int min, int FPS){
        return min * 60 * FPS;
    }
    public static int mod(int a, int b){// a - dividend, b - divisor
        while (a-b>0){
            a-=b;
        }
        return a;
    }
}
