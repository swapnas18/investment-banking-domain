package condition;


	import java.util.Scanner;
	public class Atm_switch {
	public static void main(String[] args) {
			int balance =100000,withdraw,deposite;
		Scanner ss=new Scanner(System.in);
		System.out.println("insert your  debit card in the ATM slot");
			System.out.println("welcome to BOI atm machine");
			System.out.println("select your preffered language");
			int language=ss.nextInt();
			switch (language) {
			case 1:System.out.println("marathi" +"\n");break;
			case 2:System.out.println("English"+"\n");break;
			case 3:System.out.println("Hindi" +"\n");break;
			default:System.out.println("pls select available language only" +"\n");break;}
			System.out.println("enter your four digit pin ");
			int pin =ss.nextInt();
		if(pin>999 & pin<9999) 
				{System.out.println("select your transaction type");
				System.out.println(" press 1:- withdraw the money");
				System.out.println(" press 2 :-deposit money");
				System.out.println(" press 3:- balance inquiry ");
			System.out.println(" press 4 :-incorrect pin block your account");
				System.out.println("select the press number");}
		else {System.out.println("incorrect pin");}
			 int press=ss.nextInt();
			if (press==1) 
			{System.out.println("enter the withdraw money");
				withdraw=ss.nextInt();
				balance =balance-withdraw;
				System.out.println("collect your money");
				System.out.println("your remaining balance is "+balance);}
			if(press==3)
			{System.out.println("your total balance is" +balance);}
			if (press==2) {
				System.out.println("enter the deposite money");
				deposite =ss.nextInt();
				balance =balance+ deposite;
				System.out.println("the total balance is "+balance);
			}if(press==4) {
				System.out.println(" pin  incorrect can u want block your account");} 
			System.out.println("thank u for visiting");
					}
				
				{	

			
		
					}

}
