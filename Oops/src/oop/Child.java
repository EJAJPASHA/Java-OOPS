package oop;
/*NOTE:1
 * In parent and child relationship first parent class static blocks are executed only one time  
 * then child class static blocks are executed only one time 
 * because static blocks are executed with respect to .class loading. 
 * 
 * NOTE:2
 * instanceblocks execution depends on number of object creations but not number of constructor executions. 
 * If we are creating 10 objects 10 times constructors are executed 
 * just before constructor execution 10 times instance blocks are executed.
 * 
 *  NOTE:3
 *  Static blocks execution depends on .class file loading 
 *  hence the static blocks are executed only one time for single class. 
 */

class Parent
{
	static 
	{
		System.out.println("parent static block");
	}

	public Parent() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("parent arg-0 constructor");
	}
	{
		System.out.println("parent instance block");
	}
}

public class Child extends Parent{
	static 
	{
		System.out.println("Child static block");
	}
	{
		System.out.println("child instance block");
	}
	
	public Child() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("child arg-0 constructor");

	}
	Child(int a){   
		this(10,90);//current class 2-argument constructor calling   
	System.out.println("Child 1-arg cons");
	} 
	Child(int a,int b)  { 
		//super();  //generated by compiler   
		System.out.println("Child 2-arg cons"); 
		}  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();
		Child c=new Child();
		Child c1=new Child(100);
		/*
		 * parent static block
Child static block
parent instance block
parent arg-0 constructor
parent instance block
parent arg-0 constructor
child instance block
child arg-0 constructor
parent instance block
parent arg-0 constructor
child instance block
Child 2-arg cons
Child 1-arg cons

		 */
		

	}

}
