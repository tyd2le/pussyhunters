import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        double number = (double)(a+b+c)/3;
        String formatted = String.format("%.3f", number);

        System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
        System.out.println(a+"*"+b+"*"+c+"="+(a*b*c));
        System.out.println("("+a+"+"+b+"+"+c+")/3="+formatted);
    }
}