package lexicon.workshop;

import java.util.Scanner;

public class VendingMachineApp {

    static Scanner scan = new Scanner(System.in);
    static IVendingMachine vendingMachine ;

    public VendingMachineApp(IVendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    static void main() {

        System.out.println("====================== Welcome to the Vending Machine App ======================");
        displayConsoleMenu();
        int input = scan.nextInt();
        boolean value = true;
        while (value) {
            switch (input) {
                case 1:
                    System.out.println("Available products in Stock");
                    //vendingMachine = (IVendingMachine) new VendingMachineImplementation().getProducts();
                    System.out.println(vendingMachine.getProducts());
                    break;
                case 2:
                    System.out.println("Please insert a coin");
                    //vendingMachine = (IVendingMachine) new VendingMachineImplementation().getProducts();
                    //searchContact();
                    break;
                case 3:
                    System.out.println("Select the product displayed and make a purchase");
                    //listContact();
                    break;
                case 4:
                    System.out.println("Checking for any return change .....");
                    break;
                case 5:
                    System.out.println("Your Bill history is Here : ");
                    break;
                case 0:
                    System.out.println(" Exiting the Vending Machine app !!! Thank you, Have a nice day !!!");
                    break;
                default:
                    System.out.println("Wrong option chosen. Please enter 1,2,3,0");
            }

            //To check if the user has to still proceed with or not
            IO.println("Do you want to still continue with Vending Machine Menu ?(Yes/No)");
            boolean isRight = true;
            while (isRight) {
                String option = scan.next();
                if (option.equalsIgnoreCase("Yes")) {
                    displayConsoleMenu();
                    input = scan.nextInt();
                    isRight = false;
                } else if (option.equalsIgnoreCase("No")) {
                    value = false;
                    IO.println("Exiting the Vending Machine , Thanks & Have a nice day !!!!!!");
                    isRight = false;
                } else {
                    IO.println("Wrong option entered. Please enter Yes or No");
                }
            }
        }
    }

    static void displayConsoleMenu(){
        System.out.println("Please choose an Option below :");
        System.out.println("1. View the Product available in Stock ");
        System.out.println("2. Insert a Coin ");
        System.out.println("3. Select & Purchase a Product ");
        System.out.println("4. Return Change (if any) ");
        System.out.println("5. Bill History ");
        System.out.println("0. Exit ");
    }
}
