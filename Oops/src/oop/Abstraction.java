package oop;
/*
 * Abstract methods:- 
 * 1) The method which is having only method declaration but not method implementations 
 * such type of methods are called abstract Methods. 
 * 2) In java every abstract method must  end with “;”. 
 * Example : - abstract void m1 ();    --- method declaration 
 * Abstrac Class :-
 * If any abstract method inside the class that class must be abstract. 
 * Abstract modifier:- 
 *  Abstract modifier is applicable for methods and classes but not for variables. 
 *  To represent  particular class is abstract class and particular method is abstract 
 * method to the compiler  use abstract modifier. 
 *  The abstract class contains declaration of methods it says abstract class 
 * partially implement class hence for partially implemented classes object creation is not possible. 
 * If we are trying to create object of abstract class compiler generate error message 
 * “class is abstract con not be instantiated”
 * 
 *  Abstract class contains abstract methods for that abstract methods provide 
 * the implementation in child classes. 
 *  Provide the implementations is nothing but override the methods in child classes. 
 *  The abstract class contains declarations but for that declarations 
 * implementation is present in child classes. 
 * 
 *  Abstract class contains abstract methods for that abstract methods provide 
 * the implementation in child classes. 
 *  if the child class is unable to provide the implementation of all  
 * parent class abstract methods at that situation declare that class with  abstractmodifier 
 * then  take one more child class to complete the  implementation of remaining abstract methods. 
 *  It is possible to declare multiple child classes but at final complete the implementation 
 * of all methods. 
 * 
 * inside the abstract class it is possible to declare variables as
 * public
 * static
 * final
 * 
 *  for the abstract methods it is possible to provide any return type(void, int, char,Boolean…..etc) 
 *  
 *  It is possible to override non-abstract method as a abstract method in child class. 
 *  
 *   Constructor is executed during object creation to initialize values to instance variables.  
 *   Constructors are used to write the  functionality that functionality executed during  
 *  object creation. 
 *   There are multiple ways to crate object in java but if we are crating object 
 *  by using “new” then only constructor executed. 
 *  
 *  Abstract class may contains abstract methods or may not contains 
 *  abstract methods but object creation is not possible. 
 *  The below example contains zero number of abstract methods.  
 *  Ex:- HttpServlet (doesn’t  contains abstract methods still it is abstract object creation not possible )
 *  
 *   Abstraction definition :- 
 *    The process highlighting the set of services and hiding the internal implementation 
 *   is called abstraction. 
 *    Bank ATM Screens Hiding the internal implementation and highlighting set of services like , 
 *   money transfer, mobile registration,…etc). 
 */
abstract class Ideal
{
	public Ideal() {
		// TODO Auto-generated constructor stub
		System.out.println("abstract class constructor");
	}
	abstract int m1(int a);
	void m4(){System.out.println("m4 method");}   //normal method 
}

public class Abstraction extends Ideal {
	public Abstraction() {
		// TODO Auto-generated constructor stub
		System.out.println("normal class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction ab=new Abstraction();
		int a=ab.m1(10);
	    ab.m4();
	    new Abstraction();
	}
		
	@Override
	int m1(int a) {
		// TODO Auto-generated method stub
		System.out.println("this is m1 method"+a);
		return 100;
	}

}

