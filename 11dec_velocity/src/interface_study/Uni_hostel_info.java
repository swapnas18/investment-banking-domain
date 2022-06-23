package interface_study;

public interface Uni_hostel_info  extends University{

	void hostel_detail();
	default void student_info() {
		System.out.println("in hostel 60 students are leave");
	}
}
