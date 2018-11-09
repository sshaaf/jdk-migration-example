package com.redhat.migr.examples.encrypt;

import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.KeyAgreement;


/***
 * 
 * 
 *  Crypto check
 *  ref: https://github.com/windup/windup-rulesets/blob/master/rules-reviewed/openjdk7/oraclejdk7/oracle2openjdk.rhamt.xml
 * 
 * 
 * 
 * */

public class GenerateSecrets {

	protected static byte[] generate(String algo, PrivateKey privK, PublicKey pubK) throws Exception {
		
		KeyAgreement agreement = KeyAgreement.getInstance("SH");
		agreement.init(privK);
		agreement.doPhase(pubK, true);

		return agreement.generateSecret();
	}

}
