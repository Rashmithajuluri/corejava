package com.tnsif.scannerclass;

public class Personexc {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("enter person name");
		String name = sc.nextLine();
		System.out.println("enter person's income");
		String income = sc.nextLine();
		
	    Personexc pp = new Personexc();
		pp.setName(name);
		pp.setInt(50000);
		
		
		
		System.out.println("After Modification");
		System.out.println(pp);
		

}

	private void setName(String name) {
		// TODO Auto-generated method stub
		
	}
	private void setInt(int i) {
		// TODO Auto-generated method stub
		
	}
}