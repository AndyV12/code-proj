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
	int monsterHP;

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

		System.out.println("\n------------------------------------------------------------------\n");// i dont remember the fancy thing you did with asterisk
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
			playerHP = playerHP - 10;
			System.out.println(
					"You decide to jump in through the window.\n\n Glass shatters and cuts your skin to ribbons, you recive fatal damage!  .\n(You receive 10 damage)\n");
			System.out.println("Your HP: " + playerHP);

			enterScanner.nextLine();
			glass();
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
		} else if (choice == 4) {
			base();
		} else {
			inside();
		}
	}
	public void base() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You walk down the dark steps of the basement, you cant see anything\n");
        System.out.println("1: search for a light switch");
        System.out.println("2: Walk in without a care ");
        System.out.println("\n------------------------------------------------------------------\n");


        choice = myScanner.nextInt();


        if (choice == 1) {
            light();
        } else if (choice == 2) {
            careless();
        } else {
            inside();
        }
    }

    public void careless(){
		System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You stumble into the basement and run into a pile of bananas, you hear heavy breathing");
        System.out.println("\n1: Take a banana");
        System.out.println("2: Go back and look for a light");
        System.out.println("\n------------------------------------------------------------------\n");


        choice = myScanner.nextInt();


        if (choice == 1) {
            pain();
        } else if (choice == 2) {
            light();
		}
    }

	
    public void light() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You find a light switch and turn it on, revealing a gorilla eating from a tall pile of bananas");
        System.out.println("\n1: Take a banana");
        System.out.println("2: Go back");
        System.out.println("\n------------------------------------------------------------------\n");


        choice = myScanner.nextInt();


        if (choice == 1) {
            attack();
        } else if (choice == 2) {
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
	public void attack() {
		int playerDamage = 3;

		System.out.println("You attacked the gorilla for" + playerDamage + " damage!");

		monsterHP = monsterHP - playerDamage;

		System.out.println("Gorilla HP: " + monsterHP);

		if (monsterHP < 1) {
			win();
		} else if (monsterHP > 0) {
			int monsterDamage = 0;

			monsterDamage = new java.util.Random().nextInt(2);

			System.out.println("The gorilla mauled you and gave " + monsterDamage + " damage!");

			playerHP = playerHP - monsterDamage;

			System.out.println("Player HP: " + playerHP);

			if (playerHP < 1) {
				dead();
			} else if (playerHP > 0) {
				win();
			}
		}

	}
	public void win(){
		System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You defeat the gorilla");
		System.out.println("The gorilla drops the elusive crystal mango");
        System.out.println("\n1: Take the mango");
        System.out.println("2: Go back");
        System.out.println("\n------------------------------------------------------------------\n");


        choice = myScanner.nextInt();


        if (choice == 1) {
            mango();
        } else if (choice == 2) {
            proper();
		}
    }

	public void dead() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You are dead!!!");
		System.out.println("\n\nGAME OVER");
		System.out.println("\n------------------------------------------------------------------\n");

	}

	public void mango() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You found the legendary crystal mango, as you celebrate the house begins to crumble around you");
		System.out.println("As you make it to the door and go outside, you notice that everything is in complete dissaray and anarchy");
		System.out.println("all of a sudden the earth splits and swallows you whole, you fall and crash into earth's molten core");
		System.out.println("\n              YOU DIED                  ");
		System.out.println("\n              What did you do? (ending)                  ");
		System.out.println("\n------------------------------------------------------------------\n");

		

	}

    public void leave(){
        System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You decided to turn back and leave");
		System.out.println("You turn back to get one last look at the house, and it is no longer there...");
		System.out.println("\n\n           Paranormal ending                    ");
		System.out.println("\n------------------------------------------------------------------\n");
    }

	public void ending() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("test");
		System.out.println("test");
		System.out.println("\n\n           THE END                    ");
		System.out.println("\n------------------------------------------------------------------\n");
	}
	 public void pain(){
        System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You reached for a banana and took a bite from it, peel and all.");
		System.out.println("As you reach for another one, a gorilla appears and beats you to death with a mango");
		System.out.println("\n\n           YOU DIED, albeit sweetly                  ");
		System.out.println("\n             Dark basement ending                        ");
		System.out.println("\n------------------------------------------------------------------\n");
    }
	 public void glass(){
        System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You bleed out on the floor");
		System.out.println("A gorilla emerges from the basement and beats you with an unripe banana");
		System.out.println("\n             YOU DIED                        ");
		System.out.println("\n\n           Break-in Ending               ");
		System.out.println("\n------------------------------------------------------------------\n");
    }
	public void proper() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You leave the crystal mango behind");
		System.out.println("As you make it to the door and go outside, you turn around and notice that the house isnt the same");
		System.out.println("it is a marvelous mansion all lined with the finest of furniture and leisures");
		System.out.println("You turn on the 8k 100 inch tv to the news and find that world peace has been achived ");
		System.out.println("\n              YOU WIN                  ");
		System.out.println("\n              What happened? (true ending)                  ");
		System.out.println("\n------------------------------------------------------------------\n");

		

	}
}
    








    