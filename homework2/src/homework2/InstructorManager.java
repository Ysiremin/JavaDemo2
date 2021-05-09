package homework2;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " isimli yeni bir e�itmen eklendi");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " isimli e�itmen silindi.");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " isimli e�itmen bilgileri g�ncellendi.");
	}
}
