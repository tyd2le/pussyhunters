import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        System.out.print(n/100+n/10%10+n%10);
    }
}