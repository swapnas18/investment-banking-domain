package constructor;

public class Consructor2 {
 Consructor2()//it is user defined zero parameter constructor
{ System.out.println("running zero parameter constructor");
	}



	public static void main(String[] args) {
	Consructor2 s2=new Consructor2();//creating object of a class
s2.test1();
	}

	public void test1()
	{   System.out.println("this is test1 non static ");  
	
	
	}
} 
