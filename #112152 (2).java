import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        
        for (int i=0; i<5; ++i){
            double random = a + (Math.random()*(b-a+0.001));
            String realrandom = String.format("%.3f", random);
            System.out.print(realrandom + " ");
        }
    }
}
