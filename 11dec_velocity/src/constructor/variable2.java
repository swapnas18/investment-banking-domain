package constructor;


public class variable2
{

	
	
	public static void main(String[] args) {
	
System.out.println("running constructor method");
//create object
	variable2 s1=new variable2();
//calling non static method
	s1.test1();
Consructor2 a1=new Consructor2();
 a1.test1();
	Variable_call a2 =new Variable_call();
	System.out.println("calling non static method constructor a is "+a2.a);
	System.out.println("calling static method constructor b is "+Variable_call.b);
	System.out.println("calling nonstatic method contructor name is "+ a2.name);
	}
	public  void  test1()
	{ 
		System.out.println("hi this is test1 Non-static method");
		
	}
}
