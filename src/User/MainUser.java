package User;

public class MainUser {
    public static void main(String[] args) {
        User user1 = new User("Cris", "Romero", "cr@gmail.com");
        User user2 = new User("Rocio", "Soronellas", "rs@gmail.com");

        System.out.println(user1.surname);
    }
}
