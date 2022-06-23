package condition;

public class Nested_if {
	public static void main(String[] args) {
		String name="sapna shinde";
		String password="sapna@123";
		int capcha=1998  ;

			if (name=="sapna shinde") {
				System.out.println("enter the password");
				if (password=="sapna@123") {
					System.out.println("enter the capcha");
					if(capcha==1998) {
						System.out.println("loggin succesfull");
					}
					else{
						System.out.println("invalid capcha");
					}
				}else {
					System.out.println("invalid password");
				}
			}else {
				System.out.println("invalid name ");
				System.out.println("loggin unsuccesfull");
			}


		}


}
