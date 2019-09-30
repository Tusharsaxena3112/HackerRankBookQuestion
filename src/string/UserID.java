package string;

public class UserID {
    private String firstName;
    private String lastName;
    private String pinCode;
    private String greater;
    private String smaller;

    public UserID(String firstName, String lastName, String pinCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pinCode = pinCode;
    }


    public String greater() {
        if (firstName.compareTo(lastName) > 0) {
            return firstName;
        } else if (firstName.compareTo(lastName) < 0) {
            return lastName;
        } else if (firstName.compareTo(lastName) == 0) {
            return firstName;
        }
        return firstName;
    }


    public String smaller() {
        if (firstName.compareTo(lastName) > 0) {
            return lastName;
        } else if (firstName.compareTo(lastName) < 0) {
            return firstName;
        } else if (firstName.compareTo(lastName) == 0) {
            return lastName;
        }
        return lastName;
    }


    public String firstTwoCharacters() {
        StringBuilder returningResult = new StringBuilder();
        for (int i = 0; i <= 1; i++) {
            returningResult.append(greater().charAt(i));
        }
        return returningResult.toString();
    }


    public String lastTwoCharacters() {
        StringBuilder returningResult = new StringBuilder();
        for (int i = 0; i <= 1; i++) {
            returningResult.append(smaller().charAt(i));
        }
        return returningResult.toString();
    }


    public char digitOfPin1() {
        char returningResult;
        returningResult = pinCode.charAt(greater().length());
        return returningResult;
    }


    public char digitOfPin2() {
        char returningResult;
        StringBuilder pincode2 = new StringBuilder();
        for (int i = pinCode.length() - 1; i >= 0; i--) {
            pincode2.append(pinCode.charAt(i));
        }
        returningResult = pincode2.charAt(greater().length());
        return returningResult;
    }


    public String toString() {
        return String.format("%s%s%c%c", firstTwoCharacters(), lastTwoCharacters(), digitOfPin1(), digitOfPin2());
    }


}
