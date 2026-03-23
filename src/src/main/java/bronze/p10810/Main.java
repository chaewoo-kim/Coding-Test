package bronze.p10810;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer z = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(z.nextToken());
        int m = Integer.parseInt(z.nextToken());

        int[] buckets = new int[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = 0;
        }

        for (int p = 0; p < m; p++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(input.nextToken());
            int j = Integer.parseInt(input.nextToken());
            int k = Integer.parseInt(input.nextToken());

            for (int x = i-1; x < j; x++) {
                buckets[x] = k;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(buckets[i] + " ");
        }
    }
}