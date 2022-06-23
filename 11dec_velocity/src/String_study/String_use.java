package String_study;

public class String_use {

	public static void main(String[] args) {
	String s="sapna";
	String s3 ="hanumant";
	String s1="nisha";
	String s2 ="samir";//constant pool are//without new keyword
	String s4 ="SAPNA";
	String s5 ="samir";	
String a = new String( "sapna");
	String a1 = new String( "nisha");
	String a2= new String( "samir");
	String a3= new String( "hanumant");//non-constant pool area	
	String a4 = new String( "sapna");
	System.out.println(s==s4);
	System.out.println(s1==s3);
	System.out.println(s5==s2);
System.out.println(a.equals(s));
	System.out.println(a1.equals(s1));
	System.out.println( a2.equals(s2));
System.out.println(s3.equals(a3));

System.out.println(a4==a);
System.out.println(s1.toUpperCase());
System.out.println(s4.toLowerCase());
System.out.println(a3.length());
System.out.println(a3.charAt(1));
System.out.println(a2.contains("h"));
System.out.println(s1.startsWith("ni"));
System.out.println(s1.endsWith("ha"));
a2=a2.concat(" sayyad ");
a3 =  a2 +" ahamadnagar";
System.out.println( a3);
int l=a1.length();
System.out.println("length is " +l);
 String total= a1.concat(a);
System.out.println(  "  " +total);





	}

}
