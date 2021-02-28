import java.util.Scanner;
public class Tasks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("==1 quest==");
        System.out.println(oppositeHouse(1, 3));
        System.out.println("==2 quest==");
        nameShuffle("Donald Trump");
        System.out.println("==3 quest==");
        System.out.println("Final price is " + discount(100, 75));
        System.out.println("==4 quest==");
        System.out.println(differenceMaxMin(new int[] {10, 4, 1,4 -10, -50, 32,21}));
        System.out.println("==5 quest==");
        System.out.println("A " + equal(3,4,3) + " numbers have equals value");
        System.out.println("==6 quest==");
        System.out.println(reverse("Edabit os reallu helpful!"));
        System.out.println("==7 quest==");
        System.out.println("Difference is " + programmers(147,33,526));
        System.out.println("==8 quest==");
        System.out.println(getXO("ooxXm"));
        System.out.println(getXO("zpzpzpp"));
        System.out.println("==9 quest==");
        bomb("Hey, did you think there is a bomb?");
        bomb("This goes boom!!!");
        System.out.println("==10 quest==");
        System.out.println(sameASCII("AA", "B@"));
        System.out.println(sameASCII("EdAbIt", "EDABIT"));
    }
    public static int oppositeHouse(int home, int k){
        int kolvon = 1;
        int kolvoc = 2*k;
        for (int i = 0; i < k; i++) {
            // if(kolvoc == home || kolvon == home){
            //System.out.print(kolvon + "|  |" + kolvoc + '\n');}
            if(kolvoc == home)
                return kolvon;
            if(kolvon == home)
                return kolvoc;
            kolvon += 2;
            kolvoc -= 2;
        }
        return 0;
    }
    public static void nameShuffle(String arr){
        String words[] = arr.split(" ");
        for(int i = words.length-1; i>=0; i--){
            System.out.print(words[i]+" ");
        }
    }
    public static double discount(int prize, int dis){
        return ((double)prize - (double)(prize*dis)/100);
    }
    public static int differenceMaxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        return max - min;
    }
    public static int equal(int a, int b, int c){
        int k = 0;
        if (a==b)
            k++;
        if (a==c)
            k++;
        if (b==c)
            k++;
        return k;
    }
    public static String reverse(String s){
        String reversed = "";
        for(int i = s.length()-1; i >= 0; i--){
            reversed += s.charAt(i);
        }
        return reversed;
    }
    public static int programmers(int a, int b, int c){
        int diff, max, min;
        max = 0; min = 0;
        if (a>b && a>c)
            max = a;
        else if (b>a && b>c)
            max = b;
        else if (c>a && c>b)
            max = c;
        if (a<b && a<c)
            min = a;
        else if (b<a && b<c)
            min = b;
        else if (c<a && c<b)
            min = c;
        diff = max - min;
        return diff;
    }
    public static boolean getXO(String s1){
        s1 = s1.toUpperCase();
        int countO = 0;
        int countX = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == 'O')
                countO++;
            if(s1.charAt(i) == 'X')
                countX++;
        }
        if(countO==countX)
            return true;
        else
            return false;
    }
    public static void bomb(String s2){
        s2=s2.toUpperCase();
        String str1 = "BOMB";
        boolean got = s2.contains(str1);
        if(got)
            System.out.println("Duck!");
        else
            System.out.println("Relax....");
    }
    public static boolean sameASCII(String s1, String s2){
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i<s1.length();i++){
            count1 += (int) s1.charAt(i);
        }
        for(int i = 0; i<s2.length();i++){
            count2 += (int) s2.charAt(i);
        }
        return (count1==count2);
    }

}