package com.Codingwithjava;

public class AccelDemo {

	public static void main(String[] args) {
		
	  int[] arr={1,2,3,4,5,5,6,3,2,1,3,4,6};
	     for(int i=0;i<arr.length;i++){
	       for(int j=i+1;j<arr.length-2;j++){
	          if(arr[i]+arr[j]==10){
	              System.out.println("("+arr[i]+","+arr[j]+")");
	            }
	             else if(arr[i]+arr[j]+arr[j+1]==10){
	               System.out.println("("+arr[i]+","+arr[j]+","+arr[j+1]+")");
	                }
	                 else if(arr[i]+arr[j]+arr[j+1]+arr[j+2]==10){
	                   System.out.println("("+arr[i]+","+arr[j]+","+arr[j+1]+","+arr[j+2]+")"); 
	                }
	            }
	        }
	}

}
