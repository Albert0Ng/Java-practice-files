import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Scanner exit = new Scanner(System.in);
		Random rps = new Random();
		int Switch = 1;
		int Switchtwo;
		int Switchthree;
		int number;
		int turns = 0;
		String playerone = null;
		String playertwo = null;
		
			while(Switch == 1){
				Switchtwo = 1;
				Switchthree = 1;
				
				System.out.println("---------Rock, Papers, Scissors---------");
				System.out.println("");
				System.out.println("Player 1 ");
				System.out.println("Please insert 1 for Rock, 2 for Paper or 3 for Scissor");			
				int counter = scan.nextInt();
				
				//RPS determinant for main player based on number chosen
				while(Switchtwo == 1){
					if(counter == 1){
						playerone = "Rock";
						Switchtwo = 0;
					}else if(counter == 2){
						playerone = "Paper";
						Switchtwo = 2;
					}else if(counter == 3){
						playerone = "Scissor";
						Switchtwo = 3;
					}else{
						//The fall back loop in case a wrong key is provided
						System.out.println("Please insert valid number between 1-3");
						int countertwo = scan.nextInt();
						while(Switchthree == 1){
							if(countertwo == 1){
								playerone = "Rock";
								Switchthree = 2;
							}else if(countertwo == 2){
								playerone = "Paper";
								Switchthree = 2;
							}else if(countertwo == 3){
								playerone = "Scissor";
								Switchthree = 2;
							}else{
								System.out.println("Insert valid number between 1-3");
								Switchthree = 1;
							}
						}
					}
				}
				
				
				//RPS number counter for computer player side
				number = rps.nextInt(3);
				
				if(number==0){
					playertwo = "Rock";
				}else if(number==1){
					playertwo = "Paper";
				}else if(number==2){
					playertwo = "Scissor";
				}
				System.out.println(playerone + " Vs " + playertwo);
				
				//algorithm for determining the winner
				if(playerone==playertwo){
					System.out.println("------Tie------");
				}else if(playerone=="Rock" && playertwo=="Scissor"){
					System.out.println("Rock beats Scissor");
					System.out.println("------Player one wins------");
				}else if(playerone=="Scissor" && playertwo=="Rock"){
					System.out.println("Rock beats Scissor");
					System.out.println("------Player two wins------");
				}else if(playerone=="Paper" && playertwo=="Rock"){
					System.out.println("Paper beats Rock");
					System.out.println("------Player one wins------");
				}
				
				System.out.println("Enter e to exit or any other letter to continue");
				String option = exit.nextLine();
				if(option=="e"){
					Switch = 0;
					System.out.println("Program ended");
				}else{
					Switch = 1;
				}
				
		}
	}

}
