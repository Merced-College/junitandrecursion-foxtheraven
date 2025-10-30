//Xandra Quevedo
//10-28-25
//Recursion & JUnit

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
    public void test1CountHi3() {
        int result = RecursionTest.countHi2("xhixhixhixhixhi");
        org.junit.Assert.assertEquals(0, result);
    }

}//end class
