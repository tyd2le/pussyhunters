import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A == B && A > C){
            System.out.println("A B");
        }
        else if (A == C && A > B){
            System.out.println("A C");
        }
        else if (B == C && B > A){
            System.out.println("B C");
        }
        else if (A > B && A > C){
            System.out.println("A");
        }
        else if (B > A && B > C){
            System.out.println("B");
        }
        else if (C > A && C > B){
            System.out.println("C");
        }
        else{
            System.out.println("0");
        }
    }
}