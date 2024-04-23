/*
* This program calculates the energy released when mass is converted to energy.
*
* @author  Samuel Webster
* @version 1.0
* @since   2024-03-25
*/

import java.util.ArrayList;
import java.util.List;

/**
* This is my stack.
*/
public class SamStack {
    /** The internal variable that stores stack. */
    private List<String> strstack = new ArrayList<String>();

    /**
    * Push a string to end of stack.
    *
    * @param input user input string
    */
    public void push(String input) {
        strstack.add(input);
    }

    /**
    * Show all items on stack.
    *
    * @return the full stack
    */
    public String show() {
        String values = "";
        for (int counter = 0; counter < strstack.size(); counter++) {
            values = values + strstack.get(counter) + ", ";
        }
        values = values.substring(0, values.length() - 2);
        return values;
    }
}
