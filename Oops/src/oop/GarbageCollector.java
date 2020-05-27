package oop;
/*
 *  Garbage collector is destroying the useless object  and it is a part of the JVM.
 *  To make eligible objects to the garbage collector 
 * Example-1 :- 
 * Whenever we are assigning null constants to our objects then objects are eligible for 
 * GC(garbage  collector)
 * Example-2 :- 
 * Whenever we reassign the reference variable the objects are automatically eligible for garbage collector.
 * Example -3:- 
 * Whenever we are creating objects inside the methods one method is completed the objects 
 * are eligible for garbage collector. 
 * Ex:- if the garbage collector is calling finalize method at that situation exception is raised  
 * such type of exception are ignored.
 * Ex:-  If user is calling finalize() method explicitly at that situation exception is raised. 
 *    
 */

public class GarbageCollector {
	public void finalize()  
	{
		System.out.println("ratan sir destroyed");   
		int a=10/0;  
		} 
	void m1()
	{
		GarbageCollector g3=new GarbageCollector();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollector g1=new GarbageCollector();
		GarbageCollector g2=new GarbageCollector();
		g1=null;
		g2=null;
		g1=g2;////reassign reference variable then one object is destroyed. 
		//g1.m1();
		System.out.println(g1);
		System.out.println(g2);
		g2.finalize();
		System.gc();

	}

}
