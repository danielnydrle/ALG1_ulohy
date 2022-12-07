import java.util.Scanner;
import java.lang.Math;

public class CtyriCisla {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            int tmp;
            if (a > b) { tmp = a; a = b; b = tmp; }
            if (c > d) { tmp = c; c = d; d = tmp; }
            if (a > c) { tmp = a; a = c; c = tmp; }
            if (b > d) { tmp = b; b = d; d = tmp; }
            if (b > c) { tmp = b; b = c; c = tmp; }
            
            System.out.printf("%d %d %d %d%n", a, b, c, d);
        }
    }
}
