package com.prettymuchabigdeal.encryption;

public class Polyalphabetic {
	
	private String key;
	private String message;
	
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
	
	public String encode(){
		
		if (key == null)
			return "Key was not set";
		if (message == null)
			return "Message was not set";
		
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
		
		return new String(encoded);
			
		
		
		
	}
	
	public String decode(){
		
		if (key == null)
			return "Key was not set";
		if (message == null)
			return "Message was not set";
		
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
		
		return new String(decoded);
	
	}
}
