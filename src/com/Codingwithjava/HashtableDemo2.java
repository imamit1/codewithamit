package com.Codingwithjava;

import java.util.Hashtable;

public class HashtableDemo2 {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
	    h.put(new Demo(5), "A");
	    h.put(new Demo(2), "B");
	    h.put(new Demo(6), "C");
	    h.put(new Demo(15), "D");
		h.put(new Demo(23), "E");
		h.put(new Demo(16), "F");
		//h.put("amit", null);  //give nullpointerException
		System.out.println(h);
		
	}

}
class Demo
{
	int i;
	Demo(int i)
	{
		this.i=i;
	}
	public int hashCode() {
		return i%9;
	}
	public String toString() {
		return i+"";
	}

	
}
