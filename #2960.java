import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.println((a==1&&b==1)||(a!=1&&b!=1) ? "YES" : "NO");
    }
}