import java.util.Scanner;

class UserAcc { //super class
    int balance=10000;
}

//ATM class
//sub class
public class Task4 extends UserAcc { 
    
    UserAcc ob=new UserAcc();
    //public int balance;
        public static void main(String args[]){
        int choice;
        int amt;
        Task4 obj=new Task4();
        Scanner in=new Scanner(System.in);
       
       do{
            System.out.println("Menu");
            System.out.println("1.Check the balance\n2.Withdrawal\n3.Deposit\n4.Exit");
            System.out.println("Enter your choice:");
            choice=in.nextInt();
            switch(choice){
                case 1:
                obj.checkBalance();
                break;
                case 2:
                System.out.println("Enter the amount to be withdrawn:");
                amt=in.nextInt();
                obj.withdraw(amt);
                break;
                case 3:
                System.out.println("Enter the amount to be deposited:");
                amt=in.nextInt();
                obj.deposit(amt);
                break;
                case 4:
                break;
            
                default:
                System.out.println("Wrong choice!!");
                break;
            }
        }while(choice!=4);   
        in.close();
    }
    void checkBalance(){
        
        System.out.println("Balance:"+ob.balance);
    }
    void withdraw(int amount){
        if(amount>ob.balance){
            System.out.println("Insufficent balance");
        }
        else{
            ob.balance=ob.balance-amount;
            System.out.println("Successfully withdrawn");
            System.out.println("Balance:"+ob.balance);
        }
    }
    void deposit(int amount){
        ob.balance=ob.balance+amount;
        System.out.println("Deposit is successfully completed");
        System.out.println("Balance:"+ob.balance);
    }
}

