package oop;

/*
 *  One thing can exhibits more than one form is called polymorphism. 
 *  Polymorphism shows some functionality(method name same) with different logics execution. 
 *  The ability to appear in more forms is called polymorphism. 
 *  Polymorphism is a Greek word poly means many and morphism means forms. 
 *     
 * There are two  types of polymorphism in java 
 * 1) Compile time polymorphism / static binding / early binding [method execution decided at compilation time]
 *   Example :- method overloading. 
 * 2) Runtime polymorphism /dynamic binding /late binding. [Method execution decided at runtime]. 
 * Example :- method overriding. 
 */

public class Polymorphism {

	
		// TODO Auto-generated method stub
		/*
		 * Compile time polymorphism [Method Overloading]:- 
		 * 1) If java class allows two methods with same name but different number of arguments 
		 * such type of methods are called overloaded methods. 
		 * 2) We can overload the methods in two ways in java language 
		 * a. By passing  different number of arguments to the same methods. 
		 * void m1(int a){} void m1(int a,int b){} 
		 * b. Provide the same number of arguments with different data types.
		 *  void m1(int a){} void m1(char ch){} 
		 *  3) If we want achieve overloading concept one class is enough. 
		 * 4) It is possible to overload any number of methods in single java class.
		 */
		
		/*
		 * Types of overloading
		 * a. Method overloading  explicitly by the programmer 
		 * b. Constructor overloading 
		 * c. Operator overloading  implicitly by the JVM(‘+’ addition& concatenation)
		 */
		
		//below three methods are overloaded methods.
	//A) Method overloading
		void m1(char ch) 
		{
			System.out.println(ch+" char-arg constructor "); 
			}  
		void m1(int i)  
		{
			System.out.println("int-arg constructor "+i); 
			} 
		void m1(int i,int j) 
		{
			System.out.println(i+j);   
			}  
		
		//B) Constructor overloading
		/*
		 * Constructor Overloading:- 
		 * The class contains more than one constructors with same name but 
		 * different arguments is called constructor overloading. 
		 */
		Polymorphism()  { System.out.println("0-arg constructor");  }  
		Polymorphism(int i) { System.out.println("int argument constructor"); }  
		Polymorphism(char ch,int i){ System.out.println(ch+"-----"+i);   } 
		
		public static void main(String[] args)   
		{   
			//A
			Polymorphism t=new Polymorphism();  //three methods execution decided at compilation time  
			t.m1('a');t.m1(10);t.m1(10,20); 
			//B
			Polymorphism t1=new Polymorphism(); //zero argument constructor executed.   
			Polymorphism t2=new Polymorphism(10); // one argument constructor executed.   
			Polymorphism t3=new Polymorphism('a',100);//two argument constructor executed
			//C
			/*
			 * Operator overloading:- 
			 *  One operator with different behavior  is  called Operator overloading . 
			 *  Java is not supporting operator overloading but only one overloaded in java  language 
			 * is ‘+’. o If both operands are integer + perform addition. 
			 * o If at least one operand is String then + perform concatenation. 
			 */
			int a=10;   
			int b=20;   
			System.out.println(a+b); //30 [addition]   
			System.out.println(a+"ratan"); //10Ratan [concatenation] 
		}
		

	}


