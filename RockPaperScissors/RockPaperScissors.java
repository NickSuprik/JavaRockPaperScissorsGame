package day5;

import java.util.Scanner;


public class RockPaperScissors {

	public static void main(String[] args) {
		System.out.println("Welcome to the Rock Paper Scissors Game");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("0:Rock, 1:Paper, 2:Scissors");
		
		
		   // First, check if the input is an integer
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input, please restart the program.");
            return; // exit if not an int
        }
        int userChoice = scanner.nextInt();
		
		//Check if the input is in a valid range
		if (userChoice<0 || userChoice>2) 
		{
			System.out.println("Invalid input, please restart the program.");
		return; //exit if not in the valid range
		}
		
		
		//Computers random choice
		int computerChoice = (int) (Math.random()*3);
		
		
		//State who picked what
		
			//User choices
			switch (userChoice) {
		    case 0: System.out.println("You picked Rock"); break;
		    case 1: System.out.println("You picked Paper"); break;
		    case 2: System.out.println("You picked Scissors"); break;
			}
		
			//Computer choices
			switch (computerChoice) {
		    case 0: System.out.println("The computer picked Rock"); break;
		    case 1: System.out.println("The computer picked Paper"); break;
		    case 2: System.out.println("The computer picked Scissors"); break;
			}

		//Determine the Winner
		if (userChoice==computerChoice) {
		System.out.println("It's a draw.");
		}
		
		else if ((userChoice==0 && computerChoice == 2) ||
			(userChoice==1 && computerChoice == 0) ||
			(userChoice==2 && computerChoice == 1)) {
			
			System.out.println("You win! Congratulations!");
		}
			else	
			{
				System.out.println("Computer wins, better luck next time");
			}
		
		scanner.close();
		
		}
	}


