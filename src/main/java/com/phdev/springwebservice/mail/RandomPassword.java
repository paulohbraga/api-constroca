package com.phdev.springwebservice.mail;

import java.util.concurrent.ThreadLocalRandom;

public class RandomPassword {
	
	public static String generatePassword() {
		
		String letterString = "abcdefghijklmnoprstuvxwyz";
		
		String numbersString = "0123456789";

		String specialString = "!@#$%&*";
		
		String password = new String();
		
		for (int i = 0; i < 3; i++) {
						
			int getRandomToSpecialIndex = ThreadLocalRandom.current().nextInt(0, 7);
			int getRandomToLetterIndex = ThreadLocalRandom.current().nextInt(0, 25);
			int getRandomToNumIndex = ThreadLocalRandom.current().nextInt(0, 10);

			
			password += letterString.charAt(getRandomToLetterIndex);
			password += specialString.charAt(getRandomToSpecialIndex);
			password += numbersString.charAt(getRandomToNumIndex);
		}   
		return password;
	 
	    
	}

}
