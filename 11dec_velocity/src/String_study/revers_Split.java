package String_study;

public class revers_Split{

	public static void main(String[] args) {
	System.out.println(" revers words  \n my name is swapna \n");
	
	
	
	
	
		String ss= " my  name  is  swapna";
		String s []= ss.split(" ");
		for ( int i=s.length-1;i>=0;i--) {
			System.out.print( s[i]  +"  " );
		}
		
		
	}

}
