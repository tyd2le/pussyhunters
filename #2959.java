import java.util.Scanner;

public class Main{
    static public void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        
        if (x > 0){
            System.out.print(1);
        }
        else if (x < 0){
            System.out.print(-1);
        }
        else{
            System.out.print(0);
        }
    }
}