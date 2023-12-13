/*Author: @AndyV12
 * This is a simple text based game, it is to be played in the terminal as i cant figure out how to put it into GUI
 * Aka : can't code
 */

package cashew;
import java.util.*;

public class cashew{
    Scanner myScanner = new Scanner(System.in);
	Scanner enterScanner = new Scanner(System.in);
	int playerHP;
	String playerName;
    String playerWeapon;
	int choice;

	int win;
    
    public static void main(String[] args){
        cashew mango;
		mango = new cashew();

		mango.playerSetUp();
		mango.house();
	}

	public void playerSetUp() {

		playerHP = 10;
		

		System.out.println("Your HP: " + playerHP);


		System.out.println("Who has the pleasure of entering this home today?");

		playerName = myScanner.nextLine();

		System.out.println("Hello " + playerName + ", welcome to your new home!");

    

	}

	public void house() {

		System.out.println("\n------------------------------------------------------------------\n");// i dont remember the fancy thing you did with
		System.out.println("You arrived at the house");
		System.out.println("You exit your car and walk to the door, keys in hand");
		System.out.println("");
		System.out.println("What do you want to do?");
		System.out.println("");
		System.out.println("1: Enter the house");
		System.out.println("2: Break into the house");
		System.out.println("3: Leave");
		System.out.println("\n------------------------------------------------------------------\n");

		choice = myScanner.nextInt();

		if (choice == 1) {
			if (win == 1) {
				ending();
			} else {
				System.out.println("You enter the house, you are struck with the smell of bananas");
				enterScanner.nextLine();
				inside();
			}

		} else if (choice == 2) {
			playerHP = playerHP - 1;
			System.out.println(
					"You decide to jump in through the window.\n\n Glass shatters and cuts your skin, you regret the desicion. You smell bananas  .\n(You receive 1 damage)\n");
			System.out.println("Your HP: " + playerHP);
			enterScanner.nextLine();
			house();
		} else if (choice == 3) {
			leave();
		} else {
			house();
		}
	}

	public void inside() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You are inside the house. If you turn back you leave. There is a strong smell of bananas coming from the basement\n\n");
		System.out.println("1: Turn back");
		System.out.println("2: Go to the Kitchen");
		System.out.println("3: Go to the Bedroom");
		System.out.println("4: Go to the Basement");
		System.out.println("\n------------------------------------------------------------------\n");

		choice = myScanner.nextInt();

		if (choice == 1) {
			leave();
		} else if (choice == 2) {
			Kit();
		} else if (choice == 3) {
			bed();
		//} else if (choice == 4) {
			//base();
		} else {
			inside();
		}
	}

	public void Kit() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You find a moldy apple on the counter and eat it without second thought");
		System.out.println("Your HP is recovered?");
		playerHP = playerHP + 1;
		System.out.println("Your HP: " + playerHP);
		System.out.println("\n\n1: Go back to the front door");
		System.out.println("\n------------------------------------------------------------------\n");

		choice = myScanner.nextInt();

		if (choice == 1) {
			inside();
		} else {
			Kit();
		}
	}

	public void bed() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("This room feels peaceful, and smells of apples");
		System.out.println("\n\n1: Go back to the front door");
		System.out.println("\n------------------------------------------------------------------\n");

		choice = myScanner.nextInt();

		if (choice == 1) {
			inside();
		} else {
			bed();
		}
	}

	

	

	

	public void dead() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You are dead!!!");
		System.out.println("\n\nGAME OVER");
		System.out.println("\n------------------------------------------------------------------\n");

	}

	public void win() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("test");
		System.out.println("test");
		System.out.println("test");
		System.out.println("test");
		System.out.println("\n------------------------------------------------------------------\n");

		win = 1;

		choice = myScanner.nextInt();
		if (choice == 1) {
			inside();
		} else {
			win();
		}

	}

    public void leave(){
        System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You decided to turn back and leave");
		System.out.println("You turn back to get one last look at the house, and it is no longer there...");
		System.out.println("\n\n           THE END                    ");
		System.out.println("\n------------------------------------------------------------------\n");
    }

	public void ending() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("test");
		System.out.println("test");
		System.out.println("\n\n           THE END                    ");
		System.out.println("\n------------------------------------------------------------------\n");
	}
}
    








    