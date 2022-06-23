package oops_principle;

public class polymorphism_overriding {

	public static void main(String[] args) {
	second s1= new second();
	s1.s();
	s1.s(1);
	third s2=new third();
	
	s2.s();
	fourth s3 =new fourth();
	s3.s();

	}
	

} 
class second{//2nd class
public  void s() {
	 System.out.println("CHHATRAPATI SHIVAJI MAHARAJ INSPIRING QUOTES  :-\n");}
	public void s(int a) {
		System.out.println(a);
	}


}
class third extends second{//3rd class
	 public void s () {
		 System.out.println("NEVER BEND YOUR HEAD ALWAYS HOLD IT HIGH \n");
	 }
} 
class fourth extends third{// 4 th class
	public void s() {
		System.out.println("FREEDOM IS A BOON,WHICH EVERYONE HAS THE RIGHT TO RECEIVE");
	}
}