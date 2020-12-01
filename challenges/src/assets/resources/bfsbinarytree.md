# Breadth First Search
Write a function to traverse a binary tree in order and return the sorted values

## Challenge
Given a binary tree, traverse each node and add to an output list if node has not yet been seen. This will move depth-by-depth to add each node in order to the output.

## Approach & Efficiency
I used a queue to add values in order of traversal if root is not null, and then removed & added them to an array list to return. Efficiency should be O(n) in each case because you are traversing the entire input in every case, and returning something of equal length.

## Solution
(https://github.com/mdwohl/data-structures-and-algorithms/blob/master/challenges/code-challenge-whiteboards/cc16_screenshot.png)

