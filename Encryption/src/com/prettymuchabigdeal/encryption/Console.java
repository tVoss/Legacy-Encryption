package com.prettymuchabigdeal.encryption;

import java.util.Scanner;
import com.prettymuchabigdeal.encryption.ciphers.*;

/**
*
* @author Tyler
*/
public class Console 
{
	
	public static void main(String[] args) 
	{
		
		Cipher cipher = null;

		boolean encoding = false;
		boolean answered = false;
		
		Scanner read = new Scanner(System.in);
		
		while(!answered)
		{
			System.out.println("Please select cipher type\n" + 
                                                "[P]olyalphabetic\n" + 
                                                "[X]OR\n" + 
                                                "[O]ne Time Pad");
			String input = read.nextLine();
			if (input.toLowerCase().equals("p") || input.toLowerCase().equals("polyalphabetic"))
			{
				cipher = new Polyalphabetic();
				answered = true;
			}
			else if(input.toLowerCase().equals("x") || input.toLowerCase().equals("xor"))
			{
				cipher = new XOR();
				answered = true;
			}
			else if(input.toLowerCase().equals("o") || input.toLowerCase().equals("one time pad"))
			{
				cipher = new OneTimePad();
				answered = true;
			}
			else
			{
				System.out.println("Incorrect input! Please enter a valid cipher.");
			}
		}
                
                answered = false;
                
                while(!answered){
			System.out.println("Would you like to encode or decode? [E/D]");
			String input = read.nextLine();
			if (input.equalsIgnoreCase("e") || input.equalsIgnoreCase("encode"))
			{
				encoding = true;
				input = "encoded";
				answered = true;
			}
			else if(input.equalsIgnoreCase("d") || input.equalsIgnoreCase("decode"))
			{
				encoding = false;
				input = "decoded";
				answered = true;
			}
			else
			{
				System.out.println("Incorrect input! Please type either encode or decode");
			}
		}
		System.out.print("Type message to be " + input +": ");
		cipher.setMessage(read.nextLine());
		System.out.print("Type key to use: ");
                
		cipher.setKey(read.nextLine());
		
		if(encoding)
			cipher.encode();
		else
			cipher.decode();
		
		System.out.println(input+" message is: "+cipher.getOutput());

	}//End of main method

}//End of class
