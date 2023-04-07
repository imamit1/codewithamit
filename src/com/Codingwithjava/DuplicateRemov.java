package com.Codingwithjava;

public class DuplicateRemov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {1,2,2,3,4,5,5,6,7,7};
		int j=0;
		for (int i = 0; i < ar.length-1; i++) {
			if(ar[i]!=ar[i+1]) {
				ar[j]=ar[i];
				j++;
			}
		}
		ar[j]=ar[ar.length-1];
		for (int i = 0; i < j+1; i++) {
			System.out.print(ar[i]+" ");
		}
        
	}

}
