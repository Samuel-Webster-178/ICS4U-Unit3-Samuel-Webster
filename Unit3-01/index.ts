/*
 * This is a program that calculates the area of a circle.
 *
 * @author  Samuel Webster
 * @version 1.0
 * @since   2024-01-01
 */

// reverse inputted string with recusion
function reverse_string(input_string: string): string {
  if (input_string) {
    const myChar = input_string.charAt(0)
    input_string = input_string.slice(1, input_string.length)
    input_string = reverse_string(input_string)
    input_string += myChar
  }
  return input_string
}

const original_string = "recursion"
console.log("original string: " + original_string)
console.log("reversed string: " + reverse_string(original_string))

console.log("\nDone.")
