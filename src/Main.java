import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] c;
        c = new int[7];
        int d = 6;
        int i = 0;
        while(d<=18) {
            c[i] = d;
            d+=2;
            i+=1;
        }
        float[] x;
        x = new float[15];
        for (i = 0; i<15; i++) {
            x[i] = random.nextFloat((float)-11.0, (float)9.0);
        }
        double[][] result;
        result = new double[7][15];
        for (i = 0; i<7; i++) {
            for (int j = 0; j<15; j++) {
                if (c[i]==10) {
                    result[i][j] = Math.pow(Math.log(Math.pow(Math.sin(x[j]), 2))/(Math.log(Math.abs(x[j])))-1, 3);
                }
                else if(c[i]==6 || c[i]==14 || c[i]==18) {
                    result[i][j] = Math.sin(Math.pow(Math.cbrt(x[j]), (0.25/(Math.cos(x[j])-1))));
                } else {
                    result[i][j] = Math.tan(Math.pow(0.25/Math.sin(Math.asin((x[j]-1)/2*Math.E + 1)),3));
                }
            }
        }

        for (i = 0; i<7; i++) {
            for (int j = 0; j < 15; j++) {
                String pr= String.format("%.3f ", result[i][j]);
                pr = String.format("%-10s", pr);
                System.out.printf(pr);
            }
            System.out.println();
        }
    }
}