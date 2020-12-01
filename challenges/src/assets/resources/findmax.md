# Find Max Value
Write a function to traverse a binary tree and find the max value.

## Challenge
Given a binary tree, keep track of the maximum value encountered as you traverse through all nodes of the tree. After the entire tree has been traversed, return the maximum value as an integer.

## Approach & Efficiency
I used an int var set to MIN_VALUE and then, provided that a node was not null, compared that with the current value. If current value was larger, reset the variable to that current value and keep moving through the tree. Time should be O(n) because you need to traverse every node to find a max. Space should be O(1) since you're just returning one value.

## Solution
(https://github.com/mdwohl/data-structures-and-algorithms/blob/master/challenges/code-challenge-whiteboards/cc16_screenshot.png)

