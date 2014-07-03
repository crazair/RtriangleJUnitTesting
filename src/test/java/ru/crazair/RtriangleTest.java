package ru.crazair;

import static org.junit.Assert.*;
import static java.lang.Math.*;
import org.junit.Before;
import org.junit.Test;
import ru.crazair.rjt.RtriangleProvider;
import ru.crazair.rjt.Triangle;

/**
 * @author crazair
 */
public class RtriangleTest {

    Triangle triangle;

    @Before
    public void setUp() {
        triangle = (Triangle) RtriangleProvider.getRtriangle();
    }

    @Test
    public void testRtrianglePythagoras() {
        double firstSideLength  = triangle.getSortedSides()[0];
        double secondSideLength = triangle.getSortedSides()[1];
        double thirdSideLength  = triangle.getSortedSides()[2]; // hypotenuse

        assertFalse("Triangle is not correct, all side length equals 0: " + triangle,
                firstSideLength == 0 && secondSideLength == 0 && thirdSideLength == 0);
        
        assertFalse("Duplicates the vertex coordinates of the triangle: " + triangle, 
                ((triangle.getApexX1() == triangle.getApexX2()) && (triangle.getApexY1() == triangle.getApexY2())) ||
                ((triangle.getApexX2() == triangle.getApexX3()) && (triangle.getApexY2() == triangle.getApexY3())) ||
                ((triangle.getApexX3() == triangle.getApexX1()) && (triangle.getApexY3() == triangle.getApexY1())));

        assertTrue("Triangle is not right, Pythagoras in sorrow: " + triangle,
                round(pow(firstSideLength, 2) + pow(secondSideLength, 2)) == round(pow(thirdSideLength, 2)));
    }
}
