import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        //Read user input.
        Scanner input = new Scanner(System.in);

        //Create instance of account
        Account myAccount = new Account();

        //Display default account info.
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        //Prompt user for account name
        System.out.println("Please enter an account name: ");
        String accName = input.nextLine();

        //Set account name to user's input
        myAccount.setName(accName);
        System.out.println();
        //Print out the account name.
        System.out.printf("Name of my account is: %s%n",myAccount.getName());

    }
}
