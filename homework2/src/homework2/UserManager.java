package homework2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli yeni bir ��renci eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli ��renci silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli ��renci bilgileri g�ncellendi.");
	}
}
