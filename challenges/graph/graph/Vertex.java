package graph;

public
class Vertex<N>{
    N value;
    Edge<N> edge;

    Vertex(N val){

        value=val;
        edge=new Edge<>(null,0);
    }


    public
    Edge<N> getEdge() {
        return edge;
    }

    public
    void setEdge(Edge<N> edge) {
        this.edge = edge;
    }


}
