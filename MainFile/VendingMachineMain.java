package MainFile;
import java.util.Scanner;

import Machine.Coin;
import Machine.Item;
import Machine.VendingMachineImpl;

public class VendingMachineMain {
    public static void main(String[] args) {

            System.out.println();
            System.out.println("\t\t////                                 ////");
            System.out.println("\t\t-----------------------------------------");
            System.out.println("\t\t|    WELCOME TO OUR VENDING MACHINE     |");
            System.out.println("\t\t-----------------------------------------");
            System.out.println("\t\t////                                /////");
            System.out.println("\nItem available in our Vending Machine are listed below with price: ");

        for(Item i : Item.values()){
            System.out.println("\tItem: " + i + "\tPrice:" + i.getPrice());
        }

        System.out.println("\nValid Coins accepted by machine are listed below: ");

        for(Coin i : Coin.values()){
            System.out.println("\tCoin: " + i.getDenomination());
        }

        System.out.println("\nEnter the Item you want to buy (Please Enter the Item in UPPERCASE): ");
        //Taking Input From the User
        Scanner sc = new Scanner(System.in);
        String UserChoice = sc.nextLine();

        VendingMachineImpl v = new VendingMachineImpl();
        v.IllegalArgument(UserChoice);

        v.SoldOut(Item.valueOf(UserChoice));
        // System.out.println();
        int sum = v.display();
        v.NotFullPaid(Item.valueOf(UserChoice), sum);
        //v.ChangeAmount(Item.valueOf(UserChoice), sum);
        int Change = v.ChangeAmount(Item.valueOf(UserChoice), sum);
        if(Change!=0){
            v.CoinsGiven(Change);
        }
        sc.close();
    }
}
