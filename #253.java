import java.util.Scanner;

public class Main{
    static public void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        if (n % 4 == 0 && (n % 400 == 0 || n % 100 != 0)){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}