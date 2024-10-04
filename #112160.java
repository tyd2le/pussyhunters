import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A == B && B == C){
            System.out.println("3");
        }
        else if (A == B || A == C || B == C){
            System.out.println("2");
        }
        else{
            System.out.println("0");
        }
    }
}