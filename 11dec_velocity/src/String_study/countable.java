package String_study;

public class countable {

	public static void main(String[] args) {
		String  s= "group no is nine";
	int	s1= s.length();//16
	String s2 =s.replace("o", "");
	int s3= s2.length();
int	count  =s1-s3;
System.out.println( " "+count);

String  ss= "group no is nine";
int count1 =1;
  for ( int i=0;i<=ss.length()-1;i++) {
	  
	  if ( (ss.charAt(i) ==' ') &&  ( ss.charAt(i+1 )!= ' ') ) 
	  {
		  count1++;
		  
	  }
	 
  }
  System.out.println( " number of word  " + count1);
  
	}

}
