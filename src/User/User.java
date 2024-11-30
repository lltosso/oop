package User;

public class User {
    public String name;
    public String surname;
    public String email;

    public User (String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
    public String introduce() {
        return "Hi, i'm " + this.name;

    }

    public String getName() {
        return this.name;
    }

    public  void setName(String newName) {
        this.name = newName;

    }
}
