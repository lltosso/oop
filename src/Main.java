

import User.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Leo", "Messi", "lm@gmail.com", "Miami");
        User user2 = new User("Xavi", "Hernandez", "xh@gmail.com", "Barcelona");
        User user3 = new User("Andres", "Iniesta", "ai@gmail.com", "Barcelona");
        User user4 = new User("Erling", "Haaland", "eh@gmail.com", "Manchester City");
        User user5 = new User("Cristiano", "Ronaldo", "cr7@gmail.com", "Al Nassr");
        User user6 = new User("Kilyan", "Mbappe", "km@gmail.com","Madrid");
        User user7 = new User("Carles", "Puyol", "cp@gmail.com", "Barcelona");
        User user8 = new User("James", "Rodriguez", "jr@gmail.com", "Rayo Vallecano");




        user1.setName("Leo Messi");
        System.out.println(user1.getName());
    }
}