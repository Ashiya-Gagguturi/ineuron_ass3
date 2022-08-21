package com.ineuron;

public class Pangram {
	public static void main(String args[]) {
		String str="AshiyaSanju";
		str=str.toLowerCase();
		boolean result=false;
		for(char ch='a';ch<='z';ch++) {
			if(!str.contains(String.valueOf(ch))) {
				result=true;
				
			}
		}
		if(!result) {
			System.out.println("Given String is Pangram");
		}
		else {
			System.out.println("Given String is not paragram");
		}
		
	}

}
