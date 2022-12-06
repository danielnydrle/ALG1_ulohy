import java.util.Scanner;

public class TabulkaPoradi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int rowOrder = sc.nextInt();
        int colOrder = sc.nextInt();
        
        int number = cols * rowOrder - (cols - colOrder);
        
        System.out.printf("%d", number);
    }
}
