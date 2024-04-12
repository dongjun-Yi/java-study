package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Kruskal {
    static int v, e;
    static int[] parent = new int[100001];
    static ArrayList<Edge> edges = new ArrayList();
    static int result = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        v = sc.nextInt();
        e = sc.nextInt();

        for (int i = 1; i <= v; i++)
            parent[i] = i;

        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cost = sc.nextInt();
            edges.add(new Edge(cost, a, b));
        }

        Collections.sort(edges);

        for (int i = 0; i < edges.size(); i++) {
            int cost = edges.get(i).getDistance();
            int a = edges.get(i).getNodeA();
            int b = edges.get(i).getNodeB();

            if (findParent(a) != findParent(b)) {
                result += cost;
                unionParent(a, b);
            }
        }
    }

    static int findParent(int x) {
        if (x == parent[x])
            return x;
        return parent[x] = findParent(parent[x]);
    }

    static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);

        if (a < b) parent[b] = a;
        else parent[a] = b;
    }
}

class Edge implements Comparable<Edge> {
    int distance;
    int nodeA;
    int nodeB;

    public Edge(int distance, int nodeA, int nodeB) {
        this.distance = distance;
        this.nodeA = nodeA;
        this.nodeB = nodeB;
    }

    public int getDistance() {
        return distance;
    }

    public int getNodeA() {
        return nodeA;
    }

    public int getNodeB() {
        return nodeB;
    }

    @Override
    public int compareTo(Edge o) {
        if (this.distance < o.distance)
            return -1;
        return 1;
    }
}
