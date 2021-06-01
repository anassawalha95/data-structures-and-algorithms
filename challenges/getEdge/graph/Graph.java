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

            Edge edge=new Edge(b,1);
            a.getEdge().add(edge);


        }

    }

    public Set<Vertex<G> > GetNodes(){
        return vertexList;
    }

    public
    List<Vertex<G> > GetNeighbors(Vertex<G>  vertex){
        List<Vertex<G> > allNeighbors = new ArrayList<>();


        if(vertex.getEdge().size() !=0  ){
            for ( Edge edge :vertex.getEdge()){
                allNeighbors.add( edge.getVertex());
            }
        }

        return allNeighbors;

    }



    public int Size(){
        return vertexList.size();
    }


}
