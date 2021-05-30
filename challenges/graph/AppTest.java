package graph;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public
class AppTest {

    @Test
    public void addVertexTest(){
        Graph<Object> graph = new Graph<>();

        Vertex<Object> temp1=graph.AddNode(1);
        Vertex<Object> temp2=graph.AddNode(2);

        assertEquals(1, temp1.value);
        assertEquals(2, temp2.value);
    }

    @Test
    public void  getNodesTest(){
        Graph<Object> graph = new Graph<>();

        Vertex<Object> temp1=graph.AddNode(1);
        Vertex<Object> temp2=graph.AddNode(2);

        Set<Vertex<Object>> allNodes  =graph.GetNodes();
        assertTrue(allNodes.contains(temp1));
        assertTrue(allNodes.contains(temp2));
    }

    @Test
    public void  getNeighborsTest(){
        Graph<Object> graph = new Graph<>();

        Vertex<Object> temp1=graph.AddNode(1);
        Vertex<Object> temp2=graph.AddNode(2);

        graph.AddEdge(temp1,temp2);

        List<Vertex<Object>> neighbors  =graph.GetNeighbors(temp1);

        assertEquals(temp2, neighbors.get(neighbors.indexOf(temp2)));

    }

    @Test
    public void  sizeTest(){
        Graph<Object> graph = new Graph<>();

        Vertex<Object> temp1=graph.AddNode(1);
        Vertex<Object> temp2=graph.AddNode(2);
        Vertex<Object> temp3=graph.AddNode(3);
        Vertex<Object> temp4=graph.AddNode(4);

        graph.AddEdge(temp1,temp2);
        graph.AddEdge(temp3,temp4);

       assertEquals(4,graph.Size());
    }


}
