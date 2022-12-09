import java.util.Scanner;

public class Rozsah {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        do {
            n = sc.nextInt();
            int min = 0, max = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (i == 0) {
                    min = arr[i];
                    max = arr[i];
                }
                else {
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
            }
            System.out.printf("%d %d%n", min, max);
            
        } while (n > 0);
    }
}
