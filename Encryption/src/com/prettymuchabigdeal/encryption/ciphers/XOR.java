package com.prettymuchabigdeal.encryption.ciphers;

/**
 *
 * @author shivasprogeny
 */
public class XOR extends Cipher
{

    public void encode(){

            if (key == null)
                    output =  "Key was not set";
            if (message == null)
                    output = "Message was not set";

            byte[] keyArray = key.getBytes();
            byte[] messageArray = message.getBytes();
            byte[] encryptedMessage = new byte[messageArray.length];

            for(int i = 0; i < messageArray.length; i++){
                for(int j = 0; j < keyArray.length; j++){
                    encryptedMessage[i] = (byte)(messageArray[i] ^ keyArray[j]);
                }
            }

            output = new String(encryptedMessage);		

    }

    public void decode(){

            encode(); //XOR encryption is reversable

    }  
}
