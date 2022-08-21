package com.ineuron;

public class StrRevPreposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Think Twice";
		String sRev="";
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++) {
			for(int j=a[i].length()-1;j>=0;j--) {
				sRev=sRev+a[i].charAt(j);
			}
			sRev=sRev+" ";
		}
		System.out.println(sRev);
	}

}
