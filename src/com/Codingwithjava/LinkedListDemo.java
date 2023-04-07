package com.Codingwithjava;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("a");
		l.add("b");
		l.add(null);
		l.add(5);   
		l.add(2,"d"); //index 2 pr d a jyega or null index 3 pr chla jyega 
		l.remove(3);
		System.out.println(l);

	}

}
