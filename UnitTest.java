//Xandra Quevedo
//10-28-25
//Recursion & JUnit

//Note: Generally, test expected cases as well as edge cases
//ie full of the expected condition, void of the expected condition,
//and null
public class UnitTest {
    
    //Testing CountHi method:
    //1
    @org.junit.Test
    public void test1CountHi() {
        int result = RecursionTest.countHi("xxhixxxxhixxxx");
        org.junit.Assert.assertEquals(2, result);
    }
    //2
    @org.junit.Test
    public void test2CountHi() {
        int result = RecursionTest.countHi("aklhdajskhd");
        org.junit.Assert.assertEquals(0, result);
    }
    //3
    @org.junit.Test
    public void test3CountHi() {
        int result = RecursionTest.countHi("hihihihihi");
        org.junit.Assert.assertEquals(5, result);
    }
    //4
    @org.junit.Test
    public void test4CountHi() {
        int result = RecursionTest.countHi("hihihihieeee");
        org.junit.Assert.assertEquals(4, result);
    }
    //5
    @org.junit.Test
    public void test5CountHi() {
        int result = RecursionTest.countHi("");
        org.junit.Assert.assertEquals(0, result);
    }
    //6
    @org.junit.Test
    public void test6CountHi() {
        int result = RecursionTest.countHi(null);
        org.junit.Assert.assertEquals(0, result);
    }

//----------------------------------------------------

    //Testing strCount method:
    //1
    @org.junit.Test
    public void test1StrCount() {
        int result = RecursionTest.strCount("catcowcat", "cat");
        org.junit.Assert.assertEquals(2, result);
    }
    //2
    @org.junit.Test
    public void test2StrCount() {
        int result = RecursionTest.strCount("cowmewdog", "cat");
        org.junit.Assert.assertEquals(0, result);
    }
    //3
    @org.junit.Test
    public void test3StrCount() {
        int result = RecursionTest.strCount("catcatcatcatcat", "cat");
        org.junit.Assert.assertEquals(5, result);
    }
    //4
    @org.junit.Test
    public void test4StrCount() {
        int result = RecursionTest.strCount(null, "cat");
        org.junit.Assert.assertEquals(0, result);
    }
    //5
    @org.junit.Test
    public void test5StrCount() {
        int result = RecursionTest.strCount("", "cat");
        org.junit.Assert.assertEquals(0, result);
    }

//----------------------------------------------------

    //Testing countHi2 method:
    //1
    @org.junit.Test
    public void test1CountHi2() {
        int result = RecursionTest.countHi2("axhibxhiaahibbhi");
        org.junit.Assert.assertEquals(2, result);
    }
    //2
    @org.junit.Test
    public void test2CountHi2() {
        int result = RecursionTest.countHi2("asdjkashski");
        org.junit.Assert.assertEquals(0, result);
    }
    //3
    @org.junit.Test
    public void test3CountHi2() {
        int result = RecursionTest.countHi2("xhixhixhixhixhi");
        org.junit.Assert.assertEquals(0, result);
    }
    //4
    @org.junit.Test
    public void test4CountHi2() {
        int result = RecursionTest.countHi2("hi");
        org.junit.Assert.assertEquals(1, result);
    }
    //5
    @org.junit.Test
    public void test5CountHi2() {
        int result = RecursionTest.countHi2("x");
        org.junit.Assert.assertEquals(0, result);
    }

//----------------------------------------------------

    //Testing stringClean method
    //1
    @org.junit.Test
    public void test1StringClean() {
        String result = RecursionTest.stringClean("aabbbcedd");
        org.junit.Assert.assertEquals("abced", result);
    }
    //2
    @org.junit.Test
    public void test2StringClean() {
        String result = RecursionTest.stringClean("aaaaaaaaaab");
        org.junit.Assert.assertEquals("ab", result);
    }
    //3
    @org.junit.Test
    public void test3StringClean() {
        String result = RecursionTest.stringClean("dhgskdjdjd");
        org.junit.Assert.assertEquals("dhgskdjdjd", result);
    }
    //4
    @org.junit.Test
    public void test4StringClean() {
        String result = RecursionTest.stringClean("eeeeeeeeeeeeeeeeeee");
        org.junit.Assert.assertEquals("e", result);
    }
    //5
    @org.junit.Test
    public void test5StringClean() {
        String result = RecursionTest.stringClean("");
        org.junit.Assert.assertEquals("", result);
    }

//----------------------------------------------------

    //Testing count8 method
    //1
    @org.junit.Test
    public void test1Count8() {
        int result = RecursionTest.count8(818188);
        org.junit.Assert.assertEquals(5, result);
    }
    //2
    @org.junit.Test
    public void test2Count8() {
        int result = RecursionTest.count8(111111);
        org.junit.Assert.assertEquals(0, result);
    }
    //3
    @org.junit.Test
    public void test3count8() {
        int result = RecursionTest.count8(888888);
        org.junit.Assert.assertEquals(11, result);
    }
    //4
    @org.junit.Test
    public void test4Count8() {
        int result = RecursionTest.count8(0);
        org.junit.Assert.assertEquals(0, result);
    }
    //5
    @org.junit.Test
    public void test5Count8() {
        int result = RecursionTest.count8(8);
        org.junit.Assert.assertEquals(1, result);
    }

//----------------------------------------------------

}//end class
