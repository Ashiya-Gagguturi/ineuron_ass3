package com.ineuron;

public class VowCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ashiya";
		str=str.toLowerCase();
		int vCount=0,cCount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vCount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				cCount++;
			}
		}
		System.out.println("Vowels Count:::::"+vCount);
		System.out.println("Constant Count:::"+cCount);

	}

}
