package hackerRank;

public class Books {
    private String name;
    private String author;
    private String number;

    public Books(String name, String author, String number) {
        this.name = name;
        this.author = author;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "-----------------------------" + "\n"
                + "Book Name:\t" + name + "\n" + "Author Name:\t" + author + "\n" + "ISBN:\t" + number + "\n" + "-----------------------------";
    }



}