import java.util.Scanner;

public class NumberGame
{
    static Scanner sc = new Scanner(System.in);
  	public static void main(String[] args) {
	  while(true)
	  {
	    System.out.println("enter a number\n1.start \n2.reset\nAnything to exit");
	    int choice = sc.nextInt();

	       if(choice ==1) {
	           System.out.println("Game is started....");
	           startGame();
	       }
	        else if(choice ==2){
	            System.out.println("Game is reseted...");
	            startGame();
	        }
	        else
	            break;
        }
	}
    public static void startGame()
    {
        int c = 0;
	    int userWins = 0;
	    while(c<3)
	    {
	        c++;
	        System.out.println("enter a Number: ");
	        int user = sc.nextInt();
	        int num = (int)(Math.random()*100);
	        if(user == num )
	        {
	            System.out.println("Guessed number is correct number");
	            userWins++;
	        }
	        System.out.println("userWins: "+userWins);
        }
    }
}
