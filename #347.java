import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        boolean zero = false;

        for (int i=0, x; i<N; ++i){
            x = sc.nextInt();

            if (x == 0){
                zero = true;
            }
        }

        System.out.println(zero ? "YES" : "NO");
    }
}