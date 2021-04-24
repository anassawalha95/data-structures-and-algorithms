# Challenge Summary

Build a Node, Binary Tree, and a binary search tree classes where the binary tree class has 

## Challenge Description

Implement  Binary Tree algorithem where it has inOrder,preOrder,and postOrder methods.Also a binary search tree class should have add method for adding new node and contains method for searching in the tree 

## Approach & Efficiency

The app was build utilizing recursion 

Best   O(log(n))
 
Worst  O(n) 

## API

**class binary Tree**
 
1. `preOrder(<root node>)`: return a list of nodes in pre-ordered arrangement

2. `inOrder(<root node>)`: return a list of nodes in inordered arrangement

3. `postOrder(<root node>)`: return a list of nodes in post-ordered arrangement

**class node**

1. `printNodeTree(<root node>, <int  height> , <int spaces>) `: print out the tree 

**class binary search tree **

1. `add(<int value>)`: add new value to the tree

2. `contains(<int value>)`: search for a value in the tree returns a true if founded or false if not