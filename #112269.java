import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int D = sc.nextInt();
        int N = sc.nextInt();

        int i = 0;
        while (i < N){
            ++i;
            System.out.print(X + " ");
            X += D; 
        }
    }
}