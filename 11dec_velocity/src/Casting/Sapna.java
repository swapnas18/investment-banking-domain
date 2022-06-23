package Casting;

public class Sapna {

	
	void s1 ()
	{System.out.println("s1");}
	
	
	void s2()
	{System.out.println("s2");}
}
	


class sapna2 extends Sapna { 
	
	public static void main(String[] args) {
		
		Sapna s=new sapna2();
		
		s.s1();
		 s.s2();
	}
	
	void s1() {
		System.out.println(" second s1");}
		
	
	void s2() {
			System.out.println(" second s2");
		}
	
} 
	


