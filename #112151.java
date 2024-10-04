import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        for (int i=0; i<5; ++i){
            int random = a + (int)(Math.random()*(b-a+1));
            System.out.println(random + " ");
        }
    }
}
