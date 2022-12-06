import java.math.BigInteger;
import java.util.Scanner;

public class Nasobeni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            
            BigInteger x = a.multiply(b);
            
            System.out.println(x);
        }
    }
}
