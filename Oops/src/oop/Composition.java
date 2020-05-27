package oop;
/*
Composition:-
Class A owns class B,it is a strong type of aggregation. 
There is no meaning of child without parent.
 Order consists of list of items without order no meaning of items.or bank account consists of transaction
history without bank account no meaning of transaction history or 
without student class no meaning of marks class.
 Let’s take Example house contains multiple rooms,if we delete house object no meaning of room object hence
the room object cannot exists without house object.
 Relationship between question and answer,if there is no meaning of answer without question object hence
the answer object cannot exist without question objects.
 Relationship between student and marks,there is no meaning of marks object without student object.
*/

class Marks 
{ 
	int m1,m2,m3;  
	Marks(int m1,int m2,int m3) //local variables  
{ //conversions    
	this.m1=m1;   this.m2=m2;   this.m3=m3; 
	}
	}; 

public class Composition {
	Marks mk; //without student class no meaning of marks is called "composition"  
	String sname;  
	int sid; 
	

			public Composition(Marks mk, String sname, int sid) {
		super();
		this.mk = mk;
		this.sname = sname;
		this.sid = sid;
	}
			void display()  { 
				System.out.println("student name:-->"+sname);   
			    System.out.println("student id:-->"+sid);   
			System.out.println("student marks:-->"+mk.m1+"---"+mk.m2+"--"+mk.m3);  
			} 


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Marks m1 = new Marks(10,20,30); 
				Marks m2=new Marks(50,88,77);
				Composition c1=new Composition(m1,"ezaz",101);
				Composition c2=new Composition(m2,"pasha",201);
				c1.display();
				c2.display();

			}

}
