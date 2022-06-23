package oops_principle;

public class polymorphism_overloading {
 int a=10;
String b="sapna";
int a1=30;
public static void main(String[] args) {
	polymorphism_overloading o= new polymorphism_overloading();
System.out.println(o.a );
System.out.println(o.b);
System.out.println(o.a1);
o.S1();
o.S1(40,"\nshinde\n", 50);
o.S1(60.78f,"\npandharour \n" ,87.87f);
o.S1(80," \nsolapur\n", 65);
o.S1(100, "\nINDIA\n", 98);	
}
public void S1() {
}

public void S1(int a,String b,int a1) {
	System.out.println(a+b+a1);
	
}
public void S1( float a,String c,float a1) {
	System.out.println(a+c+a1) ;
	
} 
public void S1( short a,String d, short a1) {
	//System.out.println();
}

public void S1( byte a,String d, byte a1) {
	//System.out.println();
	
}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


