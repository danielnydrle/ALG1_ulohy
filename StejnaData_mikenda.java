import java.util.Scanner;
import java.util.Arrays;

public class StejnaData_mikenda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, l;
        k = l = 0;
        n = sc.nextInt();
        for (int u = 0; u < n; u++) {
            k = sc.nextInt();
            int[] p1 = new int[k];
            if (k != 0) {
                for (int i = 0; i < k; i++) {
                    p1[i] = sc.nextInt();
                }
                Arrays.sort(p1);
            }
            l = sc.nextInt();
            int[] p2 = new int[l];
            if (l != 0) {
                for (int i = 0; i < l; i++) {
                    p2[i] = sc.nextInt();
                }
            }
            Arrays.sort(p2);

            if (k != l) {
                System.out.println(0);
            } else {
                if (Arrays.equals(p1, p2)) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}
