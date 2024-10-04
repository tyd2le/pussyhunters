import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int x=a+a%2; x<=b; x+=2){
            System.out.print(x + " ");
        }
    }
}