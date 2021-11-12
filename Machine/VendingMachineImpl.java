package Machine;

import java.util.Scanner;

public class VendingMachineImpl implements InterfaceVendingMachine{


    Scanner sc = new Scanner(System.in);
    public void SoldOut(Item q){
        if(q.ItemCount == 0){
            throw new SoldOutException("SORRY, Item stock Not Available");
        }
        else{
            System.out.println("\n  Item is available in the Vending Machine");
        }
    }
    
    public void IllegalArgument(String s){
        
        try{
            for(Item i : Item.values()){
                if(i.equals(Item.valueOf(s)));
            }
        }
        catch(Exception e){
            throw new IllegalArgumentException("WARNING : ENTER VALID INPUT\n");
        }
    }
    

    public int display(){
        System.out.println("\nEnter the Amount: ");
        System.out.println("\tINSERT NUMBER OF COINS--");
			int num = sc.nextInt();
			Coin insertedCoin []=new Coin[num];
            int sum = 0;
			for(int i=0;i<num;i++){
				System.out.println("Insert Amount of Coin "+(i+1));
				int n1=sc.nextInt();
				switch (n1) {
					case 50:
					    insertedCoin[i]=Coin.FiftyRupees;
                        sum += 50;
						break;

					case 20:
					    insertedCoin[i]=Coin.TwentyRupees;
                        sum += 20;
						break;

					case 10:
						insertedCoin[i]=Coin.TenRupees;
                        sum += 10;
						break;

					case 5:
						insertedCoin[i]=Coin.FiveRupees;
                        sum += 5;
						break;

					case 1:
						insertedCoin[i]=Coin.OneRupee;
                        sum += 1;
						break;
				
					default:
					    System.out.println("\tWarning::\nInput Valid Coin Amount..");
					    i--;
						break;
				}
            }
            return sum;
    }

    public void NotFullPaid(Item q, int sum){
        
        if(sum < q.getPrice()){
             throw new NotFullPaidException("Payment Failed,\n\tThe Full Amount is not paid.\n Remaining Amount:", q.getPrice()-sum);
        }
        else{
            System.out.println("\nPayment Successful,\n\tYour Order is Processing");
        }
    }

    public int ChangeAmount(Item q, int sum){
        int change = sum - q.getPrice();
        System.out.println("\nThe Balance Changed Amount : " + change);
        return change;
    }

    public void CoinsGiven(int c){
        System.out.println("\nNumber of Coins Returned to the Customer");
        if(c >= 50){
            int temp = c/50;
            c -= 50 * temp;
            System.out.println("50 : " + temp);
        }
        if(c >= 20){
            int temp = c/20;
            c -= 20 * temp;
            System.out.println("20 : " + temp);
        }
        if(c >= 10){
            int temp = c/10;
            c -= 10 * temp;
            System.out.println("10 : " + temp);
        }
        if(c >= 5){
            int temp = c/5;
            c -= 5 * temp;
            System.out.println("5 : " + temp);
        }
        if(c >= 1){
            System.out.println("1 : " + c);
        }
    }
}
