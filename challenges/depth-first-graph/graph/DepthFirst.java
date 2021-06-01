package graph;

import stacksandqueues.Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public
class DepthFirst {

    public static
    ArrayList<Vertex> DepthFirst(Vertex vertex){
        ArrayList values= new ArrayList();
        Queue<Vertex> depth =new Queue<>();
        HashSet<Vertex> visited = new HashSet<Vertex>();

        values= DepthFirstTraversal(vertex,values,visited);


        return values;
    }

    private static
    ArrayList<Vertex> DepthFirstTraversal(Vertex vertex, ArrayList values,HashSet<Vertex> visited){
        if (vertex != null) {
            if (!visited.contains(vertex)) {
                values.add(vertex.value);
                visited.add(vertex);
                 for (Object edge : vertex.getEdge()) {
                     DepthFirstTraversal((Vertex) edge, values, visited);
                }

            }
        }
        return values;
    }

   

}
