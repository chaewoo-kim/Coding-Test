package silver.p1260;

import java.awt.font.GraphicAttribute;
import java.util.*;
import java.io.*;

public class Main {
    static boolean[] visitedDfs;
    static boolean[] visitedBfs;
    static List<List<Integer>> graph;
    static StringBuilder dfs = new StringBuilder();
    static StringBuilder bfs = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        visitedBfs = new boolean[n+1];
        visitedDfs = new boolean[n+1];

        graph = new ArrayList<>();
        for(int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 0; i < n+1; i++) {
            Collections.sort(graph.get(i));
        }

        dfs(start);
        bfs(start);

        System.out.println(dfs);
        System.out.println(bfs);
    }

    static void dfs(int node) {
        visitedDfs[node] = true;
        dfs.append(node).append(" ");

        for (int next : graph.get(node)) {
            if (!visitedDfs[next]) {
                dfs(next);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visitedBfs[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            bfs.append(node).append(" ");

            for (int next : graph.get(node)) {
                if (!visitedBfs[next]) {
                    visitedBfs[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}


