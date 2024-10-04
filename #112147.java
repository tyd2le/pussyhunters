import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double a = scan.nextDouble();
        double b = a * a;
        
        a = b;
        a = a * a;
        a = a * a;
        
        String ans = String.format("%.3f", a*b);
        
        System.out.println(ans);
    }
}