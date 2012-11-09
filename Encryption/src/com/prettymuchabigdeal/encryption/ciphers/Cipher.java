/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prettymuchabigdeal.encryption.ciphers;

/**
 *
 * @author Phillip
 */
public abstract class Cipher
{
    String key;
    String message;
    String output;

     public Cipher(){
            key = null;
            message = null;
    }
    
    public void setKey(String k){
            key = k;
    }
    
    public String getKey(){
            return key;
    }

    public void setMessage(String m){

            message = m;
    }

    public String getOutput(){
            return output;
    }

    public abstract void encode();

    public abstract void decode();

}
