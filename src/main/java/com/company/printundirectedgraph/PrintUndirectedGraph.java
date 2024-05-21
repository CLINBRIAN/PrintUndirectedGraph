/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.printundirectedgraph;

/**
 *
 * @author kamau
 */
public class PrintUndirectedGraph {

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addVertexData(0, 'A');
        g.addVertexData(1, 'B');
        g.addVertexData(2, 'C');
        g.addVertexData(3, 'D');
        g.addEdge(0, 1); // A - B
        g.addEdge(0, 2); // A - C
        g.addEdge(1, 2); // A - D
        g.addEdge(0, 3); // B - C

        g.printGraph();
    }
}
