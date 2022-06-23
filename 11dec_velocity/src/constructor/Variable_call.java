package constructor;

public class Variable_call {

	int a=12 ;//non static variable
			static int b=20;//static variable
			String name="velocity";
	
	public static void main(String[] args) {
		
Variable_call s3=new Variable_call();
	System.out.println("value of the variable a is "+s3.a);
	System.out.println("value of variable b is  "+ b);
	System.out.println("value of name is " + s3.name);
	}

	
	
	
}
