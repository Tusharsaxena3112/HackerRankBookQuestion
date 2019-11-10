package lab10;

public class Student {
    private String name;
    private String rollno;

    public Student(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String toString() {
        return String.format("%s %s", name, rollno);
    }

}
