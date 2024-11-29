

import User.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Cris", "Romero", "cr@gmail.com");
        User user2 = new User("Oscar", "DLeon", "ol@gmail.com");

        System.out.println(user1.name);

    }
}