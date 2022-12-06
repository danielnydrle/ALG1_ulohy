import java.util.Scanner;

public class RozkladCisla {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            if (!sc.hasNextInt())
                break;
            int a = sc.nextInt();
            
            for (int i = 2; i <= a; i++) {
                while (a % i == 0) {
                    int remainder = a / i;
                    a = remainder;
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
