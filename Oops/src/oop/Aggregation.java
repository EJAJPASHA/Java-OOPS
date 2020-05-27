package oop;
/*
Aggregation:-
Class A has instance of class B.
 Class A can exists without presence of class B . 
a university can exists without chancellor. 
 Take the relationship between teacher and department. 
A teacher may belongs to multiple departments hence teacher is a part of multiple departments 
but if we delete department object teacher object will not destroy.   

  
 */

class Teacher
{
	String tname;
	String sub;
	public Teacher(String tname, String sub) {
		super();
		this.tname = tname;
		this.sub = sub;
	}
	
	
}

public class Aggregation {  //if we delete department teacher can exists is called aggregation 
	int did;
	Teacher t;
	

	public Aggregation(int did, Teacher t) {
		super();
		this.did = did;
		this.t = t;
	}
	void disp()  {
		System.out.println("Department id :--->"+did);   
	    System.out.println("Teacher details :--->"+t.tname+"---"+t.sub);  
	} 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher x1=new Teacher("bhagyalaxmi","telugu");
		Aggregation d=new Aggregation(101,x1);
		d.disp();

	}

}
