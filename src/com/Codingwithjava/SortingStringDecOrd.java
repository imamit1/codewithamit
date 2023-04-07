package com.Codingwithjava;

import java.util.Arrays;
import java.util.Collections;

public class SortingStringDecOrd {

	public static void main(String[] args) {
		String[] star= {"bag","egg","Apple","dog","cat"};
		Arrays.sort(star,Collections.reverseOrder());
		System.err.println(Arrays.toString(star));

	}

}
