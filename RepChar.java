package com.ineuron;

public class RepChar {

	public static void main(String[] args) {
		
		String str="ashiya";
		char[] ch=str.toCharArray();
		System.out.println(ch);
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[i]);
				}
				
			}
		}

	}

}
