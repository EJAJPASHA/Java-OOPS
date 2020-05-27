package oop;
/*
 * Encapsulation:- 
 * The process of binding the data and code as a single unit is called encapsulation. 
 * We are able to provide more encapsulation by taking the private data(variables) members. 
 * To get and set the values from private members use getters and setters to set the data and to get the data. 
 */

public class Encapsulation {
	private int sid;
	private char sname;
	

	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public char getSname() {
		return sname;
	}


	public void setSname(char sname) {
		this.sname = sname;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation e=new Encapsulation();
		e.setSid(102);
		e.setSname('z');
		System.out.println(e.getSid());
		System.out.println(e.getSname());
		

	}

}
