/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.printundirectedgraph;

/**
 *
 *
 * @author kamau
 */
public class Graph {
//we are creating a graph with vertices and edges

    int[][] matrix;
    char[] vertexData;
    int size;

    public Graph( int size) {
        this.matrix = new int[size][size];
        this.vertexData = new char[size];
        this.size = size;
    }

    public void addEdge(int u, int v) {
        if (u >= 0 && u < size && v >= 0 && v < size) {
            matrix[u][v] = 1;
            matrix[v][u] = 1;
        }
    }

    public void addVertexData(int vertice, char data) {
        if (vertice >= 0 && vertice < size) {
            vertexData[vertice] = data;
        }
    }

    public void printGraph() {
        System.out.println("Adjacency Matrix");
        for (int[] row : matrix) {
            for (int values : row) {
                System.out.print(values + " ");
            }
            System.out.println();
        }
        System.out.println("vertex data");

        for (int i = 0; i < size; i++) {
            System.out.println("vertex " + i + ": " + vertexData[i]);
        }
    }

}
