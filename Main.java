import java.util.Scanner;

public class Main {

        public static int menu(Scanner keyboard) {
        System.out.println("\n========== RAINFALL MENU ==========");
        System.out.println("1. Select a year (2022 - 2024)");
        System.out.println("2. View total rainfall and average rainfall");
        System.out.println("3. Display the year with the highest and lowest rainfall");
        System.out.println("4. View complete rainfall data table");
        System.out.println("5. Exit");
        System.out.println("===================================");
        System.out.print("Choose an option: ");

        return keyboard.nextInt();
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Rainfall rainfall = new Rainfall();
        int op;

        do {
            op = menu(keyboard);
            switch (op) {
                case 1:
                    System.out.print("Enter year (2022 - 2024): ");
                    int year = keyboard.nextInt();
                    rainfall.displayYearData(year);
                    break;
                
               case 2:
                    System.out.println("Total Rainfall and average:\n");
                    rainfall.viewTotals();
                    break;
                 
                case 3:
                    System.out.println("Highest and lowest year:\n");
                    rainfall.viewYearPeaks();
                    break;
                    
                case 4: 
                    System.out.println("View all data/table\n");
                    rainfall.displayDataTable();
                    break;

                case 5: 
                    System.out.println("Thank you for using the program!");
                    System.out.println("Goodbye!");
                    break;

               
               
               
                    default:
                   System.out.println("Invalid option!!");
                   System.out.println("Choose between 1-5");
                   break;
            }
        }while(op !=5);

            
    }
}
