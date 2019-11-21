/*
Author: Jeris Payne
Date: 11/10/2019
Purpose:  This application prints the user's first and last name or their 
          first, middle, and last name depending on what they entered.
*/

import java.util.Scanner; // imports Java Scanner.

public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creates new Scanner.

        // asks the user to enter their name.
        System.out.print("Enter a name: ");
        String name = sc.nextLine(); // gets the user's entry.
        System.out.println(); // prints an empty line.
        // the trim helps the program work even if spaces are entered after the 
        // user's name. This helps remove spaces. 
        name = name.trim(); 
        
        int name1 = name.indexOf(" ");
        // if the name isn't found or entered incorrectly, an error message will print.
        if (name1 == -1) {
            System.out.println("Name not entered correctly.");
        }
        // if user enters two names.
        else {
            // gets index values for 2 spaces.
            int name2 = name.indexOf(" ", name1 + 1);
            if (name2 == -1) {
                // returns name1
                String fName = name.substring(0, name1 );
                // returns a string object that starts at name1.
                String lName = name.substring(name1);
                // prints the first and last name.
                System.out.println("First name:  " + fName);
                System.out.println("Last name:   " + lName);                
            }
            // if user enters three names.
            else {
                int name3 = name.indexOf(" ", name2 + 1);
                if (name3 == -1) {
                    // returns name1.
                    String fName = name.substring(0, name1);
                    // returns a string object that starts at name1 and goes to 
                    // name2.
                    String midName = name.substring(name1 , name2);
                    // returns name2.
                    String lName = name.substring(name2);
                
                    // prints the first, last, and middle names.
                    System.out.println("First name:   " + fName);
                    System.out.println("Middle name:  " + midName);
                    System.out.println("Last name:    " + lName);                                    
                }
                else {
                    // if the user entered too many names, this error message 
                    // will print.
                    System.out.println("Please enter first and last name or "
                            + "first, middle , and last name.");
                }
            }
        }
    }
}
