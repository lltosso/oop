

import User.football.Positions;
import User.footballers;

public class Main {
    public static void main(String[] args) {
        footballers player1 = new footballers("Leo", "Messi", "lm@gmail.com", "Miami");
        footballers player2 = new footballers("Xavi", "Hernandez", "xh@gmail.com", "Barcelona");
        footballers player3 = new footballers("Andres", "Iniesta", "ai@gmail.com", "Barcelona");
        footballers player4 = new footballers("Erling", "Haaland", "eh@gmail.com", "Manchester City");
        footballers player5 = new footballers("Cristiano", "Ronaldo", "cr7@gmail.com", "Al Nassr");
        footballers player6 = new footballers("Kilyan", "Mbappe", "km@gmail.com","Madrid");
        footballers player7 = new footballers("Carles", "Puyol", "cp@gmail.com", "Barcelona");
        footballers player8 = new footballers("James", "Rodriguez", "jr@gmail.com", "Rayo Vallecano");




        /*player1.setName("Leo Messi");
        System.out.println(player1.getName());*/

        Positions striker = new Positions("red", "Leo", "37");
        System.out.println(striker.color);
    }
}