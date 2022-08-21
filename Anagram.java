package com.ineuron;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s="Ashiya";
		String s1="Sanjua";
		if(s.length()==s1.length()) {
			char[] sChar=s.toCharArray();
			char[] s1Char=s1.toCharArray();
			Arrays.sort(sChar);
			Arrays.sort(s1Char);
			boolean result = Arrays.equals(sChar, s1Char);
			if(result) {
				System.out.println("Given Strings are anagrmam");
			}
			else {
				System.out.println("Not Anagram");
			}
			
		}
		else {
			System.out.println("Not Anagram");
		}

	}

}
