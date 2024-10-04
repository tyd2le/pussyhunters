import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        boolean check = false;

        for (int i = 0; i < N; i++) {
            if (list.get(i) > 0 && list.get(i) % 2 == 0){
                check = true;
                mn = Math.min(list.get(i), mn);
                mx = Math.max(list.get(i), mx);
            }
        }

        System.out.print(check ? mn + " " + mx : "-1 -1");
    }
}