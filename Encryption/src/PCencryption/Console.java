package PCencryption;
import java.util.Scanner;

public class Console {
	
	static Worker pc2 = new Worker();
	
	public static void main(String[] args) {
		
		String EoD = "null";
		boolean eod = true;
		Scanner read = new Scanner(System.in);
		System.out.println("Whould you like to encode or decode?");
		String input = read.nextLine();
		if (input.equals("encode")){
			eod = true;
			EoD = "encoded";
		}else if(input.equals("decode")){
			eod = false;
			EoD = "decoded";
		}else{
			System.out.println("Incorrect input! Please type either encode or decode");
			System.exit(0);
		}
		System.out.print("Type message to be " + EoD +": ");
		String message = read.nextLine();
		System.out.print("Type key to use: ");
		String key = read.nextLine();
		String print = pc2.startWorking(message, key, eod);
		System.out.println(EoD +" message is: "+print);

	}

}
