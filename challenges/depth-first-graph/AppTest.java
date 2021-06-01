package graph;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;


public
class AppTest {


    @Test
    public void  DFSTest() {
        Graph graph = new Graph();

        Vertex Pandora=graph.AddNode("Pandora");
        Vertex Arendelle= graph.AddNode("Arendelle");
        Vertex Metroville= graph.AddNode("Metroville");
        Vertex Monstroplolis= graph.AddNode("Monstroplolis");
        Vertex Narnia= graph.AddNode("Narnia");
        Vertex Naboo= graph.AddNode("Naboo");
        Pandora.getEdge().add(Arendelle);
        Arendelle.getEdge().add(Metroville);
        Arendelle.getEdge().add(Monstroplolis);
        Metroville.getEdge().add(Narnia );
        Metroville.getEdge().add( Naboo);
        Metroville.getEdge().add(Monstroplolis);
        Metroville.getEdge().add(Arendelle);
        Monstroplolis.getEdge().add(Arendelle);
        Monstroplolis.getEdge().add(Metroville);
        Monstroplolis.getEdge().add(Naboo);
        Narnia.getEdge().add(Metroville);
        Narnia.getEdge().add(Naboo);
        Naboo.getEdge().add(Narnia);
        Naboo.getEdge().add(Metroville);
        Naboo.getEdge().add(Monstroplolis);
        ArrayList<Vertex> test=  DepthFirst.DepthFirst(Pandora);



        Graph graph2 = new Graph();

        Vertex irbed=graph.AddNode("irbed");
        Vertex jarash= graph.AddNode("jarash");
        Vertex amman= graph.AddNode("amman");
        Vertex aqaba= graph.AddNode("aqaba");
        Vertex balqa= graph.AddNode("balqa");
        Vertex mafraq= graph.AddNode("mafraq");

        irbed.getEdge().add(jarash);

        jarash.getEdge().add(amman);
        jarash.getEdge().add(amman);
        jarash.getEdge().add(amman );
        amman.getEdge().add( mafraq);
        amman.getEdge().add(jarash);
        amman.getEdge().add(balqa);
        aqaba.getEdge().add(mafraq);
        aqaba.getEdge().add(mafraq);
        aqaba.getEdge().add(amman);
        balqa.getEdge().add(amman);
        balqa.getEdge().add(amman);
        mafraq.getEdge().add(irbed);
        mafraq.getEdge().add(irbed);
        mafraq.getEdge().add(irbed);



        ArrayList<Vertex> test2=  DepthFirst.DepthFirst(irbed);




        Graph graph3 = new Graph();

        Vertex one=graph.AddNode("1");
        Vertex two= graph.AddNode("2");
        Vertex three= graph.AddNode("3");
        Vertex four= graph.AddNode("4");
        Vertex five= graph.AddNode("5");
        Vertex six= graph.AddNode("6");

        one.getEdge().add(six);
        one.getEdge().add(two);

        two.getEdge().add(three);
        two.getEdge().add(four);

        three.getEdge().add( five);





        ArrayList<Vertex> test3=  DepthFirst.DepthFirst(one);

//        System.out.println(Arrays.toString(test.toArray()));
//        System.out.println(Arrays.toString(test2.toArray()));
//        System.out.println(Arrays.toString(test3.toArray()));
//


        assertArrayEquals(new String[]{"Pandora", "Arendelle", "Metroville", "Narnia", "Naboo", "Monstroplolis"},test.toArray());
        assertArrayEquals(new String[]{"irbed", "jarash", "amman", "mafraq", "balqa"},test2.toArray());
        assertArrayEquals(new String[]{"1", "6", "2", "3", "5", "4"},test3.toArray());
    }
}
