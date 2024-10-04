import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        
        int mn = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
        int mx = Math.max(a, Math.
        max(b, Math.max(c, Math.max(d, e))));
        
        System.out.println(mn + "\n" + mx);
    }
}