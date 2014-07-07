package ru.crazair;

import static org.junit.Assert.*;
import static java.lang.Math.*;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.crazair.rjt.RtriangleProvider;
import ru.crazair.rjt.Triangle;

/**
 * @author crazair
 */
public class RtriangleTest {

    private static Triangle triangle;

    @BeforeClass
    public static void setUp() {
        triangle = (Triangle) RtriangleProvider.getRtriangle();
    }

    @Test
    public void testRtrianglePythagoras() {
        double firstSideLength  = triangle.getSortedSides()[0];
        double secondSideLength = triangle.getSortedSides()[1];
        double thirdSideLength  = triangle.getSortedSides()[2]; // гипотенуза

        assertFalse("Triangle is not correct, side length equals 0: " + triangle,
                firstSideLength == 0 || secondSideLength == 0 || thirdSideLength == 0);

        assertTrue("Triangle is not right, Pythagoras in sorrow: " + triangle,
                round(pow(firstSideLength, 2) + pow(secondSideLength, 2)) == round(pow(thirdSideLength, 2)));
    }
}
