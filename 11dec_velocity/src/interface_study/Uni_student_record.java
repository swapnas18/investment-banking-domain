package interface_study;

public class Uni_student_record implements Uni_hostel_info,Uni_collage_info {

	public static void main(String[] args) {
		Uni_student_record ss= new Uni_student_record();
		University.university_info();// calling static method from 1st interface
		ss.collage_detail();
		ss.hostel_detail();
        ss.student_info();
	}


	public void collage_detail() {

		System.out.println(" \nvelocity  collage"); //calling 2nd interface
	}

	public void hostel_detail() {
		System.out.println(" \nvelocity hostel\n");//calling 3rd interface
		
	}

	public void student_info() {
		
	
Uni_collage_info.super.student_info();//calling default complete method from  2nd and 3rd interface 

Uni_hostel_info.super.student_info();
}
}