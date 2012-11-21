package com.prettymuchabigdeal.encryption.ciphers;

import java.util.Random;

public class OneTimePad extends Cipher {

	@Override
	public void encode() {
		Random r = new Random(key.hashCode());
		
		int[] messageIA = new int[message.toCharArray().length];
		for (int i = 0;i<messageIA.length;i++)
			messageIA[i] = (int)message.toCharArray()[i];
		
		int[] resultIA = new int[messageIA.length];
		
		for(int i =0;i<messageIA.length;i++){
			resultIA[i] = messageIA[i] + r.nextInt(95);
			
			while (resultIA[i]>126){
				resultIA[i]-=95;
			}
		}
		
		char[] result = new char[resultIA.length];
		for (int i = 0;i<result.length;i++)
			result[i] = (char)resultIA[i];
		
		output = new String(result);

	}

	@Override
	public void decode() {
		Random r = new Random(key.hashCode());
		
		int[] messageIA = new int[message.toCharArray().length];
		for (int i = 0;i<messageIA.length;i++)
			messageIA[i] = (int)message.toCharArray()[i];
		
		int[] resultIA = new int[messageIA.length];
		
		for(int i =0;i<messageIA.length;i++){
			resultIA[i] = messageIA[i] - r.nextInt(95);
			
			while (resultIA[i]<32){
				resultIA[i]+=95;
			}
		}
		
		char[] result = new char[resultIA.length];
		for (int i = 0;i<result.length;i++)
			result[i] = (char)resultIA[i];
		
		output = new String(result);

	}
	

}
