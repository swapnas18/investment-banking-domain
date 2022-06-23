package constructor;

public class Vc2 
{public static void main(String[] args) {
	
Vc1  student1 = new Vc1() ;	
student1.student_name="maggie lindemann";
student1.subject=" Analytical_chemistry";
student1.mark=80;
student1.grade='A';
student1.status= "pass";
student1.student_information();
System.out.println("=======");
		
Vc1 student2 = new Vc1();
	System.out.println("********");
	student2.student_name="Arif zeynalov";
	student2.subject="software_testing";
	student2.mark=34;
	student2.grade='D';
	student2.status="fail";
	System.out.println("*****");
	student2.student_information();
	}
}



