import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int array[] = new int[N];
        array[0] = 1;

        if (N == 1){
            System.out.println(array[0]);
            System.exit(0);
        }
        array[1] = 1;

        int i = 2;
        while (i < N){
            array[i] = array[i - 1] + array[i - 2];
            ++i;
        }

        i = 0;
        while (i < N){
            System.out.print(array[i] + " ");
            ++i;
        }
    }
}