package com.naldana;

public class Main {

    // TODO (1): Instructions: Make a program that join your first name and last name.
    public static void main(String[] args) {
	    // TODO (2): Declare a string variable named firstName and initialized with your first name
        String firstName = "Néstor";
        // TODO (3): Declare a string variable named lastName and initialized with your last name
        String lastName = "Aldana";
        // TODO (4): Print to console the value of firstName variable
        System.out.println(firstName);
        // TODO (5): Print to console the valuer of lastName variable
        System.out.println(lastName);
        // TODO (6): Declare a string variable named fullName and save the value of concatenate the firstName with lastName
        // TODO (6.1): The white space is necessary only for read propose
        String fullName = firstName + " " + lastName;
        // TODO (6.2): Other ways to concatenate.
            // TODO (6.3) Using concat method
            // fullName = firstName.concat(lastName)
            // TODO (6.4) Using join method. This is it useful to join more two or more strings and put a delimiter between then
            // fullName = firstName.join(" ", lastName);
        // TODO (7): Print to console the value of fullName
        System.out.println(fullName);
    }
}
