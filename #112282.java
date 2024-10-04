import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();

        int cnt = 0;

        int i = 0, random, sum = 0;
        int array[] = new int[N];

        while (i < N) {
            random = A + (int)(Math.random() * (B - A + 1));
            array[i] = random;

            sum += random;
            ++i;
        }

        i = 0;
        while (i < N) {
            System.out.print(array[i] + " ");
            ++i;
        }
        System.out.println("\n"+(double)(sum)/(double)(N));
    }
}