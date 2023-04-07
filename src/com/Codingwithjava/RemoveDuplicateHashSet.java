package com.Codingwithjava;

import java.util.HashSet;

public class RemoveDuplicateHashSet {

	public static void main(String[] args) {
		int[] ar= {4,1,3,2,2,5,6,6,6,7,8};
		HashSet<Integer> hs=new HashSet<>();
		for (int i = 0; i < ar.length; i++) {
			hs.add(ar[i]);
		}
		for (int no : hs) {
			System.out.println(no);
		}
	}

}
