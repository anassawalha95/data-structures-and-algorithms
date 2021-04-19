# Challenge Summary

Build a queue by utilizing stacks

## Challenge Description

Create a Pseudo Class that has `enqueue(<value>)` and `dequeue()` inside that will utilize the stack `push(<value)`,`pop()` and `peek()` methods

## Approach & Efficiency

To enqueue push one value to stackA one and to dequeuq the stack will be reversed by using stackB, then pop the top from stackB, after that stackA will push all other values poped from stackB

The enqueue is O(1)
The dequeue is O(n)

## Solution

![queue with Stack ](https://github.com/anassawalha95/data-structures-and-algorithms/blob/main/challenges/assests/queueWithStack.jpeg)
