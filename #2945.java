import java.util.Scanner;

public class Main{
    static public void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        n++;
        System.out.print(n+n%2);
    }
}