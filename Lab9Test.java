
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Lab9Test
{
    /* ---------- TESTS FOR digitAt ----------*/
    /* digitAt should take a number (int) and a 
     * "place" (1s, 10s, 100s, etc.) given as an int
     * and return the digit in the number at that place
     */
    
    @Test
    public void test01() {
        assertEquals(Lab9.digitAt(1023,1), 3);
    }
    
    @Test
    public void test02() {
        assertEquals(Lab9.digitAt(1023,10), 2);
    }
    
    @Test
    public void test03() {
        assertEquals(Lab9.digitAt(1023,100), 0);
    }
    
    @Test
    public void test04() {
        assertEquals(Lab9.digitAt(1023,1000), 1);
    }
    
    @Test
    public void test05() {
        assertEquals(Lab9.digitAt(1023,10000), 0);
    }
    
    @Test
    public void test06() {
        assertEquals(Lab9.digitAt(-1023,10), 2);
    }
    
    @Test
    public void test07() {
        assertEquals(Lab9.digitAt(-23,100), 0);
    }

    // 1st self-test, indexoutofboundstest
    @Test 
    public void myTest01(){
        assertTrue(Lab9.digitAt(-23589, 10000000) == 0);
    }
    
    /* ---------- TESTS FOR maxElement ----------*/
    /* maxElement should take an array of items
     * and return the max element from that array of items
     */
    
    @Test
    public void test08() {
        Integer[] myInts = {6, 2, 10, 5, 1};
        Integer expected = 10;
        assertEquals(Lab9.maxElement(myInts), expected);
    }
    
    @Test
    public void test09() {
        Integer[] myInts = {Integer.MAX_VALUE, 2, 6, 5, 1};
        Integer expected = Integer.MAX_VALUE;
        assertEquals(Lab9.maxElement(myInts), expected);
    }
    
    @Test
    public void test10() {
        Double[] myDoubles = {null, 2.1, 10.1, 5.6, 10.2};
        Double expected = 10.2;
        assertEquals(Lab9.maxElement(myDoubles), expected);
    }
    
    @Test
    public void test11() {
        Integer[] myInts = {-6, -2, -1, -5, -10};
        Integer expected = -1;
        assertEquals(Lab9.maxElement(myInts), expected);
    }
    
    @Test
    public void test12() {
        Integer[] myInts = {-6, 2, 1, -5, -10};
        Integer expected = 2;
        assertEquals(Lab9.maxElement(myInts), expected);
    }
    
    @Test
    public void test13() {
        Integer[] myInts = {-6};
        Integer expected = -6;
        assertEquals(Lab9.maxElement(myInts), expected);
    }
    
    @Test
    public void test14() {
        String[] myStrings = {"april", "showers", "bring", "may", "flowers"};
        String expected = "showers";
        assertEquals(Lab9.maxElement(myStrings), expected);
    }
    
    @Test
    public void test15() {
        String[] myStrings = {"april", null, "bring", null, "flowers"};
        String expected = "flowers";
        assertEquals(Lab9.maxElement(myStrings), expected);
    }
    
    @Test
    public void test16() {
        String[] myStrings = {};
        String expected = null;
        assertNull(Lab9.maxElement(myStrings), expected);
    }

    // 2nd self-test, testing null in middle of Integer array
    @Test 
    public void myTest02(){
        Integer [] myInts = {2, 5, 6, 8, null, 7, 8};
        Integer expected = 8;
        assertEquals(expected,Lab9.maxElement(myInts));

    }
}
