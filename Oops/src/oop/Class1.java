package oop;
class Animal{ }; 
class Dog extends Animal{ }; 

public class Class1 {
	/*
	 * Instanceof operator:- 
	 *  It is used check the type of the object and return Boolean value as a return value. 
	 * Syntax:- reference-variable instanceof class-name; 
	 * Example:- 
	 * Test t=new Test(); 
	 * t instanceof Test 
	 *  Whenever we are using instanceof operator the reference variable and
	 * class-name must have some relationship either [parent to child] or
	 * [child-parent] otherwise compiler generates error message “inconvertible types” 
	 *  If the relationship is 
	 * o Child – parent returns true 
	 * o Parent - child returns false
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//syntax: (ref-ver instanceof  class-name);   
		String str="ratan";   
		Animal a = new Animal();   
		Dog d = new Dog();   
		Object o = new Object(); 
		System.out.println(a instanceof Object);  //true  [child-parent] 
		System.out.println(d instanceof Animal);  //true [child-parent] 
		System.out.println(str instanceof Object); //true [child-parent] 
		System.out.println(o instanceof Animal);  //false [parent-child] 
		System.out.println(a instanceof Dog);  //false [parent-child] 
		//no relationship compilation error :inconvertible types 
		//System.out.println(str instanceof Animal); 

	}

}
