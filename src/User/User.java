package User;

public class User {
    public String name;
    public String surname;
    public String email;
    public String club;

    public User (String name, String surname, String email, String club) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.club = club;
    }
    public String introduce() {
        return "Hi, i'm " + this.name + " and i play for " + this.club;

    }
    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}
