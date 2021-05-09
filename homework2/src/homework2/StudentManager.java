package homework2;

public class StudentManager extends UserManager {
	
	public void add(Student student) {
		System.out.println(student.getFirstName() + " isimli yeni bir öðrenci eklendi.");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName() + " isimli öðrenci silindi.");
	}
	
	public void update(Student student) {
		System.out.println(student.getFirstName() + " isimli öðrenci bilgileri güncellendi.");
	}
}
