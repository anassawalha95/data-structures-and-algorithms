package graph;

public
class Edge <E> {
    public  Vertex<E>  vertex;
    public  int weight;

    Edge( Vertex<E>  vertex,int weight){
        this.vertex=vertex;
        this.weight=weight;
    }

    public
    Vertex<E>  getVertex() {
        return vertex;
    }

    public
    void setVertex(Vertex<E>  vertex) {
        this.vertex = vertex;
    }

    public
    int getWeight() {
        return weight;
    }

    public
    void setWeight(int weight) {
        this.weight = weight;
    }
}
