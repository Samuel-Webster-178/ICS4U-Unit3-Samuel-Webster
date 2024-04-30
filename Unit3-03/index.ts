/*
 * This is a program that calculates the area of a circle.
 *
 * @author  Samuel Webster
 * @version 1.0
 * @since   2024-01-01
 */

import { createPrompt } from 'bun-promptx'

function binarySearch(userArray: number[], userNumber: number,
  lowIndex: number, highIndex: number) {
  let rVal: number = -1;
  if (lowIndex <= highIndex) {
    let midIndex: number = (lowIndex + highIndex) / 2;
    if (userArray[midIndex] == userNumber) {
      rVal = midIndex;
    } else if (userArray[midIndex] > userNumber) {
      rVal = binarySearch(userArray, userNumber, lowIndex, midIndex - 1);
    } else {
      rVal = binarySearch(userArray, userNumber, midIndex + 1, highIndex);
    }
  }
  return rVal;
}

const userInput = createPrompt(`Entered = `)
const inputInt = parseInt(userInput.value)
let factorialOfInt = factorial(inputInt)
console.log(`Returned = ${factorialOfInt}`)

console.log(`\nDone.`)
