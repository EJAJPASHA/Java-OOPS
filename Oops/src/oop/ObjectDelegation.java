package oop;

/*
 * Object delegation:- 
 * The process of sending request from one object to another object is called object delegation. 
 */
class RealPerson  //delegate   class 
{ 
	void book()
	{
		System.out.println("real java book");
		} 
	}; 
	class DummyPerson  //delegator class 
	{ 
		RealPerson r = new RealPerson();  
		void book(){r.book();} //delegation 
		}; 
	
public class ObjectDelegation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//outside world thinking dummy Person doing work but not. 
		DummyPerson d = new DummyPerson();   
		d.book(); 

	}

}
