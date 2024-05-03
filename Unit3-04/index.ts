/*
 * This is a program that calculates the area of a circle.
 *
 * @author  Samuel Webster
 * @version 1.0
 * @since   2024-01-01
 */

import { createPrompt } from 'bun-promptx'

/**
 * Calculates where disks should be placed.
 *
 * @param numberOfDisks the number of disks
 * @param startPeg the starting number of pegs
 * @param endPeg the ending number of pegs
 */
function hanoi(numberOfDisks: number, startPeg: number, endPeg: number) {
  if (numberOfDisks == 1) {
    console.log(`Move disk ${numberOfDisks} from peg ${startPeg} to ${endPeg}`)
  } else {
    hanoi(numberOfDisks - 1, startPeg, 6 - startPeg - endPeg)
    console.log(`Move disk ${numberOfDisks} from peg ${startPeg} to ${endPeg}`)
    hanoi(numberOfDisks -1, 6 - startPeg - endPeg, endPeg)
  }
}

// Peg constants
const startPeg: number = 1
const endPeg: number = 3

// User input
const input: number = createPrompt('Enter number of disks: ').value

if (isNaN(input) || input < 1) {
  console.log('Not a valid number.')
} else {
  hanoi(input, startPeg, endPeg)
}

console.log('\nDone.')