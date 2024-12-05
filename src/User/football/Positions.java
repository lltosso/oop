package User.football;

public class Positions {
    private String color;
    private String name;
    private int age;

    public Positions(String color, String name, int age) {
        this.color = color;
        this.name = name;
        this.age = age;
    }
    public String introduce() {
        return "Hi, i'm " + this.name + ", mi color de camiseta es " + this.color + " y tengo " + this.age + " años ";

    }


}
