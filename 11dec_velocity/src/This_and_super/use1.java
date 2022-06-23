package This_and_super;



public class use1 {
	String s="sapna";
	int a=90;
static	int b=50;
	public static void main(String[] args) {
		use1 ss=  new use1();
		ss.A();
		Use_Super spn= new Use_Super();
		spn.B();
		
	}
protected  void A() {
	String s="shinde";
	int a=10; int b=30;
	 int sum=a+b; 
	System.out.println( " addition of local value   " + s +" "+ sum);
	int sum1=this.a+this.b;    
	System.out.println("addition of "+sum1 +"  "  + this.s  );}
}
 class  Use_Super extends use1 {
	
	 void B() {
		 int a=100;
		 int sum=super.a+  a;
		 System.out.println("addition of  "+ sum );
		 System.out.println(super.s);
			System.out.println(super.a);}
	

}
