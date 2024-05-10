import java.util.*;

public class Task_2_AtmInterface
{
    public static void main(String args[])
    {

        double withdraw, deposite, balance = 5000;

        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME !");

        while(true)
        {

            System.out.println("Choose   1 for Withdraw");
            System.out.println("\t 2 for deposite");
            System.out.println("\t 3 for Check Balance");
            System.out.println("\t 4 for Transfer");
            System.out.println("\t 5 for exit");
            System.out.print("Choose the operation you want to perform in above one:");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = sc.nextDouble();
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money.");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance \n");
                    }
                    break;


                case 2:
                    System.out.print("Enter money to be deposited:");
                    deposite = sc.nextDouble();
                    balance = balance + deposite;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;


                case 3:
                    System.out.println("Balance : "+balance);
                    break;


                case 4:
                    System.out.println("Enter the account number of the receiving body: "); 
                    int num=sc.nextInt();     
                    
                    System.out.println("Enter the amount to be transferred :");
                    double transfer_cash=sc.nextDouble();
                    
                    if(transfer_cash<=balance){
                        balance=balance-transfer_cash;
                        System.out.println("Amount Rs." + transfer_cash + "/- transferred Successfully.");
                        System.out.println("----------------------------------------------------------");
                    }
                    else{
                        System.out.println("insufficient balance to transfer the cash");
                        System.out.println("----------------------------------------------------------");
                    }
                    break;


                case 5:
                    sc.close();
                    System.out.println("Process completed...");
                    System.exit(0);


                default :
                    System.out.println("Please enter a valid choice.");

            }

        }        
    }
}