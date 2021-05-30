package graph;


import stacksandqueues.Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public
class BreadthFirst {

    public static
    ArrayList<Vertex> breadthFirst(Vertex vertex){
        ArrayList vertexs= new ArrayList();
        Queue<Vertex> breadth =new Queue<>();
        HashSet<Vertex> visited = new HashSet<Vertex>();



        breadth.enqueue(vertex);
        visited.add(vertex);


        while (!breadth.isEmpty() ){
            Vertex front= breadth.dequeue();
            vertexs.add(front.value);

            for (Object edge:front.getEdge()) {

                if(!visited.contains(edge)){
                    breadth.enqueue((Vertex) edge);
                    visited.add((Vertex) edge);
                }
            }


        }

        return vertexs;
    }



}
