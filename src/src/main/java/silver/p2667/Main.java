package silver.p2667;

import java.util.*;
import java.io.*;

public class Main {

    static int n;
    static int[][] map;
    static boolean[][] visited;
    static List<Integer> danzi;
    static int count;

    static int[] dx;
    static int[] dy;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        danzi = new ArrayList<>();

        dx = new int[]{1, -1, 0, 0};
        dy = new int[]{0, 0, 1, -1};

        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String nums = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = nums.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    count = 0;
                    dfs(i, j);
                    danzi.add(count);
                }
            }
        }

        Collections.sort(danzi);

        System.out.println(danzi.size());
        for (Integer integer : danzi) {
            System.out.println(integer);
        }
    }

    static void dfs(int startX, int startY) {
        visited[startX][startY] = true;
        count++;

        for (int i = 0; i < 4; i++) {
            int nx = startX + dx[i];
            int ny = startY + dy[i];

            if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
            if (visited[nx][ny]) continue;
            if (map[nx][ny] == 0) continue;

            visited[nx][ny] = true;
            dfs(nx, ny);
        }
    }
}
