package oops_principle;


 	public class Accessspecifier
 	
 	
 	
 	{
	public  static void main(String[] args) {
	Grandparent gp=new Grandparent();//create object for class grand father
	gp.property();
	Grandparent.inherited();
	parent.parents_property();
	parent.inherited();
	child.parents_property();
	child cd=new child();
	cd.property();
	cd.childs_property();
child.inherited();child.parents_property();}
	public void test() {
		System.out.println("this is multiclass method");
	}

} class Grandparent{
	 public  void property() {
		  int a=2; 
	System.out.println( "grandfather have "+ a  +" hect.farm");}
		 public static void inherited (){
			 System.out.println( "curly hair & white colour");
			 } }
	 class parent extends Grandparent {
		protected  static void   parents_property() {
			System.out.println(  " parents property is bike");}
	}
	class child extends parent{

		   void  childs_property()
		{System.out.println( "child have farm  and bike from parents"); }
	}

