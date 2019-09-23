package Lab07;

public class User {
    private String name;
    private String prof;
    private String no;

    public User(String name, String no, String prof) {
        this.name = name;
        this.prof = prof;
        this.no = no;
    }


    public String toString() {
        return name + "_" + no + "@" + prof + ".com";
    }
}
