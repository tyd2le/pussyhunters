import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int i = 1;
        int array[] = new int[N];
        array[0] = 2;

        while (i < N) {
            array[i] = array[i - 1] * 2;
            ++i;
        }

        --i;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            --i;
        }
    }
}