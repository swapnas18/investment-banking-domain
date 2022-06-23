package interface_study;

public class Interface2  implements interface1{

	public static void main(String[] args) {
		Interface2 s=new Interface2();
		s.s1();
		s.s2();
		s.s3();
		

	}


	public void s1() {
	
	System.out.println("method s1 complete in implemebtation class\n");
	}

	
	public void s2() {
		
		System.out.println("method  s2 complete in  implementation class\n");
	}
 public void s3() {
	 System.out.println("method s3 complete in implements it is own method");
 }
}
