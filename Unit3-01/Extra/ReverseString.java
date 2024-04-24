/*
* This program calculates the energy released when mass is converted to energy.
*
* @author  Samuel Webster
* @version 1.0
* @since   2024-03-25
*/

/**
* This runs testcases.
*/
final class ReverseString {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private ReverseString() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // input
        String original_string = "recursion";
        System.out.println("original string: " + original_string);
        String reversed_string = reverse_string(original_string);
        System.out.println("reversed string: " + reversed_string);

        System.out.println("\nDone.");
    }

    /**
    * The reverse string() function.
    *
    * @param input_string string that is inputted
    */
    public static String reverse_string(String input_string) {
        if (input_string != "") {
            final char myChar = input_string.charAt(0);
            input_string = input_string.substring(1, input_string.length());
            input_string = reverse_string(input_string);
            input_string += myChar;
        }
        return input_string;
    }
}
