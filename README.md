## Problem description
The function QuestionMarks(str) takes the parameter str of type string, which will contain single digit numbers, letters, and question marks, and checks if there are exactly 3 question marks between every pair of two numbers that add up to 10. If so, then your program should return the string <b>true</b>, otherwise it should return the string <b>false</b>. If there aren't any two numbers that add up to 10 in the string, then your program should return <b>false</b> as well.

## Example
Input: "aa6?9"
Output: <b>false</b>

Input: "aacc?7??sss?3rr1??????5"
Output: <b>true</b>

## Problem approach
Use two variables <b>first</b> and <b>second</b> to keep track of every two pair of numbers. We go through the entire string using a for loop to look for a <b>first</b> number. Once found, we go through an inner loop keeping count of the number of occurances of <b>"?"</b> that follows the first number, concurrently looking for another number in the successive characters in the string <b>str</b> and store it in <b>second</b>.

Check if <b>first+second==10</b> and <b>count_qm != 3</b> return false.
Else continue iterating through the array but <b>second</b> now gets assigned to <b>first</b> with its corresponding index, this controls the engine, aka "outer for loop" to continue making last number our first in the pair of two numbers.

e.g Input: "aacc?7??sss?3rr1??????5"

first=7, second=3        | 7+3=10 && there are 3 of "?" hence this is true
then first=3, second= 1  | 3+1 != 10 conditions are not satisfied, this is still true
lastly first=1, second=5 | same reasoning
uput: true
