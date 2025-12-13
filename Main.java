import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
        
        int op; 
    
        System.out.println("-------Menu-------");
        System.out.println("Choose the year (2022-2024");
        System.out.println("1. Total rainfall inches for each year"); 
        System.out.println("2. The average rainfall inches per month for years 2022 - 2024");
        System.out.println("3. The total rainfall inches per specific year determined by the user");
        System.out.println("Opciones: ");
        op = keyboard.nextInt();

        switch (op) 
        {
            case 1:
                
                break;
            default:
                throw new AssertionError();
        }


    }
}