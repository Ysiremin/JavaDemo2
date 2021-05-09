package homework2;

public class Main {

	public static void main(String[] args) {
	
	User user = new User(1,"Yasir","ciftci");
	
	UserManager userManager = new UserManager();
	userManager.add(user);
	}
}
