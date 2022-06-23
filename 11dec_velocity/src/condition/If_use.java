package condition;

import java.util.Scanner;

public class If_use {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the age of A");
int a=sc.nextInt();
System.out.println("enter the age of B");
int b=sc.nextInt();
System.out.println("enter the age of c");
int c=sc.nextInt();
	
if (a>b) {if (a==b) { if (c==b) {
	System.out.println("A , B and C are have same age ");
}
else{if(b>c)
	System.out.println("A and B is same age person and big than c b");
else {System.out.println("c is big than A and B");}
}}}
else { if(b<=c) {if (b==c)
	System.out.println("B and C are equal and big");

}
else{
	System.out.println("B is biggest than  A and b");
}}

	}}
