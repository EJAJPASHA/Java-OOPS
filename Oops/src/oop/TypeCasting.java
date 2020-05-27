package oop;
/*
 * Implicit-typecasting:- (widening) or (up casting) 
 * 1. When we assign lower data type value to higher data type that typecasting is called up- casting. 
 * 2. When we perform up casting data no data loss. 
 * 3. It is also known as up-casting or widening. 
 * 4. Compiler is responsible to perform implicit typecasting. 
 */
/*
 * Explicit type-casting:- (Narrowing) or (down casting) 
 * 1. When we assign a higher data type value to lower data type that type-casting is called down casting. 
 * 2. When we perform down casting data will be loss. 
 * 3.  It is also known as narrowing or down casting. 
 * 4. User is responsible to perform explicit typecasting. 
 */
/*
 * Note :- Parent class reference variable is able to hold child class  object but 
 * Child class reference variable is unable to hold parent class object. 
 */

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=120;
		int c=b;
		System.out.println(c);
		short d=10;
		int e=d;
		System.out.println(e);
		char ch='a';
		int a=ch;
		System.out.println(a);//97 ascii
		int f=200;
		float g=f;
		System.out.println(g);//200.0
		float h=22.33f;
		double i=h;
		System.out.println(i);//22.329999923706055
		long l1=20;
		float L= l1; //[automatic conversion of long-float]   
		System.out.println(L);//20.0
		/*
		char ch1='a';   
		short a1=ch1;
		System.out.println(a); //compilation error:possible loss of precision   
		float f1 = 10.5f;   
		long l = f1;   
		System.out.println(l); //compilation error:possible loss of precision   
		float f2=10.5f;   
        long l1 = f2; 
		System.out.println(l); 
		*/
		int a3=120;   byte b1 =(byte)a3;   
		System.out.println(b1); //120  
		int a2=130;   byte b2 =(byte)a2;   
		System.out.println(b2); //-126  
		float ff=10.5f;   int x = (int)ff;   
		System.out.println(x); //10  
		

	}

}
