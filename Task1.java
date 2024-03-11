import java.util.Scanner;
import java.util.Random;

public class Task1 {
    private static Object ch;

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        Random rd=new Random();
        int attempts=5;
        int num=rd.nextInt(1,101);
        int guess;
        System.out.println("Welcome to the 'Guess The Number Game'");
        System.out.println("A random number is generated!!");
        System.out.println("You have 5 attempts to guess the number");
        
      
        do{
            
            System.out.println("Enter your guess:");
            guess=in.nextInt();
            
            if(guess>num){
                System.out.println("Your guess is too high");
                
            }
            else if(guess<num){
                System.out.println("Your guess is too low");
                         
            }
            else{
                System.out.println("Yayy!! you got the guess right.");
                System.out.println("The number:"+num);
            }
            attempts-=1;
            if(attempts==0){
                System.out.println("You have ran out of attempts!!");
                System.out.println("The number is:"+num);
                break;
            }
        }while(guess!=num);
        
        
        
    
    }
}

