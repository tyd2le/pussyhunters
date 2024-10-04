import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double r = scan.nextInt();
        
        double S = Math.PI * (r*r);
        double l = 2 * Math.PI * r;
        
        String ans1 = String.format("%.3f", S);
        String ans2 = String.format("%.3f", l);
        
        System.out.println(ans1);
        System.out.println(ans2);
    }
}