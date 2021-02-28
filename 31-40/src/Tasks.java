public class Tasks {
    public static void main(String[] args){
        System.out.println("==1 quest==");
        sevenBoom(new int[] {1,2,3,4,5,6,7});
        sevenBoom(new int[] {8, 6, 33, 100});
        sevenBoom(new int[] {2,55,60,97,86});
        System.out.println("==2 quest==");
        cons(new int[] {5,1,4,3,2});
        cons(new int[] {5,1,4,3,2,8});
        System.out.println("==3 quest==");
        unmix("badc");
        unmix("hTsii  s aimex dpus rtni.g");;
        //unmix("123456");
        System.out.println("==4 quest==");
        noYelling("what???????");
        noYelling("OMG!!!!!!!!!");
        noYelling("ok....");
        System.out.println("==5 quest==");
        xPronounce("The x ray is excellent");
        xPronounce("Inside the box was a xylophone");
        System.out.println("==6 quest==");
        largestGap(new int[] {9,4,26,26,0,0,5,20,6,25,5});
        largestGap(new int[] {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7});
        System.out.println("==7 quest==");
        CodeAndSupl(832);
        CodeAndSupl(51);
        CodeAndSupl(7977);
        CodeAndSupl(665);
        System.out.println("==8 quest==");
        commonLastVowel("Hello World!");
        commonLastVowel("Watch the characters dance!");
        System.out.println("==9 quest==");
        memeSum(26,39);
        memeSum(122,81);
        System.out.println("==10 quest==");
        unrepeated("Hello World");
        unrepeated("AABBCCDD");
    }
    public static void sevenBoom(int[] arr){
        boolean flag = false;
        for(int i = 0; i< arr.length; i++){
            if (arr[i]%10==7)
                flag=true;
    }
        if(flag)
            System.out.println("boom!");
        else
            System.out.println("there is no 7 in the array");
    }
    public static void cons(int[] arr){
        boolean flag = false;
        sortOfArray(arr);
        for(int i = 0; i<arr.length-1; i++){

            if(arr[i]+1==arr[i+1])
                flag = true;
            else {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
    public static void unmix(String s1){
        String str1="";
        char letter = ' ';
        for(int i = 0; i<s1.length();i++){
            if(i%2==0)
                letter = s1.charAt(i);
            if(i%2!=0) {
                str1 += s1.charAt(i);
                str1 += letter;
            }
            //System.out.println(str1);
        }
        System.out.println(str1);
    }
    public static void noYelling(String s1){
        if(s1.charAt(s1.length()-1)!='?' && s1.charAt(s1.length()-1)!='!')
            System.out.println(s1);
        else{
            int counto = 0;
            int countv = 0;
            boolean voro = false;
            if(s1.charAt(s1.length()-1)=='?')
                voro = true;
            for(int i = s1.length()-1;i>0; i--){
            if(s1.charAt(i)=='?')
                countv++;
            if(s1.charAt(i)=='!')
                counto++;
            if(s1.charAt(i)!='!'&&s1.charAt(i)!='?')
                break;
        }
            String str="";
            if(voro)
            for(int i=0;i<=s1.length()-countv;i++)
                str+=s1.charAt(i);
            else
                for(int i=0;i<=s1.length()-counto;i++)
                    str+=s1.charAt(i);
                System.out.println(str);
    }}
    public static void xPronounce(String s1){
        String str = "";
        String[] words = s1.split(" ");
        for(int i = 0; i< words.length;i++){

            if(words[i].equals("x"))
                str+="cks ";
            else if(words[i].contains("x")){
                if(words[i].charAt(0)=='x') {
                    str += 'z';
                    for(int j = 1; j<words[i].length();j++)
                        str+=words[i].charAt(j);
                    str+=" ";
                }
                else{
                    for(int j = 0; j<words[i].length();j++) {
                        if (words[i].charAt(j) == 'x') {
                            str += "cks";
                        }
                        else {
                            str += words[i].charAt(j);
                        }
                    }
                    str+=" ";
                }
            }
            else
                str+=words[i] +" ";
        }
            System.out.println(str);
    }
    public static void largestGap(int[] arr){
        sortOfArray(arr);
        int gap = Math.abs(arr[0]-arr[1]);
        int temp;
        for(int i = 2; i<arr.length;i++){
            temp = Math.abs(arr[i]-arr[i-1]);
            if(temp>gap)
                gap=temp;
        }
        System.out.println(gap);
    }
    public static void CodeAndSupl(int a){
        int arr[];
        int source = a;
        int k=0;
        while(source!=0){
            k++;
            source/=10;
        }
        source=a;
        arr = new int[k];
        for(int i=0; i<k; i++){
            arr[i]=source%10;
            source/=10;
        }
        source=0;
        sortOfArray(arr);
        for(int i =0; i<arr.length;i++){
            source+=arr[i]*Math.pow(10,arr.length-i-1);
        }
        System.out.println(a - source);
    }
    public static void commonLastVowel(String s1){
        String str = s1.toLowerCase();
        String words[] = str.split(" ");
        int count[]=new int[6];//aeiouy
        for(int i=0;i<6;i++)
            count[i]=0;
        String vowel = "aeiouy";
        for(int i = 0; i<words.length;i++){
            for(int j = 0; j<vowel.length();j++){
                if(words[i].charAt(words[i].length()-1)==vowel.charAt(j))
                    count[j]++;
            }
        }
        int max=count[0];
        int k = 0;
        for(int i = 1; i<6;i++) {
            //System.out.print(count[i]+" ");
            if (count[i]>max){
                k=i;
                max = count[i];
            }
        }
        System.out.println(vowel.charAt(k));
    }
    public static void memeSum(int a, int b){
        String str ="";
        int x,z,c;
        while(a!=0||b!=0){
            x=a%10;
            z=b%10;
            c=x+z;
            str=c+str;
            a/=10;
            b/=10;
        }
        if(a==0){
            str=b+str;
        }
        else if(b==0){
            str=a+str;
        }
        c=Integer.parseInt(str);
        System.out.println(c);
    }
    public static void unrepeated(String s1){
        String str="";
        for(int i = 0; i <s1.length(); i++){
            if(s1.charAt(i) == ' ')
                str+=s1.charAt(i);
            else if(!str.contains(Character.toString(s1.charAt(i)))){
                str+=s1.charAt(i);
            }
        }
        System.out.println(str);
    }
    public static void sortOfArray(int[] arr){
        for(int i = arr.length-1; i>0; i--){
            for(int j = 0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
