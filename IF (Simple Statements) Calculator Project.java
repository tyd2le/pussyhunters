import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();
        
        String s;
        int ans;
        
        if (n == 1){
            s = "*";
            ans = a*b;
        }
        else if (n == 2){
            s = "/";
            ans = a/b;
        }
        else if (n == 3){
            s = "-";
            ans = a-b;
        }
        else{
            s = "+";
            ans = a+b;
        }
        
        System.out.println(a+s+b+"="+ans);
    }
}