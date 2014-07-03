package ru.crazair.rjt;

import static java.lang.Math.*;

/**
 * @author crazair
 */

@SuppressWarnings("FieldMayBeFinal")
public class Triangle implements Rtriangle {

    // coordinates
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    
    // sides length
    private double firstSideLength;
    private double secondSideLength;
    private double thirdSideLength;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

        setSidesLength();
    }

    public Triangle(int[] coordinates) {
        this.x1 = coordinates[0];
        this.y1 = coordinates[1];
        this.x2 = coordinates[2];
        this.y2 = coordinates[3];
        this.x3 = coordinates[4];
        this.y3 = coordinates[5];
        
        setSidesLength();
    }

    private void setSidesLength() {
        firstSideLength  = sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
        secondSideLength = sqrt(pow(x2 - x3, 2) + pow(y2 - y3, 2));
        thirdSideLength  = sqrt(pow(x1 - x3, 2) + pow(y1 - y3, 2));
    }
    
    public double[] getSortedSides(){
        double[] sides = new double[]{firstSideLength,
                                      secondSideLength,
                                      thirdSideLength};
        java.util.Arrays.sort(sides);
        return sides;
    }

    public int getApexX1() {
        return x1;
    }

    public int getApexY1() {
        return y1;
    }

    public int getApexX2() {
        return x2;
    }

    public int getApexY2() {
        return y2;
    }

    public int getApexX3() {
        return x3;
    }

    public int getApexY3() {
        return y3;
    }

    public double getFirstSideLength() {
        return firstSideLength;
    }

    public double getSecondSideLength() {
        return secondSideLength;
    }

    public double getThirdSideLength() {
        return thirdSideLength;
    }

    @Override
    public String toString() {
        return "Triangle{" + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", x3=" + x3 + ", y3=" + y3
                + ", firstSideLength="  + firstSideLength
                + ", secondSideLength=" + secondSideLength
                + ", thirdSideLength="  + thirdSideLength + '}';
    }

}
