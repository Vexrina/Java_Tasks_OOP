public class Tasks {
    public static void main(String[] args)
    {

        System.out.println("==1 quest==");
        Object[][] arr = millionsRounding(new Object[][] { { "Nice", 942208 }, { "Abu Dhabi", 1482816 }, { "Naples", 2186853 }, { "Vatican City", 572 } });
        for(int i =0;i<arr.length;i++){
            System.out.println((arr[i][0]+" "+arr[i][1]));
        }
        System.out.println("==2 quest==");
        otherSides(1);
        otherSides(12);
        otherSides(2);
        System.out.println("==3 quest==");
        rps("rock", "paper");
        rps("scissors","scissors");
        System.out.println("==4 quest==");
        warOfNumbers(new int[] {2, 8, 7, 5});
        warOfNumbers(new int[] {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243});
        System.out.println("==5 quest==");
        reverseCase("happy MANY SpOnGeBoB");
        System.out.println("==6 quest==");
        inatorInator("Shrink");
        inatorInator("EvilClone");
        System.out.println("==7 quest==");
        doesBrickFit(1,1,1,1,1);
        doesBrickFit(1,2,2,1,1);
        doesBrickFit(1,2,1,1,1);
        System.out.println("==8 quest==");
        totalDistance(70, 7, 0, false);
        totalDistance(36.1, 8.6, 3, true);
        System.out.println("==9 quest==");
        mean(new int[]{1,0,4,5,2,4,1,2,3,3,3});
        mean(new int[]{2,3,2,3});
        System.out.println("==10 quest==");
        parityAnalis(243);
        parityAnalis(3);
        parityAnalis(12);
    }
    public static Object[][] millionsRounding(Object[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][1] = Math.round((double) ((int) arr[i][1]) / 1000000) * 1000000;
        }
        return arr;
    }
    public static void otherSides(int a){
        System.out.println("[" + (double)a*2 + ", " + (double) a*Math.sqrt(3) + "]");
    }
    public static void rps(String s1, String s2){
        if(s1 == "rock"){
            if(s2=="paper"){
                System.out.println("Player 2 win");
                }
            if(s2=="scissors") {
                System.out.println("Player 1 win");
                }
            }
        if(s1 == "papers"){
            if(s2=="rock"){
                System.out.println("Player 1 win");
            }
            if(s2=="scissors"){
                System.out.println("Player 2 win");
            }
        }
        if(s1=="scissors"){
            if(s2=="rock")
                System.out.println("Player 2 win");
            if(s2=="paper")
                System.out.println("Player 1 win");
        }
        if(s1==s2)
            System.out.println("DRAW");
    }
    public static void warOfNumbers(int[] arr){
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]%2==0)
                count2+=arr[i];
            else
                count1+=arr[i];
        }
        System.out.println(Math.abs(count1-count2));
    }
    public static void reverseCase(String s1){
        String str = "";
        for(int i = 0; i <s1.length(); i++){
            if((int)s1.charAt(i)<91 &&(int)s1.charAt(i)>64)
                str+= Character.toLowerCase(s1.charAt(i));
            else if((int)s1.charAt(i)<123 &&(int)s1.charAt(i)>96)
                str+= Character.toUpperCase(s1.charAt(i));
            else
                str+= s1.charAt(i);
        }
        System.out.println(str);
    }
    public static void inatorInator(String s1){
        String str = s1;
        boolean check = false;
        String glasnie = "aeiouy";
        int count = str.length()*1000;
        for(int i = 0; i< glasnie.length();i++)
            if(s1.charAt(s1.length()-1)==glasnie.charAt(i)){
                check = true;
            }
        if(check)
            str+= "-inator";
        else
            str+= "inator";
        System.out.println(str + " " + count);
    }
    public static void doesBrickFit(int a,int b,int c,int h,int w){
        boolean flag = false;
        if(a<=h && b<=w)
            flag = true;
        if(b<=h && a<=w)
            flag = true;
        if(a<=h && c<=w)
            flag = true;
        if(c<=h && b<=w)
            flag = true;
        System.out.println(flag);
    }
    public static void totalDistance(double t, double r, int p, boolean k){
        r=((double) (p*.05)+1) * r;
        if(k)
            r*=1.1;
        System.out.println(t*100/r);
    }
    public static void mean(int[] arr){
        for(int i = 1; i<arr.length; i++)
            arr[0]+=arr[i];
        System.out.println((double)arr[0]/(double) arr.length);
    }
    public static void parityAnalis(int a){
     int number = 0;
     int source = a;
     while (source!=0){
         number+=source%10;
         source/=10;
     }
     System.out.println(number%2==a%2);
    }
}

