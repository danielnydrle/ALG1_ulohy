import java.util.Scanner;
import java.util.Locale;

public class PrumernaDenniTeplota {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        float prumernaTeplota; 
        // zde doplnit potrebny kod - nacteni a vypocet
        float teplota06 = sc.nextFloat();
        float teplota12 = sc.nextFloat();
        float teplota18 = sc.nextFloat();
        
        prumernaTeplota = (float)(teplota06 + teplota12 + 2 * teplota18) / 4;
        
        System.out.format(Locale.US, "%1.2f", prumernaTeplota);
    }
}
