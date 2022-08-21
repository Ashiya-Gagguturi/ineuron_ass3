package com.ineuron;

public class SpclChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ashiy*&&^a";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i))&&
					!Character.isAlphabetic(str.charAt(i))&&
					!Character.isWhitespace(str.charAt(i))){
				count++;
			}
		}
		System.out.println("Count of Special Characters in a string----"+count);
		
	}

}
