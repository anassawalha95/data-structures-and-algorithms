package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public
class Graph <G> {

    public Set<Vertex<G> > vertexList=new HashSet<>();


    public
    Vertex<G> AddNode(G value){

        Vertex<G> vertex =new Vertex<G>(value);

        vertexList.add(vertex);

        return vertex;
    }

    public void AddEdge(Vertex<G>  a, Vertex<G>  b){
        if(this.vertexList.contains(a) && this.vertexList.contains(b)){
            a.getEdge().setVertex(b);

            a.getEdge().setWeight(1);
        }

    }

    public Set<Vertex<G> > GetNodes(){
        return vertexList;
    }

    public
    List<Vertex<G> > GetNeighbors(Vertex<G>  vertex){
        List<Vertex<G> > allNeighbors = new ArrayList<>();

        GetNeighborsOfTheNeighbor(vertex,  allNeighbors);

        return allNeighbors;

    }

    public void GetNeighborsOfTheNeighbor(Vertex<G>  vertex, List<Vertex<G> >  allNeighbors){

        if(vertex.getEdge() !=null && vertex.getEdge().getVertex()!=null ){

            allNeighbors.add( vertex.getEdge().getVertex());
            GetNeighborsOfTheNeighbor(vertex.getEdge().getVertex(),allNeighbors);
        }
    }

    public int Size(){
        return vertexList.size();
    }


}
