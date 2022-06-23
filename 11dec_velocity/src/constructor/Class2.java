package constructor;

public class Class2 {
  
	//example user defined constructor
	String city="pune";//variable declaration manually
	String name;
	public Class2()//user defined constructor
	{
	name="velocity";}

	public static void main(String[] args) {
		
display1();
Class2 a=new Class2();
a.display();
	}
public void display()
{System.out.println("i am non static method");
System.out.println( "my name is "+  name);
System.out.println("my city name is  + city");
}
public static void display1()
{System.out.println("hi i am  static display1 method");
	

}
}
