package interface_study;

public interface Uni_collage_info extends University {

	
	void collage_detail();
 
	default  void student_info ()
	{System.out.println("total student is 130\n");
		
	}
}
