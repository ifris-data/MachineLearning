package com.mycompany.maventest;

public class GraphTests {

    public GraphTests(){}
    
    public static void runTests(){
        double[] graphTest = new double[]{1,2,3,4,5,6,7,8,9,15};
        Graph2D g2d = new Graph2D(graphTest,2);
        g2d.setMode(2);
        g2d.setTitle("Test");
        g2d.showGraph();
    }

}
