package com.prettymuchabigdeal.encryption;

import java.util.Scanner;
import com.prettymuchabigdeal.encryption.ciphers.*;

public class Console {
	
	public static void main(String[] args) {
		
		String prompt = "null";
		boolean encoding = false;
		boolean answered = false;
		
		Scanner read = new Scanner(System.in);
		Polyalphabetic poly = new Polyalphabetic();
		
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
		poly.setMessage(read.nextLine());
		System.out.print("Type key to use: ");
		poly.setKey(read.nextLine());
		
		if(encoding)
			poly.encode();
		else
			poly.decode();
		
		System.out.println(prompt+"ed message is: "+poly.getOutput());

	}

}
