# Graphs

build and implement graph data structure

## Challenge

Implement graph as adjacency list:

implement these methods:

1. Adds a new node to the graph

2. Add edge to a node

3. retrieve all nodes 

4. retrieve neighbors to a node 

5. retrieve size of the graph



## Approach & Efficiency

If m is the number of edges in a graph, then the time complexity of building such a list is O(m). The space complexity is O(n + m). But, in the worst case of a complete graph,  the time and space complexities reduce to O(n^2).



## API

1. `AddNode(<value>)`: add a node to graph

2. `AddEdge(<vertex,vertex>)`: add a edge to a vertex 

3. `GetNeighbors(<vertex>)`: get all edges to a vertex

4. `GetNodes()`: get all vertex

5. `Size()`: get the size of the graph 