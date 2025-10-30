//Xandra Quevedo
//10-28-25
//Recursion & JUnit

public class RecursionTest {

    public static void main (String[] args) {

        System.out.println(countHi("xxhixxxxhixxxx"));
        System.out.println(strCount("catcowcat", "cat"));
        System.out.println();

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

    public static int countHi2(String str) {

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
        char thirdLetter = str.charAt(2);
        if (firstLetter == 'x' && secondLetter == 'h' && thirdLetter == 'i') {
            return 0 + countHi(str.substring(3));
        }
        if (firstLetter == 'h' && secondLetter == 'i') {
            return 1 + countHi(str.substring(2));
        }
        else {
            return countHi(str.substring(1));
        }

    }
    
//----------------------------------------------------

    //recursive problem 2
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

}//end class