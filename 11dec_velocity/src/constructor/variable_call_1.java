package constructor;

public class variable_call_1 {

	public static void main(String[] args) {
	Variable_call s4=new Variable_call();
System.out.println("value of a is "+s4.a);//calling nonstatic method from another class
System.out.println("value of b is "+ Variable_call.b);

	}

}
