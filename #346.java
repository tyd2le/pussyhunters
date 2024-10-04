import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int zero = 0, positive = 0, negative = 0;

        for (int i=0, x; i<N; ++i){
            x = sc.nextInt();

            if (x == 0){
                ++zero;
            }
            else if (x > 0){
                ++positive;
            }
            else{
                ++negative;
            }
        }

        System.out.println(zero + " " + positive + " " + negative);
    }
}