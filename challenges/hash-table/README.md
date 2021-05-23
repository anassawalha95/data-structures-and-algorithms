# Hashtables
This app has hashtable build implemented and tested

## Challenge

Implement the hashtable with the following methods 

1. add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
2. get: takes in the key and returns the value from the table.
3. contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
4. hash: takes in an arbitrary key and returns an index in the collection.

## Approach & Efficiency

The building approach used closed addressing

The hashtable has O(n) in its worst case because of adding take liner search for the last node and a O(n) for space also 




## API

- `add(<string key>,<string value>)`: adding a value to hash table

- `contains(<string key>)`: return true/false if the value exists or not

- `hash(<string key>)`: return a hashed key

- `get(<string key>)`: return a value if exists

