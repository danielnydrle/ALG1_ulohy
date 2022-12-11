import java.util.Scanner;

public class Cifry {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            long x = sc.nextLong();
            
            if (x <= 0)
                break;
            
            int sum = 0;
            long mult = 1;
            
            while (x > 0) {
                int digit = (int)(x % 10);
                sum += digit;
                mult *= digit;
                x = x / 10;
            }
            System.out.printf("%d %d%n", sum, mult);
        }
    }
}
