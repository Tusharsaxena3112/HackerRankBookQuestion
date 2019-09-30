package string;

import java.util.Scanner;

// Write a program to accept first name ,last name and pin code from the user.Create a user id on the basis of  the following condition
//1-- take first two characters of the greater string . 2--Take last two characters of the smaller string .3===Traverse the pin code in the forward direction and
//take the character on the index equivalent to the greater string length .If the string length is greater then no. of digits in the pin code
// then take the last digit .4--Traverse the pin code on reverse direction and take the digit available at the position of the index equivalent to the smaller string length
//If the string length is greater than no. of digits int the pin code then take the first character.5-- If both the string are similar consider first name as smaller and large name is greater.
//The order of string is decided as per the alphabetical order.The string which comes first is smaller and the string which comes later is greater.
public class Handling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        String lastName = input.nextLine();
        String pinCode = input.nextLine();
        UserID obj = new UserID(firstName, lastName, pinCode);
        System.out.println(obj);
    }


}
