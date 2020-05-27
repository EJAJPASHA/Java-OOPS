package oop;

import org.omg.Messaging.SyncScopeHelper;

/*
 * toString():- 
 *  toString() method present in Object and it is printing String representation of Object. 
 *  toString() method return type is String object it means toString() method is returning String object. 
 *  The toString() method is overridden some classes check the below implementation. 
 * o In String class toString() is overridden to return content of String object. 
 * o In StingBuffer  class toString() is overridden to returns content of StringBuffer class. 
 * o In Wrapper classes(Integer,Byte,Character…etc) toString is overridden to returns 
 * content of Wrapper classes. 
 */
/*
 * internal implementation:- 
 * class Object 
 * {
 *  public String toString()  
 *  { 
 *  return getClass().getName() + '@' + Integer.toHexString(hashCode());  
 *  } 
 *  };
 */

public class ToStringMethod {
	String sname;
	int sid;
	double sfee;
	

	public ToStringMethod(String sname, int sid, double sfee) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.sfee = sfee;
	}
	public String toString()
	{
		return sname+"\t"+sid+"\t"+sfee;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringMethod t1=new ToStringMethod("ezaz",101,2000);
		ToStringMethod t2=new ToStringMethod("ezaz",101,2000);
		ToStringMethod t3=new ToStringMethod("ezaz",101,2000);
		//with out overriding tostring method output in this form
		System.out.println(t1);//oop.ToStringMethod@6d06d69c
		System.out.println(t2);//oop.ToStringMethod@7852e922
		System.out.println(t3);//oop.ToStringMethod@4e25154f
		//after overriding output in this form
		System.out.println(t1);//ezaz 101 2000.0
		System.out.println(t2);//ezaz 101 2000.0
		System.out.println(t3);//ezaz 101 2000.0

	}

}
