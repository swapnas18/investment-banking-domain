package interface_study;

public interface Ic {

	 void s1();
	 void s2()
;
	 void s3();
	}
	interface Ic2 {
		
		void s4();
		void s5();
		void s6();
		
} 
	abstract class    Ic3 implements Ic2,Ic {

	 
		
		
	
public  abstract void s7 ();
	@Override
	public void s1() {
		System.out.println("complete method s1 in implement class ic3 from ic interface \n");
		
	}	@Override
	public void s2() {
		System.out.println("complete method s2 in implemnt class from ic interface ic\n ");
}	@Override
	public void s3() {
		System.out.println(" complete method s3 in implemnt class from ic interface ic\n");	}
	public void s4() {
		System.out.println("complete method s4 in implemnt class from ic2 interface ic\n");
}

	@Override
	public void s5() {
		System.out.println("complete method s5 in implemnt class from ic2 interface ic\n");
		
	}
	public void s6() {
		System.out.println("complete method s2 in implemnt class from ic interface ic\n");
		
	}}
	 class Ic4 extends Ic3{

			public static void main(String[] args) {
				Ic4 i=new Ic4();
				i.s1();
				i.s2();
				i.s3();
				i.s4();
				i.s5();
				i.s5();
				i.s6();	i.s7();	

			}

			@Override
			public void s7() {
			System.out.println("complete method  s7 in ic4  from Ic3 abstract class\n");
				
			}

	 }

