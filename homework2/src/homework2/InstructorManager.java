package homework2;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " isimli yeni bir eðitmen eklendi");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " isimli eðitmen silindi.");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " isimli eðitmen bilgileri güncellendi.");
	}
}
