import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        
        double a = Math.abs(x1-x2);
        double b = Math.abs(y1-y2);
        
        double ans = Math.sqrt(a*a+b*b);
        String realans = String.format("%.3f", ans);
        // lol
        System.out.println(realans);
    }
}
