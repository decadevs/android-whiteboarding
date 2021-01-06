## DinDin Character Shifting Algorithm

#### Problem
Given a string str consisting of letters only and an integer n, the task is to replace every character of the given string by a character which is n times more than it. If the letter exceeds ‘z’, then start checking from ‘a’ in a cyclic manner.

Examples:
Input: str = “abc”, n = 2
Output: cde
a is moved by 2 times which results in character c
b is moved by 2 times which results in character d
c is moved by 2 times which results in character e

Input: str = “abc”, n= 28
Output: cde
a is moved 25 times, z is reached. Then the 26th character will be a, 27th b and 28th c.
b is moved 24 times, z is reached. 28-th is d.
c is moved 23 times, z is reached. 28-th is f.

#### Question: 
a/ Write an algorithm to solve the above issue. Please consider the complexity of the algorithm.
##### Answer: 
* clone repository
* open terminal run ```./gradlew assemble``` to build the project
* run ```./gradlew test```
#### Question: 
b/ What is the disadvantage of using the ASCII value of the letters to solve this problem?
##### Answer: 
* Converting to ASCII will increase memory consumption
* It is character case dependent as it is demonstrated in ``ProblemSolving.letterShiftingTwo``
* It will involve more time to iterate through the available ASCII values
* If all cases are not handle well, could result in non-alphabetical result
* The complexity using the string alphabet is O(n) for any case where is the length(25) of the string
while the time complexity using ASCII value varies with character case.





