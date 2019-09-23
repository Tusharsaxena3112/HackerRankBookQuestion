package Lab07;

import java.util.Random;

public class User {
    private String name;
    private String prof;
    private String no;

    public User(String name, String no, String prof) {
        this.name = name;
        this.prof = prof;
        this.no = no;
    }

    public char firstDigit() {
        String select = "abcdefghijklmnopqrstuvwxyz";
        char[] sel = select.toCharArray();
        int random = (int) (Math.random() * 10);
        char a1 = sel[random];
        return a1;
    }

    public String third() {
        if (name.length() > 5) {
            return name.substring(0, 5);
        } else if (name.length() < 5) {
            for (int i = 0; i < 5 - name.length(); i++) {
                name += "0";
            }
            return name;
        }
        return name;
    }

    public String secondDigit() {
        String four = "";
        Random ran = new Random();
        for (int i = 0; i < 4; i++) {
            four += ran.nextInt(9);
        }
        return four;
    }

    public char fourth() {
        String character = "!@#$%^&*9)_+";
        Random ran = new Random();
        return character.charAt(ran.nextInt(12));

    }

    public String createPassword() {
        return String.format("%c%s%s%c", firstDigit(), secondDigit(), third(), fourth());
    }

    public String toString() {
        return name + "_" + no + "@" + prof + ".com";
    }
}
