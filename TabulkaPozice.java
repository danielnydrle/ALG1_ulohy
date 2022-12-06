import java.util.Scanner;

public class TabulkaPozice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int number = sc.nextInt();
        
        int numberRow = number % cols == 0 || number % rows == 0
            ? (number / rows) - 1
            : number / rows;
        int numberCol = number % cols == 0 ? cols : number % cols;
        
        System.out.printf("%d %d", numberRow, numberCol);
    }
}
