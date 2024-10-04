import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean bool = (a > 0 && b > 0) || (a < 0 && b < 0);

        a = Math.abs(a);
        b = Math.abs(b);

        if (a < b) {
            a = getItself(b, b = a);
        }

        int sum = 0;

        for (int i=0; i<b; ++i){
            sum += a;
        }

        System.out.println((bool?1:-1)*sum);
    }

    public static int getItself(int itself, int dummy)
    {
        return itself;
    }
}