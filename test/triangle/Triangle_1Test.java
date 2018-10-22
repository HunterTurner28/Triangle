/*
 * Hunter Turner
 */
package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author htt1
 */
public class Triangle_1Test 
{    
    public Triangle_1Test() 
    {
    }

    
    @Test
    public void testRightTriangleOne() 
    {
        float base = 3;
        float height = 4;
        float hypo = 5;
        boolean expected = true;
        Triangle_1 instance = new Triangle_1(base, height, hypo);
        boolean result = instance.isRightTriangle();
        assertEquals(expected, result);
    }
    @Test
    public void testRightTriangleTwo() 
    {
        float base = 3;
        float height = 4;
        float hypo = 4;
        boolean expected = true;
        Triangle_1 instance = new Triangle_1(base, height, hypo);
        boolean result = instance.isRightTriangle();
        assertEquals(expected, result);
    }
    @Test
    public void testCalcArea()
    {
        float base = 3;
        float height = 4;
        float hypo = 5;
        float expected = 6;
        Triangle_1 instance = new Triangle_1(base, height, hypo);
        float result = instance.calcArea();
        assertEquals(expected, result, 0.0);
    }
    @Test
    public void testCalcPerimeter()
    {
        float base = 3;
        float height = 4;
        float hypo = 5;
        float expected = 12;
        Triangle_1 instance = new Triangle_1(base, height, hypo);
        float result = instance.calcPerimeter();
        assertEquals(expected, result, 0.0);
    }
}
