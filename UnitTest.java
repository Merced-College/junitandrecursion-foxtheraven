//Xandra Quevedo
//10-28-25
//Recursion & JUnit

public class UnitTest {
    
    //Testing CountHi method:
    //first JUnit test
    @org.junit.Test
    public void testCountHi1() {
        int result = RecursionTest.countHi("xxhixxxxhixxxx");
        org.junit.Assert.assertEquals(2, result);
    }
    //second JUnit test
    @org.junit.Test
    public void testCountHi2() {
        int result = RecursionTest.countHi("aklhdajskhd");
        org.junit.Assert.assertEquals(0, result);
    }
    //third JUnit test
    @org.junit.Test
    public void testCountHi3() {
        int result = RecursionTest.countHi("hihihihihi");
        org.junit.Assert.assertEquals(5, result);
    }
    //fourth JUnit test
    @org.junit.Test
    public void testCountHi4() {
        int result = RecursionTest.countHi("hihihihieeee");
        org.junit.Assert.assertEquals(4, result);
    }
    //fifth JUnit test
    @org.junit.Test
    public void testCountHi5() {
        int result = RecursionTest.countHi("");
        org.junit.Assert.assertEquals(0, result);
    }
    //sixth JUnit test
    @org.junit.Test
    public void testCountHi6() {
        int result = RecursionTest.countHi(null);
        org.junit.Assert.assertEquals(0, result);
    }

//----------------------------------------------------

    //Testing strCount method:
    //first JUnit test
    @org.junit.Test
    public void testStrCount1() {
        int result = RecursionTest.strCount("catcowcat", "cat");
        org.junit.Assert.assertEquals(2, result);
    }
    //second JUnit test
    @org.junit.Test
    public void testStrCount2() {
        int result = RecursionTest.strCount("cowmewdog", "cat");
        org.junit.Assert.assertEquals(0, result);
    }
    //third JUnit test
    @org.junit.Test
    public void testStrCount3() {
        int result = RecursionTest.strCount("catcatcatcatcat", "cat");
        org.junit.Assert.assertEquals(5, result);
    }
    //fourth JUnit test
    @org.junit.Test
    public void testStrCount4() {
        int result = RecursionTest.strCount(null, "cat");
        org.junit.Assert.assertEquals(0, result);
    }
    //fifth JUnit test
    @org.junit.Test
    public void testStrCount5() {
        int result = RecursionTest.strCount("", "cat");
        org.junit.Assert.assertEquals(0, result);
    }

}
