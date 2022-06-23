package condition;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
		
			System.out.println("student information");
		
		System.out.println("pls enter roll number of student");
		
	Scanner sc =new Scanner(System.in);
	int roll_no=sc.nextInt();
	
		
	switch (roll_no) {
	case 18:
		student1("sapna","pandharpur" , 's', 1234567890l);
		break;
	case 10:
		student1("shinde","solapur" , 'A', 987654321l);
		break;
	case 12:
		student1("Dipali","pune" , 'd', 2345678901l);
		break;
	case 21:
		student1("saurabh","aurangabad" , 'k', 345627898l);
		break;
	case 16:
		student1("ujjawala","sangamner" , 'U', 567890123l);
		break;
default:
		System.out.println("no data found");
	}
		}
	}
public static void student1(String name, String add,char grade,long mob){
	System.out.println("name is   " + name);
	System.out.println("address   "+add);
	System.out.println("contact number   "+mob);
	System.out.println("your grade id   "+ grade+"\n" );
}


}
