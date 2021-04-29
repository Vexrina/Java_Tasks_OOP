import java.io.*;
public class Tasks {
    public static void main(String args[]){
        System.out.println("==1 quest==");
        System.out.println(sameLetterPattern("ABAB","CDCD"));
        System.out.println(sameLetterPattern("CDCD","FFGG"));
        System.out.println("==2 quest==");
//        System.out.println(spiderVsFly("H3", "E2"));
//        System.out.println(spiderVsFly("A4", "B2"));
//        System.out.println(spiderVsFly("A4", "C2"));
//        System.out.println(spiderVsFly("A4", "A2"));
//        System.out.println(spiderVsFly("A4", "C4"));
        System.out.println("==3 quest==");
        System.out.println(digitsCount(4666));
        System.out.println(digitsCount(544));
        System.out.println(digitsCount(121317));
        System.out.println("==4 quest==");
        totalPoints(new String[] {"cat", "create", "sat"}, "caster");
        totalPoints(new String[] {"trance", "recant"}, "recant");
        totalPoints(new String[] {"dote", "dotes", "toes", "set","dot","dots","sted"}, "tossed");
        System.out.println("==5 quest==");
        System.out.println(longestRun(new int[] {1,2,3,5,6,7,8,9}));
        System.out.println(longestRun(new int[] {1,2,3,10,11,15}));
        System.out.println(longestRun(new int[] {5,4,2,1}));
        System.out.println(longestRun(new int[] {3,5,7,10,15}));
        System.out.println("==6 quest==");
        takeDownAverage(new String[] {"10"});
        takeDownAverage(new String[] {"53","79"});
        takeDownAverage(new String[] {"95","83","90","87","88","93"});
        System.out.println("==7 quest==");
        rearrange("Tesh3 th5e 1I lov2e way6 she7 j4ust i8s.");
        rearrange("the4 t3o man5 Happ1iest of6 no7 birt2hday steel8!");
        rearrange("is2 Thi1s T4est 3a");
        rearrange(" ");
        System.out.println("==8 quest==");
        maxPossible(9328,456);
        maxPossible(523,76);
        maxPossible(9132,5564);
        maxPossible(8732,91255);
        System.out.println("==9 quest==");
        timeDifference("Los Angeles", "April 1, 2011 23:23", "Canberra");
        timeDifference("London", "July 31, 1983 23:01", "Rome");
        timeDifference("New York", "December 31, 1970 13:40", "Beijing");
        System.out.println("==10 quest==");
        System.out.println(isNew(3));
        System.out.println(isNew(30));
        System.out.println(isNew(123));
        System.out.println(isNew(321));
        System.out.println(isNew(869));
        System.out.println(isNew(509));
    }
    //1
    public static boolean sameLetterPattern(String s1, String s2) {
        return createLetterPattern(s1).equals(createLetterPattern(s2));
    }
    public static String createLetterPattern(String s1){
            String s1_Pattern = "", s1_Chars = "";
            s1_Chars+=s1.charAt(0);
            s1_Pattern +="0";
            boolean was = false;
            for(int i=1; i<s1.length(); i++){
                for(int j = 0; j<s1_Chars.length();j++) {
                    was = false;
                    if (s1.charAt(i) == s1_Chars.charAt(j)) {
                        s1_Pattern += Integer.toString(j);
                        was = true;
                        break;
                    }
                }
                if(!was){
                    s1_Chars+=s1.charAt(i);
                    s1_Pattern+= Integer.toString(s1_Pattern.length());
                }
            }
           return s1_Pattern;
        }
    //2
    public static String spiderVsFly(String a, String b) {
        int xSpider = a.charAt(0) - 65;
        int ySpider = a.charAt(1) - 48;

        int xFly = b.charAt(0) - 65;
        int yFly = b.charAt(1) - 48;

        double diametrDist = (ySpider + yFly);
        double leftDist = 0;
        double rightDist = 0;

        String path = "";
        if (yFly < ySpider) {
            leftDist = Math.abs(xSpider - xFly) * yFly * Math.sqrt(2);
            rightDist = Math.abs(6 - xSpider + xFly) * yFly * Math.sqrt(2);
        } else {
            leftDist = Math.abs(xSpider - xFly) * ySpider * Math.sqrt(2);
            rightDist = Math.abs(6 - xSpider + xFly) * ySpider * Math.sqrt(2);
        }

        if (diametrDist < leftDist && diametrDist < rightDist) {
            for (int i = ySpider; i >= 0; i--) {
                path += a.charAt(0) + Integer.toString(i) + "-";
            }
            for (int i = 1; i <= yFly; i++) {
                path += b.charAt(0) + Integer.toString(i) + "-";
            }
        }
        else if (leftDist < diametrDist && leftDist < rightDist) {
            if (yFly < ySpider) {
                for (int i = ySpider; i >= ySpider - yFly; i--) {
                    path += a.charAt(0) + Integer.toString(i) + '-';
                }
                for (int i = 1; i <= Math.abs(xFly - xSpider); i++) {
                    path += (char) (i + 65) + Integer.toString(yFly) + '-';
                }
            } else {
                for (int i = 0; i <= Math.abs(xFly - xSpider); i++) {
                    path += (char) (i + 65) + Integer.toString(ySpider) + '-';
                }
                for (int i = ySpider + 1; i <= yFly; i++) {
                    path += b.charAt(0) + Integer.toString(i) + '-';
                }
            }
        }
        else {
            if (yFly < ySpider) {
                for (int i = ySpider; i >= ySpider - yFly; i--) {
                    path += a.charAt(0) + Integer.toString(i) + '-';
                }
                for (int i = xSpider; i <= 5; i++) {
                    path += (char) (i + 65) + Integer.toString(yFly) + '-';
                }
                for (int i = 0; i <= xFly; i++) {
                    path += (char) (i + 65) + Integer.toString(yFly) + '-';
                }
            } else {
                for (int i = xSpider; i <= 5; i++) {
                    path += (char) (i + 65) + Integer.toString(ySpider) + '-';
                }
                for (int i = 0; i < xFly; i++) {
                    path += (char) (i + 65) + Integer.toString(ySpider) + '-';
                }
                for (int i = ySpider + 1; i <= yFly; i++) {
                    path += b.charAt(0) + Integer.toString(i) + '-';
                }
            }
        }

        path = path.substring(0, path.length() - 1);

        return path;
    }
    //3
    public static int digitsCount(int a){
        if(a/10!=0)
            return 1+digitsCount(a/10);
        else
            return 1;
    }
    //4
    public static void totalPoints(String[] words, String s1){
        int points = 0;
        //for(int i = 0; i<s1.length();i++)
            //was[i]=false;
        for(int i = 0; i< words.length; i++){
            if(words[i].length()<=s1.length()){
                if(CheckChar(words[i], s1)){
                    switch (words[i].length()){
                        case 3:
                            points++;
                            break;
                        case 4:
                            points+=2;
                            break;
                        case 5:
                            points+=3;
                            break;
                        case 6:
                            points+=54;
                            break;
                        default:
                            points+=0;
                            break;
                    }
                }
            }
        }
        System.out.println(points);
    }
    public static boolean CheckChar(String s1, String s2){
        boolean[] was = new boolean[s2.length()];
        for(int i = 0; i<s2.length();i++)
            was[i]=false;
        for(int i = 0; i<s1.length();i++){
            for(int j = 0; j<s2.length();j++){
                if((s1.charAt(i)==s2.charAt(j)&&!was[j])) {
                    was[j] = true;
                    break;
                }
            }
        }
        int count = 0;
        for(int i = 0;i< was.length;i++) {
            if (was[i])
                count++;
        }
        if(count==s1.length())
            return true;
        return false;
    }
    //5
    public static int longestRun(int[] nums){
        int count = 0;
        int maxCount = 0;
//        count++;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]+1==nums[i+1])
                count++;
            else {
                if(maxCount<count)
                    maxCount = count;
                count = 0;
            }
        }
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]-1==nums[i+1])
                count++;
            else {
                if(maxCount<count)
                    maxCount = count;
                count = 0;
            }
        }
        if(maxCount<count)
            maxCount=count;
        maxCount++;
        return maxCount;
    }
    //6
    public static void takeDownAverage(String[] marks){
        int[] Nums = new int[marks.length];
        int summ = 0;
        for(int i = 0; i<marks.length;i++){
            Nums[i] = Integer.parseInt(marks[i]);
            summ += Nums[i];
        }
        int re = summ/ marks.length;
        re -= 5;
        re -= 5* marks.length;
        System.out.println(re);
    }
    //7
    public static void rearrange(String s1){
        String[] words = s1.split(" ");
        int[] nums = new int[words.length];
        boolean fls = false;
        String[] NewWords = new String[words.length];
        for(int i = 0; i<words.length; i++){
            String str = "";
            for(int j = 0; j<words[i].length();j++){
                if (isDigit(words[i].charAt(j))){
                    str+=words[i].charAt(j);
                }
            }
            nums[i] = Integer.parseInt(str);
           // System.out.println(str);
            NewWords[i] = words[i].replaceFirst(str, "");
           //System.out.println(NewWords[i] + "__" + nums[i]);
        }
        String result = "";
        //boolean isSorted = false;
        int count = 1;
        while(!(count==words.length+1)) {
            for(int i = 0; i<words.length; i++){
                if(nums[i]==count)
                    result+=NewWords[i];
            }
            result+=" ";
            count++;
        }
        System.out.println(result);
    }
    public static boolean isDigit(char a){
        if(a - '0' >-1 && a-'0'<10) {
            //System.out.println(a - '0');
            return true;
        }
        return false;
    }
    //8
    public static void maxPossible(int a, int b){
        boolean last0 = false;
        int cout = 0;
        int temp = a;
        while (temp>0){
            temp/=10;
            cout++;
        }
        int[] numsOfA = new int[cout];
        temp = b;
        cout = 0;
        while (temp>0){
            temp/=10;
            cout++;
        }
        int[] numsOfB = new int[cout];
        for(int i = 0; i<numsOfA.length;i++){
            numsOfA[numsOfA.length-1-i]=a%10;
            a/=10;
        }
        for(int i = 0; i<numsOfB.length;i++){
            numsOfB[i]=b%10;
            b/=10;
        }
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < numsOfB.length-1; i++) {
                if(numsOfB[i] < numsOfB[i+1]){
                    isSorted = false;
                    buf = numsOfB[i];
                    numsOfB[i] = numsOfB[i+1];
                    numsOfB[i+1] = buf;
                }
            }
        }
        for(int i = 0; i<numsOfA.length;i++){
            for(int j = 0; j<numsOfB.length;j++){
                if(numsOfA[i]<numsOfB[j]){
                    numsOfA[i]=numsOfB[j];
                    numsOfB[j]=0;
                }
            }
        }
        String result = "";
        for(int i = 0; i<numsOfA.length;i++){
            result+=numsOfA[i];
        }
        System.out.println(result);
    }
    //9
    public static void timeDifference(String city1, String timestump, String city2){
        String[] city = {"Los Angeles", "New York", "Caracas", "Buenos Aires", "London", "Rome", "" +
                "Moscow","Tehran", "New Delhi","Beijing","Canberra"};
        int[] diffGrinv = {-80, -50, -45, -30, 0, 10, 30, 35, 55, 80, 100};
        boolean newDay = false, newMonth = false, newYear = false,newHour=false;
        String[] MonthDayYearTime = timestump.split(" ");
        //time;
        String[] time = MonthDayYearTime[MonthDayYearTime.length-1].split(":");
        int hour = Integer.parseInt(time[0]), minute = Integer.parseInt(time[1]);
        int realdiff = 0;
        int GDiffCity2 = 0;
        for(int i = 0; i<city.length;i++){
            if(city[i].equals(city1)){
                realdiff=diffGrinv[i];
            }
            if(city[i].equals(city2)){
                GDiffCity2=diffGrinv[i];
            }
        }
        if(GDiffCity2>0&&realdiff<0){
            realdiff = realdiff-GDiffCity2;
            realdiff=Math.abs(realdiff);
        }
        else if(realdiff==0){
            realdiff=GDiffCity2;
        }
        else if(realdiff>0&&GDiffCity2<0){
            realdiff+=Math.abs(GDiffCity2);
            realdiff*=-1;
        }
        else if(GDiffCity2==realdiff){
            System.out.println(timestump);//change to answer please
        }
        hour+=realdiff/10;
        minute+=30*(realdiff%10);
        String DAY = MonthDayYearTime[1].replaceFirst(",", "");
        int day = Integer.parseInt(DAY), year = Integer.parseInt(MonthDayYearTime[2]),
            month=WhatMonth(MonthDayYearTime[0]);
        if(minute>59){
            newHour=true;
            minute-=60;
        }
        if(newHour){
            hour++;
        }
        if(hour>23){
            newDay=true;
            hour-=24;
        }
        if(newDay){
            day++;
        }
        if(month==2){
            if(year%4!=0){
                if(day>29){
                    newMonth=true;
                }
            }
            else{
                if(day>28){
                    newMonth=true;
                }
            }
        }
        else if(month%2!=0||month==8){
            if(day>31){
                newMonth=true;
            }
        }
        else{
            if(day>30){
                newMonth=true;
            }
        }
        if(newMonth) {month++;
            day = 1;
        }
        if(month>12){
            newYear = true;
            month=1;
        }
        if(newYear) year++;
        String result = "";
        result= year+"-"+month+"-"+day;
        result += " ";
        if(hour<10)
            result+="0";
        result+=hour+":";
        if(minute<10)
            result+="0";
        result+=minute;
        System.out.println(result);
    }
    public static int WhatMonth(String month){
        String[] Months = {"January", "February", "March","April", "May", "June",
                "July","August","September","October","November","December"};
        int result = 0;
        for(int i = 0; i<Months.length;i++){
            if(month.equals(Months[i]))
                result = i;
        }
        result++;
        //System.out.println("whatMonth is " + result);
        return result;
    }
    //10
    public static boolean isNew(int a){
        int temp = a;
        int[] Nums = new int[digitsCount(a)];
        int cont = 0;
        for(int i = 0; i<Nums.length;i++){
            Nums[i] = temp%10;
            temp/=10;
        }
        int buf;
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < Nums.length-1; i++) {
                if(Nums[i] > Nums[i+1]){
                    isSorted = false;
                    buf = Nums[i];
                    Nums[i] = Nums[i+1];
                    Nums[i+1] = buf;
                }
            }
        }
        String NewA = "";
        if(Nums[0] == 0){
            int count = 1;
            while(Nums[0]==0){
                if(Nums[count]!=0){
                    Nums[0] = Nums[count];
                    Nums[count] = 0;
                }
                count++;
            }
        }
        for(int i = 0; i<Nums.length;i++){
            NewA +=Nums[i];
        }
        if(Integer.parseInt(NewA)==a)
            return true;
        return false;
       // System.out.println(a+"__"+NewA);
    }
}
