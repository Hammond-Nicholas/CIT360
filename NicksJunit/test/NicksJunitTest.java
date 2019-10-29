/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import nicksjunit.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Nick Hammond
 */
public class NicksJunitTest {
    
    public NicksJunitTest() {
    }
       
    @Test
    public void unitTest1() {
        System.out.println("unitTest1");
        int percent = 50;
        int expResult = 50;
        int result = CalcNumbers.calcPercent(percent);
        assertEquals(expResult, result);
    }
    
    @Test
    public void unitTest2() {
        System.out.println("unitTest2");
        int percent = -40;
        int expResult = -1;
        int result = CalcNumbers.calcPercent(percent);
        assertTrue(expResult == result);
    }
    
    @Test
    public void unitTest3() {
        System.out.println("unitTest3");
        int percent = 105;
        int expResult = -1;
        int result = CalcNumbers.calcPercent(percent);
        assertFalse(expResult != result);
    }
    
    @Test
    public void unitTest4() {
        System.out.println("unitTest4");
        int percent = 105;
        int result = CalcNumbers.calcPercent(percent);
        assertNotNull(result);
    }
    
    @Test
    public void unitTest5() {
        System.out.println("unitTest5");
        assertNull(CalcNumbers.nullObj);
    }
        
    @Test
    public void unitTest6() {
        System.out.println("unitTest6");
        int percent1 = 105;
        int percent2 = 105;
        int result1 = CalcNumbers.calcPercent(percent1);
        int result2 = CalcNumbers.calcPercent(percent2);
        assertSame(result1, result2);
    }
    
    @Test
    public void unitTest7() {
        System.out.println("unitTest7");
        int percent1 = 105;
        int percent2 = 35;
        int result1 = CalcNumbers.calcPercent(percent1);
        int result2 = CalcNumbers.calcPercent(percent2);
        assertNotSame(result1, result2);
    }
    
    @Test
    public void unitTest8() {
        System.out.println("unitTest8");
        int percent1 = 105;
        int percent2 = 105;
        int[] result1 = {CalcNumbers.calcPercent(percent1)};
        int[] result2 = {CalcNumbers.calcPercent(percent2)};
        assertArrayEquals(result1, result2);
    }
}
