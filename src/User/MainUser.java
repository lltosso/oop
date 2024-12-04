package User;

public class MainUser {
    public static void Mainuser(String[] args) {
        User user1 = new User("Leo", "Messi", "lm@gmail.com", "Miami");
        User user2 = new User("Xavi", "Hernandez", "xh@gmail.com", "Barcelona");

        System.out.println(user1.club);
    }
}
