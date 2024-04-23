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
final class TestCases {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private TestCases() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // input
        final SamStack fruits = new SamStack();
        fruits.push("apple");
        fruits.push("banana");
        System.out.println("fruits: " + fruits.show());

        final SamStack colours = new SamStack();
        colours.push("red");
        colours.push("green");
        colours.push("blue");
        System.out.println("colours: " + colours.show());

        final SamStack animals = new SamStack();
        animals.push("cat");
        animals.push("dog");
        animals.push("wolf");
        animals.push("deer");
        animals.push("rabbit");
        System.out.println("animals: " + animals.show());

        System.out.println("\nDone.");
    }
}
