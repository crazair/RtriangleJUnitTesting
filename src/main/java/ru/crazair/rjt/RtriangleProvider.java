package ru.crazair.rjt;

/**
 * @author crazair
 */
public class RtriangleProvider {

    private static final int[] COORDINATESRIGHTTRIANGLE = {0, 0, 0, 5, 2, 0};
    
    private static Rtriangle rtriangle = new Triangle(COORDINATESRIGHTTRIANGLE);

    public static Rtriangle getRtriangle() {
        return rtriangle;
    }

    public static void setRtriangle(Rtriangle rtriangle) {
        RtriangleProvider.rtriangle = rtriangle;
    }

}
