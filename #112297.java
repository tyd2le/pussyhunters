import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<N; ++i) {
            list.add(sc.nextInt());
        }

        for (int i=0, x; i<N/2; ++i){
            x = list.get(i);
            list.set(i, list.get(N-i-1));
            list.set(N-i-1, x);
        }

        for (int i=0; i<N; ++i){
            System.out.print(list.get(i) + " ");
        }
    }
}