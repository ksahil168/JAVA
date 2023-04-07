package Javacollection.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Adjecencymatrix{
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int m = scn.nextInt();

            List<List<Integer>> graph = new ArrayList<>();

            for(int i=0; i<n; i++){
                graph.add(new ArrayList<>());

            }
            
            for(int i=0; i<m;i++){
                int u = scn.nextInt();
                int v = scn.nextInt();

                graph.get(u).add(v);
                graph.get(v).add(u);
            }
        }

    }
}