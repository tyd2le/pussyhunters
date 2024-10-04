import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; ++i) {
            list.add(sc.nextInt());
        }
        int K = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<Integer> list1 = new ArrayList<>();

        for (Integer x : list) {
            if (x > 99 && x < 1000 && x % K == 0 && x % M != 0) {
                list1.add(x);
            }
        }

        if (!list1.isEmpty()) {
            for (Integer x : list1) {
                System.out.print(x + " ");
            }
        }
        else{
            System.out.print(0);
        }
    }
}