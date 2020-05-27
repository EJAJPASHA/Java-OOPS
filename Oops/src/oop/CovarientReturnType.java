package oop;

/*
 * Covariant return types :- 
 * Example 1:-  
 * in below example overriding is not possible because 
 * overridden method return type & overriding method return types are not matched. 
 * class Parent 
 * { 
 * void m1()
 * {
 * }
 *  }; 
 *  class Child extends Parent 
 *  {
 *  int m1()
 *  {
 *  }
 *    }; 
 *    Compilation error:- m1() in Child cannot override m1() in Parent     
 *    return type int is not compatible with void 
 */

class Varient  {
	void m2()
	{
		System.out.println("Animal class m2() method");
		} 
	Varient m1()  
	{
		return new Varient();  
		} 
	}

public class CovarientReturnType extends Varient{
	/*
	 * Example-2:- 
	 * 1) Before java  5 version it is not possible to override the methods  
	 * by changing it’s return types . 
	 * 2) From java5 versions onwardsjava supports  support covariant return types 
	 * it means while overriding it is possible to change the return types of 
	 * parent class method(overridden method) &child class method(Overriding). 
	 * 3) The return type of overriding method is must be sub-type of overridden method return type 
	 * this is called covariant return types.
	 */
	CovarientReturnType m1()  { return new CovarientReturnType();  }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CovarientReturnType c=new CovarientReturnType();
		c.m1();
		c.m2();
		Varient a = new Varient();      
		a.m2();   
		Varient a1 = a.m1(); //  [a.m1() returns Varient object]   
		a1.m2();

	}

}
