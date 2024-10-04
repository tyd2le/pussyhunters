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

        for (int i=0, x; i+1<N; i+=2){
            x = list.get(i);
            list.set(i, list.get(i+1));
            list.set(i+1, x);
        }

        for (int i=0; i<N; ++i){
            System.out.print(list.get(i) + " ");
        }
    }
}