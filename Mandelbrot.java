import java.awt.geom.Rectangle2D;

public class Mandelbrot extends  FractalGenerator{
    public static final int MAX_ITERATION = 2000;

    public void getInitialRange(Rectangle2D.Double range){
        range.x = -2;
        range.y = -1.5;
        range.width = 3;
        range.height = 3;
    }

    public int numIterations(double x, double y){
        int i =0;
        double zR=0;
        double zI =0;

        while (i < MAX_ITERATION && zR * zR + zI *zI <4){
            double tempZR = zR * zR -zI*zI+x;
            double tempZI = 2*zR*zI+y;
            zR=tempZR;
            zI=tempZI;
            i++;
        }
        if (i==MAX_ITERATION){
            return -1;
        }
        return i;
    }

}