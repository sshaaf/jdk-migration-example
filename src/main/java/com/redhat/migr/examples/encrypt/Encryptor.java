package com.redhat.migr.examples.encrypt;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/***
 * 
 * 
 * Should work, no conflicts
 * ref: https://github.com/windup/windup-rulesets/blob/master/rules-reviewed/openjdk7/oraclejdk7/oracle2openjdk.rhamt.xml
 * 
 * 
 * */

public class Encryptor {

	public byte[] dataEncrypt(String srcTxt) throws NoSuchAlgorithmException, UnsupportedEncodingException,
			InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {

		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		keyGen.init(128);

		SecretKey key = keyGen.generateKey();
		byte[] srcBytes = srcTxt.getBytes("UTF8");

		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, key);

		return cipher.doFinal(srcBytes);

	}

	
	public static void main(String args[]) {
		
		try {
			new Encryptor().dataEncrypt("Migration");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
