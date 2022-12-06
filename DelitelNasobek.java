import java.util.Scanner; 

public class DelitelNasobek {
    
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
        
        while (true) {
            if (!sc.hasNextLong())
                break;
            long a = sc.nextLong();
            if (!sc.hasNextLong())
                break;
            long b = sc.nextLong();
            long gcd = 0; // nejvetsi spolecny delitel
            long lcm = 0; // nejmensi spolecny nasobek
            
            gcd = gcdByEuclidsAlgorithm(a, b);
            
            lcm = (a * b) / gcd;
            
            System.out.printf("%d %d%n", gcd, lcm);
        }
    }
            
    static long gcdByEuclidsAlgorithm(long n1, long n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
}
