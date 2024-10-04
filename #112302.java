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

        int R = sc.nextInt();

        for (int i=N-R; i<N; ++i){
            System.out.print(list.get(i) + " ");
        }
        for (int i=0; i<N-R; ++i){
            System.out.print(list.get(i) + " ");
        }
    }
}