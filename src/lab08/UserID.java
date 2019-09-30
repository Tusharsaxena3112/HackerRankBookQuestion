package lab08;

// Write a program to accept first name ,last name and pin code from the user.Create a user id on the basis of  the following condition
//1-- take first two characters of the greater string . 2--Take last two characters of the smaller string .3===Traverse the pin code in the forward direction and
//take the character on the index equivalent to the greater string length .If the string length is greater then no. of digits in the pin code
// then take the last digit .4--Traverse the pin code on reverse direction and take the digit available at the position of the index equivalent to the smaller string length
//If the string length is greater than no. of digits int the pin code then take the first character.5-- If both the string are similar consider first name as smaller and large name is greater.
//The order of string is decided as per the alphabetical order.The string which comes first is smaller and the string which comes later is greater.

public class UserID {
    private String firstName;
    private String lastName;
    private String pinCode; //Pin code must be of 6 digits.
    private String greater;
    private String smaller;


    public UserID(String firstName, String lastName, int pinCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pinCode = Integer.toString(pinCode);
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
        return greater().substring(0, 2);
    }


    public String lastTwoCharacters() {
        return smaller().substring(smaller().length() - 2, smaller().length());
    }


    public char pin1() {
        if (greater().length() < 6) {
            return pinCode.charAt(greater().length() - 1);
        }
        return pinCode.charAt(5);
    }

    public char pin2() {
        if (greater().length() < 6) {
            return pinCode.charAt((pinCode.length() - 1) - (smaller().length() - 1));
        }
        return pinCode.charAt(0);
    }

    public String toString() {
        return String.format("%s%s%c%c", firstTwoCharacters(), lastTwoCharacters(), pin1(), pin2());
    }


}
