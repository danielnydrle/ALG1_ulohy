package mtialg1_ulohy_git;

import java.util.Scanner;

public class Vyskyt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocetUloh = sc.nextInt();
        int prvek1;
        int prvek2;
        int pocetPrvku;        
        boolean vyskyt = false;                
        for (int i = 0; i < pocetUloh; i++) {
            prvek1 = sc.nextInt();
            prvek2 = sc.nextInt();
            pocetPrvku = sc.nextInt();
            int[] prvky = new int[pocetPrvku];

            for (int j = 0; j < pocetPrvku; j++) {
                prvky[j] = sc.nextInt();
            }
            for (int j = 0; j < pocetPrvku-1; j++) {
                if (prvky[j] == prvek1 && prvky[j+1] == prvek2) {
                    vyskyt = true;
                }
            }
            System.out.println(vyskyt);
            vyskyt = false;
        }
    }
    
}
