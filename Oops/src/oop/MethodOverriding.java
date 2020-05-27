package oop;

/*
 * Runtime polymorphism [Method Overriding]:- 
 * 1) If we want to achieve method overriding we need two class with parent and child relationship. 
 * 2) The parent class method contains some implementation (logics). 
 * a. If child is satisfied use parent class method. 
 * b. If the child class not satisfied (required own implementation) then override the method in Child class. 
 * 3) A subclass has the same method as declared in the super class it is known as method overriding. 
 * The parent class method is called ===> overridden method 
 * The child class method is called  ===> overriding method 
 * 
 * While overriding methods must fallow these rules:- 
 * 1) While overriding child class method signature & parent class method signatures 
 * must be same otherwise we are getting compilation error. 
 * 2) The return types of overridden method & overriding method must be same.   
 * 3) While overriding the methods it is possible to maintains same level permission or 
 * increasing order but not decreasing order, if you are trying to reduce the permission 
 * compiler generates error message “attempting to assign weaker access privileges ”. 
 * 4) You are unable to override final methods. (Final methods are preventing overriding). 
 * 5) While overriding check the covariant-return types. 
 * 6) Static methods are bounded with class hence we are unable to override static methods.
 * 7) It is not possible to override private methods because these methods are specific to class
 */

class Wuhan //parent class 
{ 
	void property()  
	{
		System.out.println("money+land+hhouse");
		}  
	void marry()  
	{
		System.out.println("black girl"); 
		}//overridden method };
}


/*class Dog
{ 
	void instanceMethod()
	{
		System.out.println("instance method in  Dog");
	}  
static void staticMethod()
{
	System.out.println("static method in  Dog");
	} 
}; 
*/

public class MethodOverriding extends Wuhan{
	
	void marry() 
	{
		System.out.println("white girl/red girl");
		} 
		
	/*
	void instanceMethod()
	{
		System.out.println("instance method in MethodOverriding");
		}//overriding  
	static void staticMethod()
	{
		System.out.println("static method in MethodOverriding");
		}//hiding 
		*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * If a subclass defines a static method with the same signature as a static method in the superclass, 
		 * then the method in the subclass hides the one in the superclass. 
		 */
		/*
		 *  The version of the overridden instance method that gets invoked is the one in the subclass. 
		 *  The version of the hidden static method that gets invoked depends on whether 
		 * it is invoked from the superclass or the subclass. 
          The Cat class overrides the instance method in Animal and hides the static method in Animal. 
          The main method in this class creates an instance of Cat and invokestestClassMethod() 
          on the class and testInstanceMethod() on the instance. 
		 */
		/*
		MethodOverriding a = new  MethodOverriding();   
		a.instanceMethod();   
		a.staticMethod(); 
		//Dog.instanceMethod(); 
		Dog d= new Dog();
		d.instanceMethod();
		d.staticMethod();
		*/
		
		MethodOverriding c=new MethodOverriding();   
		  c.property();  
		  c.marry();   
		  Wuhan p=new Wuhan();  
		   p.property();  
		   p.marry(); 
		 
				

	}

}
