import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int array[] = new int[N];
        int even_cnt = 0;

        for (int i=0; i<N; ++i){
            array[i] = sc.nextInt();
            if (array[i] % 2 == 0){
                ++even_cnt;
            }
        }

        int even_numbers[] = new int[even_cnt];

        for (int i=0, j=0; i<N; ++i){
            if (array[i] % 2 == 0){
                even_numbers[j++] = array[i];
            }
        }

        for (int i=0; i<even_cnt; ++i){
            System.out.print(even_numbers[i] + " ");
        }
    }
}