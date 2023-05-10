package pakett;
import java.util.concurrent.ThreadLocalRandom;
public class Rkylik {
    
    public double kylgA;
    public double kylgB;
    
    public Rkylik(double sisend) {
        kylgA = sisend;
        kylgB = ThreadLocalRandom.current().nextInt(1,10);
    }
    private double ymberMoot(){
        return (2*(kylgA+kylgB));
    }
    private double pindala(){
        return (kylgA*kylgB);
    }
    private double diagonaal(){
        return (Math.sqrt((kylgA*kylgA)+(kylgB*kylgB)));
    }
    public void valjastaSisu(){
        System.out.printf("Ristküliku andmed on järgmised:\n");
        System.out.printf("külg A (sisestatud) %11.2f\n", kylgA);
        System.out.printf("külg B (genereeritud) %9.2f\n", kylgB);
        System.out.printf("ümbermõõt %21.2f\n", ymberMoot());
        System.out.printf("diagonaal %21.2f\n", diagonaal());
        System.out.printf("pindala %23.2f\n", pindala());
    }
}
