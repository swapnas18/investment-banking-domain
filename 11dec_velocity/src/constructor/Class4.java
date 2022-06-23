package constructor;

public class Class4 {
int a;int b;  int c;String d;
	 public Class4 ()
	 {a=67;b=20;c=10;d="velocity"; //variable initilization
		  
	 }
	 public Class4(int value1,int value2, int value3,String value4 )
	 {a=value1;b=value2;c=value3;d=value4;
		 //constructor with multiple parameter
	 
	 }
public  static void main(String[] args) {
	    Class4 c1=new Class4();	
c1.percentage();
Class4 c2= new Class4(10,20, 30,"velocity_grp");
c2.percentage();
	}
	public void percentage()
	{long perct=(a+b+c)/3;
	String add=d;
		System.out.println( "the percentage is "+ perct  + "%  "+  add);
	}

}
