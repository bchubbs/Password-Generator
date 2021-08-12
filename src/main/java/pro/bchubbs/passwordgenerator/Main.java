package pro.bchubbs.passwordgenerator;

import org.apache.commons.lang3.RandomStringUtils;

public class Main {
	
	public static void main(String[] args) {
		int length = 32;
		String string = RandomStringUtils.random(length, true, true);
		
		System.out.println(string);
	}

}
