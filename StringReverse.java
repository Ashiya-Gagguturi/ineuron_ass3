package com.ineuron;

public class StringReverse {
	public static void main(String args[]) {
	String s="iNeuron";
	String sRev="";
	for(int i=s.length()-1;i>=0;i--) {
		sRev=sRev+s.charAt(i);
		
	}
	System.out.println(sRev);
}
}


