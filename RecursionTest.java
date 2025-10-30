//Xandra Quevedo
//10-28-25
//Recursion & JUnit

public class RecursionTest {

    public static void main (String[] args) {

        //First tests for each method
        System.out.println(countHi("xxhixxxxhixxxx"));
        System.out.println(strCount("catcowcat", "cat"));
        System.out.println(countHi2("ahixhi"));
        System.out.println(stringClean("yyzzza"));
        System.out.println(count8(8818));

    }//end main

//----------------------------------------------------

    //recursive problem 1
    public static int countHi(String str) {

        //check for null
        if (str == null) {
            return 0;
        }

        //base case
        if (str.length() <= 1) {
            return 0;
        }

        char firstLetter = str.charAt(0);
        char secondLetter = str.charAt(1);
        if (firstLetter == 'h' && secondLetter == 'i') {
            return 1 + countHi(str.substring(2));
        }
        else {
            return countHi(str.substring(1));
        }

    }//end countHi method

//----------------------------------------------------

    //recursive problem 2
    public static int countHi2(String str) {
        //"Old-fashioned" debugging line    
        //System.out.println(str);

        //check for null
        if (str == null) {
            return 0;
        }

        //base case
        if (str.length() <= 1) {
            return 0;
        }

        char firstLetter = str.charAt(0);
        char secondLetter = str.charAt(1);
        if (str.length() == 2) {
            if (firstLetter == 'h' && secondLetter == 'i') {
                return 1 + countHi2(str.substring(2));
            }
            else {
                return 0 + countHi2(str.substring(2));
            }
        }
        char thirdLetter = str.charAt(2);

        if (firstLetter == 'x' && secondLetter == 'h' && thirdLetter == 'i') {
            return 0 + countHi2(str.substring(3));
        }
        else if (firstLetter == 'h' && secondLetter == 'i') {
            return 1 + countHi2(str.substring(2));
        }
        else {
            return countHi2(str.substring(1));
        }

    }//end countHi2 method
    
//----------------------------------------------------

    //recursive problem 3
    public static int strCount(String str, String sub) {

        //check if null
        if (str == null || sub == null) {
            return 0;
        }

        //base case
        if (str.length() < sub.length()) {
            return 0;
        }

        int subLength = sub.length();
        if (str.substring(0, subLength).equals(sub)){
            return 1 + strCount(str.substring(subLength), sub);
        }
        return strCount(str.substring(1), sub);

    }//end strCount method

//----------------------------------------------------

    //recursive problem 4
    public static  String stringClean(String str) {
        
        //check for null
        if (str == null) {
            return null;
        }

        //base case
        if (str.length() <= 1) {
            return str;
        }

        //Remember you can add chars to strings
        char firstLetter = str.charAt(0);
        char secondLetter = str.charAt(1);
        if (firstLetter == secondLetter) {
            return stringClean(str.substring(1));
        }
        else {
            return firstLetter + stringClean(str.substring(1));
        }
        
    }//end stringClean method

//----------------------------------------------------

    //recursive problem 5
    public static int count8(int n) {

        //base case
        if (n == 0) {
            return 0;
        }

        int nRemoved = (n / 10);

        if (n % 10 == 8 && nRemoved % 10 == 8) {
            return 2 + count8(nRemoved);
        }
        else if (n % 10 == 8) {
            return 1 + count8(nRemoved);
        }
        else {
            return 0 + count8(nRemoved);
        }

    }//end count8 method

//----------------------------------------------------

}//end class