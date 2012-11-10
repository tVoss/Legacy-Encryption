package com.prettymuchabigdeal.encryption;

import java.util.Scanner;
import com.prettymuchabigdeal.encryption.ciphers.*;

public class Console {
	
	public static void main(String[] args) {
		
		Cipher cipher = null;
            
                String prompt = "null";
		boolean encoding = false;
		boolean answered = false;
		
		Scanner read = new Scanner(System.in);
		
		while(!answered){
			System.out.println("Please select cipher type\n" + 
                                                "[P]olyalphabetic\n" + 
                                                "[X]OR");
			String input = read.nextLine();
			if (input.toLowerCase().equals("p") || input.toLowerCase().equals("polyalphabetic")){
				cipher = new Polyalphabetic();
				answered = true;
			}else if(input.toLowerCase().equals("x") || input.toLowerCase().equals("xor")){
				cipher = new XOR();
				answered = true;
			}else{
				System.out.println("Incorrect input! Please enter a valid cipher.");
			}
		}
                
                answered = false;
                
                while(!answered){
			System.out.println("Whould you like to encode or decode? [E/D]");
			String input = read.nextLine();
			if (input.toLowerCase().equals("e") || input.toLowerCase().equals("encode")){
				encoding = true;
				prompt = "encoded";
				answered = true;
			}else if(input.toLowerCase().equals("d") || input.toLowerCase().equals("decode")){
				encoding = false;
				prompt = "decoded";
				answered = true;
			}else{
				System.out.println("Incorrect input! Please type either encode or decode");
			}
		}
		System.out.print("Type message to be " + prompt +": ");
		cipher.setMessage(read.nextLine());
		System.out.print("Type key to use: ");
                
		cipher.setKey(read.nextLine());
		
		if(encoding)
			cipher.encode();
		else
			cipher.decode();
		
		System.out.println(prompt+" message is:"+cipher.getOutput());

	}

}
