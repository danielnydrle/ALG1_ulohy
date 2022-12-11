import java.util.Scanner;

public class Pocet {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocet = sc.nextInt();
        for (int i = 0; i < pocet; i++) {
            int prvni = sc.nextInt();
            int pocetDelitelu = 0;
            for (int j = 2; j < prvni; j++) {
                if (prvni % j == 0) {
                    pocetDelitelu++;
                }
            }
            //find out how many non-trivial divisors prvni has
            int pocetStejnych = 0;
            
            int cislo;
            while((cislo = sc.nextInt()) > 0) {
                int pocetDeliteluCisla = 0;
                for (int j = 2; j < cislo; j++) {
                    if (cislo % j == 0) {
                        pocetDeliteluCisla++;
                    }
                }
                if (pocetDeliteluCisla == pocetDelitelu) {
                    pocetStejnych++;
                }

            }
            System.out.println(pocetStejnych);

        
    }
}

}
