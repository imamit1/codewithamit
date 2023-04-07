package com.Codingwithjava;

public class PrintDuplicateElements {

	public static void main(String[] args) {
		
		int[] ar= {1,2,2,3,4,5,5,6,7,7,8};
		
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = i+1; j < ar.length; j++) {
				
				if(ar[i]==ar[j]) {
					
					System.out.println(ar[j]);
				}
			}
			
		}

	}

}
