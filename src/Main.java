import pakett.Rkylik;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Tere! Sisesta palun ristküliku üks külg.");
        Scanner scanner=new Scanner(System.in);
        double kylgA = scanner.nextInt();
        Rkylik objekt = new Rkylik(kylgA);
        objekt.valjastaSisu();
    }
}
