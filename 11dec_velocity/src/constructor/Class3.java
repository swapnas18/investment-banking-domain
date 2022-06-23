package constructor;

public class Class3 {
 
	float x;float y;float z;//variable declaration//
	
	public Class3()
	{ x=10;y=20;z=30; 
	
	}//running zero parameter//variable initializing
	
	public Class3(float value1)
	{x=value1;}//running single parameter
	
	public Class3(float value1,float value2,float value3)
	{x=value1;y=value2;z=value3;}//running three parameter 

	public static void main(String[] args) {
	Class3 c1=new Class3();//creating object for zero parameter
	Class3 c2=new Class3(65);//creating object for single parameter
	Class3 c3=new Class3(43.5f,76,9);//creating object for three parameter
c1.multiplication();
c2.multiplication();
c3.multiplication();}

      public void multiplication()
     {     float total;
       total=x*y*z;
      System.out.println("total value is    "+total);
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



