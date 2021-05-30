package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public
class Graph <G> {

    public HashSet<Vertex<G> > vertexList=new HashSet<>();


    public
    Vertex AddNode(G value){

        Vertex<G> vertex =new Vertex(value);

        vertexList.add(vertex);

        return vertex;
    }

    public void AddEdge(Vertex<G>  a, Vertex<G>  b){
        if(this.vertexList.contains(a) && this.vertexList.contains(b)){
            a.getEdge().setVertex(b);

            a.getEdge().setWeight(1);
        }

    }

    public HashSet<Vertex<G> > GetNodes(){
        return vertexList;
    }

    public
    HashSet<Vertex<G> > GetNeighbors(Vertex<G>  vertex){
        HashSet<Vertex<G> > allNeighbors = new HashSet<>();

        GetNeighborsOfTheNeighbor(vertex, (HashSet<G>) allNeighbors);

       return allNeighbors;

    }

    public void GetNeighborsOfTheNeighbor(Vertex<G>  vertex,HashSet<G>  allNeighbors){

        if(vertex.getEdge().getVertex()!=null){
            allNeighbors.add((G) vertex.getEdge().getVertex());
            GetNeighborsOfTheNeighbor(vertex.getEdge().getVertex(),allNeighbors);
        }
    }

    public int Size(){
        return vertexList.size();
    }
}
