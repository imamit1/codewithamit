package com.Codingwithjava;


class MyBaseClass extends Exception{
	
}
class MyDri extends MyBaseClass{
	
}
public class DemoSym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new MyDri();
		}
		catch(MyBaseClass b) {
			System.out.println("base");
		}
		catch(MyDri d) {
			System.out.println("dvri");
		}
	}

}
