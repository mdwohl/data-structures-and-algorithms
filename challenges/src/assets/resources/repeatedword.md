# Repeated Word
Take in a long string such as a quote. Return the first instance of a duplicate word.
## Challenge
Write a function that accepts a lengthy string parameter.
Return the first word to occur more than once in that provided string.
## Approach & Efficiency
We took in the string, and used toLowerCase() and regex for removing commas so that we could compare the words that we stored in a hashmap.
O(n^2) Time 
O(1) Space
## Solution
Whiteboard: ![](https://github.com/mdwohl/data-structures-and-algorithms/blob/master/challenges/code-challenge-whiteboards/CC31_whiteboard.png)
