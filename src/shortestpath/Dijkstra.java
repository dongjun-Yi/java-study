package shortestpath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra {
    static final int INF = Integer.MAX_VALUE;
    static int n, m, start;
    static ArrayList<ArrayList<Node>> graph = new ArrayList();
    static int[] d = new int[100001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList());
        }

        // 모든 간선 정보를 입력받기
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            // a번 노드에서 b번 노드로 가는 비용이 c라는 의미
            graph.get(a).add(new Node(b, c));
        }

        // 최단 거리 테이블을 모두 무한으로 초기화
        Arrays.fill(d, INF);

        dijkstra(start);
    }

    private static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue();
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int distance = node.getDistance();
            int now = node.getIndex();

            if (d[now] < distance) continue;

            for (Node n : graph.get(now)) {
                int cost = d[now] + n.getDistance();

                if (cost < d[n.getIndex()]) {
                    d[n.getIndex()] = cost;
                    pq.offer(new Node(n.getIndex(), cost));
                }
            }

        }
    }
}

class Node implements Comparable<Node> {

    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return index;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int compareTo(Node o) {
        if (this.distance < o.distance) // distance 오름차순
            return -1;
        return 1;
    }
}