import java.util.Scanner;


public class Main {

        /**
         * Displays the main menu options to the user and reads the selected option.
         * The menu is displayed repeatedly until a valid integer option is entered.
         *
         * @param keyboard The Scanner object used for reading user input from the console.
         * @return The integer value of the option chosen by the user (1-5).
         */
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
    /**
     * Main method of the program.
     * Initializes the Scanner and an instance of the Rainfall class.
     * Enters a loop that repeatedly displays the menu, reads the user's
     * option, and executes the corresponding action using methods from
     * the Rainfall class until the user chooses option 5 (Exit).
     *
     * @param args 
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Rainfall rainfall = new Rainfall();
        int op;

        do {
            op = menu(keyboard);
            switch (op) {
                case 1:
                    // Method to display rainfall data for the selected year
                    System.out.print("Enter year (2022 - 2024): ");
                    int year = keyboard.nextInt();
                    rainfall.displayYearData(year);
                    break;
                
               case 2:
                    // Method to calculate and display total and average rainfall
                    System.out.println("Total Rainfall and average:\n");
                    rainfall.viewTotals();
                    break;
                 
                case 3:
                    // Method to find and display the years with highest and lowest total rainfall
                    System.out.println("Highest and lowest year:\n");
                    rainfall.viewYearPeaks();
                    break;
                    
                case 4: 
                    // Method to display all stored rainfall data in a table format
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
        } while(op !=5);     
    }
}