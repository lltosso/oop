

import User.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Leo", "Messi", "lm@gmail.com");
        User user2 = new User("Xavi", "Hernandez", "xh@gmail.com");
        User user3 = new User("Andres", "Iniesta", "ai@gmail.com");
        User user4 = new User("Pep", "Guardiola", "pg@gmail.com");
        User user5 = new User("Cristiano", "Ronaldo", "cr7@gmail.com");
        User user6 = new User("Jose", "Mourinho", "jm@gmail.com");
        User user7 = new User("Carles", "Puyol", "cp@gmail.com");
        User user8 = new User("Robert", "Lewandowsky", "rl@gmail.com");

        System.out.println(user8.getName());
        user1.setName("Lluis");
        System.out.println(user1.getName());

    }
}