package String_study;

public class count_the_character {

	public static void main(String[] args) {
		 System.out.print(" how many time  'a '   word  present in my name\n  a=");
		String s = "swapnali_ramchandra_shinde";
		int ss=s.length();
		String sss= s.replace("a","");
		int ssss= sss.length();
		int count =ss-ssss;
		System.out.print(count);
		
		
		
		
		
		
		
}}