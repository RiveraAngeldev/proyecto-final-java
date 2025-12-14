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
            
    }
}