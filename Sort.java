package com.ineuron;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ashiya";
		char[] ch=str.toCharArray();
		char temp;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[j]<ch[i]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					
			}
			}
		}
		System.out.println(ch);

	}

}
