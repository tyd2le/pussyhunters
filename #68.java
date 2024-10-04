import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int array[] = new int[N];

        for (int i = 0; i < N; ++i) {
            array[i] = sc.nextInt();
        }

        int cnt = 0;

        for (int i = 1; i+1 < N; ++i) {
            if (array[i] > array[i-1] && array[i] > array[i+1]) {
                ++cnt;
            }
        }

        System.out.println(cnt);
    }
}