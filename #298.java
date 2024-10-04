import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        
        System.out.println(Math.abs(x1-x2)<2 && Math.abs(y1-y2)<2 ? "YES" : "NO");
    }
}