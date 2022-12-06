import java.util.Scanner;

public class BarvaPole {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (!sc.hasNextInt())
                break;
            int a = sc.nextInt();
            if (!sc.hasNextInt())
                break;
            int b = sc.nextInt();
            
            String barva = "";
            
            if (a % 2 == 0) {
                if (b % 2 == 0) {
                    barva = "BILA";
                }
                else {
                    barva = "CERNA";
                }
            }
            else {
                if (b % 2 == 0) {
                    barva = "CERNA";
                }
                else {
                    barva = "BILA";
                }
            }
        
            System.out.println(barva);
        }
    }
}
