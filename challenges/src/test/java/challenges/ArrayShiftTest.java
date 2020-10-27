//package challenges;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class ArrayShiftTest {
//    int[] evenTest = {2,3};
//    int[] oddTest = {3, 5, 7};
//    int[] emptyTest = new int[0];
//
//    @Test public void testEvenArray(){
//        ArrayShift testForEven = new ArrayShift();
//        assertArrayEquals(new int[]{2,5,3},testForEven.insertShiftArray(evenTest, 5));
//    }
//
//    @Test public void testOddArray(){
//        ArrayShift testForOdd = new ArrayShift();
//        assertArrayEquals(new int[]{3,5,9,7},testForOdd.insertShiftArray(oddTest, 9));
//    }
//
//    @Test public void testEmptyArray(){
//        ArrayShift testEmpty = new ArrayShift();
//        assertArrayEquals(new int[]{5},testEmpty.insertShiftArray(emptyTest, 5));
//    }
//
//}