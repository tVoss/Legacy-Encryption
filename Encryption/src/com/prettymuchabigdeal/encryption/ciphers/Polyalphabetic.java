package com.prettymuchabigdeal.encryption.ciphers;

public class Polyalphabetic {
	
	private String key;
	private String message;
	private String output;
	
	public Polyalphabetic(){
		key = null;
		message = null;
	}
	
	public void setKey(String k){
		key = k;
	}

	public void setMessage(String m){

		message = m;
	}
	
	public String getOutput(){
		return output;
	}
	
	public void encode(){
		
		if (key == null)
			output =  "Key was not set";
		if (message == null)
			output = "Message was not set";
		
		int[] keyIA = new int[key.toCharArray().length];
		for (int i = 0;i<keyIA.length;i++)
			keyIA[i] = (int)key.toCharArray()[i];
		
		int[] messageIA = new int[message.toCharArray().length];
		for (int i = 0;i<messageIA.length;i++)
			messageIA[i] = (int)message.toCharArray()[i];
		
		int[] encodedIA = new int[messageIA.length];
		
		for(int i=0;i<messageIA.length;i++){
			encodedIA[i]=messageIA[i]+(keyIA[i%keyIA.length]);
		
			while (encodedIA[i]>126){
				encodedIA[i]-=95;
			}
		}
		
		
		char[] encoded = new char[encodedIA.length];
		for (int i = 0;i<encoded.length;i++)
			encoded[i] = (char)encodedIA[i];
		
		output = new String(encoded);
			
		
		
		
	}
	
	public void decode(){
		
		if (key == null)
			output =  "Key was not set";
		if (message == null)
			output = "Message was not set";
		
		int[] keyIA = new int[key.toCharArray().length];
		for (int i = 0;i<keyIA.length;i++)
			keyIA[i] = (int)key.toCharArray()[i];
		
		int[] messageIA = new int[message.toCharArray().length];
		for (int i = 0;i<messageIA.length;i++)
			messageIA[i] = (int)message.toCharArray()[i];
		
		int[] decodedIA = new int[messageIA.length];
		
		for(int i=0;i<messageIA.length;i++){
			decodedIA[i]=messageIA[i]-(keyIA[i%keyIA.length]);
		while (decodedIA[i]<32){
			decodedIA[i]+=95;
			}
		}
		
		char[] decoded = new char[decodedIA.length];
		for (int i = 0;i<decoded.length;i++)
			decoded[i] = (char)decodedIA[i];
		
		output = new String(decoded);
	
	}
}
