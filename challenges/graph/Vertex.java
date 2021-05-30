package graph;

public
class Vertex<N>{
    Edge<N> edge;
    N value;
    Vertex(N value){
        this.value=value;
    }


    public
    Edge<N> getEdge() {
        return edge;
    }

    public
    void setEdge(Edge edge) {
        this.edge = edge;
    }
}
