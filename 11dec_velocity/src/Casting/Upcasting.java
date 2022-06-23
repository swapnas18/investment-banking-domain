package Casting;

public class Upcasting {

	//public static void main(String[] args) {}
	void  Chemistry () {  
System.out.println(" #Chemistry ");}
void Acid() {System.out.println(" #Acidic properties\n");}
void  Base (){System.out.println("#Basic properties\n");   }}

class Upcasting1 extends Upcasting{//2nd class
	
void Acid () {System.out.println("#lewis acid ");}
void Base() {System.out.println(" #lewis base");}
void neutral () {System.out.println("#conc.on of H+ and oH- are equal");}}//own method

class Upcasting2 extends Upcasting1 {//3rd class
	 public static void main(String[] args) {
		 System.out.println("@Upcast for reference and  object create  upcasting1\n ");
		 Upcasting s=new Upcasting1();
		 s.Acid();s.Base();s.Chemistry();
		// s.neutral(); only call commen method
		 System.out.println("@\nupcasting1 for reference and object create upcasting2\n ");
		 Upcasting1 s1=new Upcasting2();
		s1.Acid();
		 s1.Base();
		 
	}
	
void Acid () {System.out.println("#carboxylic acid");}
void neutral () {System.out.println("#neutralize");
	
}
}