import java.util.Scanner;
public class Zkratky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            String nazev = sc.nextLine();
            String[] slova = nazev.split("\\s+");
            StringBuilder sb = new StringBuilder();
            String zkratka;
            for (String slovo : slova) {
                if (slovo.length() > 2) {
                    char prvniPismeno = slovo.toUpperCase().charAt(0);
                    sb.append(prvniPismeno);
                }
            }
            zkratka = sb.toString();
            System.out.println(zkratka);
        }
    }
}
