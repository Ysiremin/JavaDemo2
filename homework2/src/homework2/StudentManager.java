package homework2;

public class StudentManager extends UserManager {
	
	public void add(Student student) {
		System.out.println(student.getFirstName() + " isimli yeni bir ��renci eklendi.");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName() + " isimli ��renci silindi.");
	}
	
	public void update(Student student) {
		System.out.println(student.getFirstName() + " isimli ��renci bilgileri g�ncellendi.");
	}
}
