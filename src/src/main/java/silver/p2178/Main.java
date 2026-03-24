package silver.p2178;

import java.util.*;
import java.io.*;

public class Main {

    static boolean[][] visited;
    static int[][] map;
    static int[][] dist;

    static int[] dx;
    static int[] dy;

    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];
        dist = new int[n][m];
        dx = new int[]{1,-1,0,0};
        dy = new int[]{0,0,1,-1};

        for (int i = 0; i < n; i++) {
            String nums = br.readLine();

            for (int j = 0; j < m; j++) {
                map[i][j] = nums.charAt(j) - '0';
            }
        }

        bfs(0, 0);

        System.out.println(dist[n-1][m-1]);
    }

    static void bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        visited[startX][startY] = true;
        queue.add(new int[]{startX, startY});
        dist[startX][startY] = 1;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int x = poll[0];
            int y = poll[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (visited[nx][ny]) continue;
                if (map[nx][ny] == 0) continue;

                visited[nx][ny] = true;
                dist[nx][ny] = dist[x][y] + 1;
                queue.add(new int[]{nx, ny});
            }
        }
    }
}
