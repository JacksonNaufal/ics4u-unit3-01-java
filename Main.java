/*
* This is a standard reverse string program
* that reverses the string inputed.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-11-12
*
* This is a string reverse program
*/

import java.util.Scanner;
/**
 * This is a reverseString program.
 */

final class Main {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Gets the reversed word.
     *
     * @param userWord The word that will get reversed
     * @return returns the reversed word
     */

    public static String reverseString(final String userWord) {

        final String reversed;

        if (userWord.length() == 0) {
            reversed = userWord;
        } else {
            reversed = reverseString(userWord.substring(1))
                + (userWord.charAt(0));
        }
        return reversed;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {

        // creates the input
        final Scanner firstInput = new Scanner(System.in);

        // gets user input
        System.out.print("Enter your word: ");
        final String userWord = firstInput.nextLine();

        // the user inputted word
        System.out.println("Before Reverse: " + userWord);
        final String reversedDone = reverseString(userWord);

        // the word after it got reversed
        System.out.println("After Reverse: " + reversedDone);
        System.out.println("\nDone!");
    }
}
