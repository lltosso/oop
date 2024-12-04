package User;

public class MainUser {
    public static void Mainuser(String[] args) {
        footballers player1 = new footballers("Leo", "Messi", "lm@gmail.com", "Miami");
        footballers player2 = new footballers("Xavi", "Hernandez", "xh@gmail.com", "Barcelona");

        System.out.println(player1.club);
    }
}
