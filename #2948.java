import java.util.Scanner;

public class Main{
    static public void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        n %= 86400;
        int h = n/3600;
        n %= 3600;
        int mm = n/60;
        n %= 60;
        int ss = n;
        
        System.out.print(h + ":" + (mm<10?"0"+mm:mm) + ":" + (ss<10?"0"+ss:ss));
    }
}