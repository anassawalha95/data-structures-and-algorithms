 @Test
    public void  BFSTest(){
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

        ArrayList<Vertex> test=  BreadthFirst.breadthFirst(Pandora);

       assertArrayEquals(new String[]{"Pandora", "Arendelle", "Metroville", "Monstroplolis", "Narnia", "Naboo"},test.toArray());
    }