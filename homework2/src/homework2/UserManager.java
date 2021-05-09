package homework2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli yeni bir öðrenci eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli öðrenci silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli öðrenci bilgileri güncellendi.");
	}
}
