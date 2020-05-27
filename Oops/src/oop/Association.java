package oop;

class Student 
{ 
	int sid;  
	String sname;  
	Student(int sid,String sname) //local variables  
	{ 
		//conversion   
		this.sid =sid;   
		this.sname=sname;  
		}  
	void disp()  
	{ 
		System.out.println("***student details***");   
		System.out.println("student name--->"+sname);   
		System.out.println("student name--->"+sid);  
		} 
	 
	}


public class Association { //teacher uses Student class "association" 
	/*
	 *  Class A uses class B 
	 *  When one object wants another object to perform services for it. 
	 *  Relationship between teacher and student, number of
	 * students associated with one teacher or one student can associate with
	 * number of teachers. But there is no ownership and both objects have their
	 * own life cycles.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(111,"ezaz");
		Student s1=new Student(121,"bajaj");
		s.disp();
		s1.disp();

	}

}
