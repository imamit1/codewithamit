package com.Codingwithjava;



public class AccelDemoArray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	    
		int[] ar={1,2,3,4,5,5,6,3,2,1,3,4,6};
		
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				for(int k=j+1;k<ar.length;k++) {
					int sum=ar[i]+ar[j]+ar[k];
					for(int l=0;l<ar.length;l++) {
						if(sum==ar[l]) { 
							System.out.println(sum);
					     break;
						}
						
					}
					
				}
			}
			
		}
	}

}
