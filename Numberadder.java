import java.util.Scanner;
public class Numberadder {

	public static void main(String[] args) {
		
		int number = 0;
		boolean Switch = true;
		while(Switch){
			System.out.println("Please insert a number ");
			int scan;
			Scanner scanning = new Scanner(System.in);
			scan = scanning.nextInt();
			number += scan;
			System.out.println(number);
			System.out.println("Print any letter key to redo, OR");
			System.out.println("Print 'e' to exit program");
			Scanner options = new Scanner(System.in);
			String key;
			key = options.nextLine();
			if(key=="e"){
				Switch = false;
				
			}
			
		}
		System.out.println("End of program");
	}

}
