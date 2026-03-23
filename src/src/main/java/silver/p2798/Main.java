package silver.p2798;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cardCount = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int[] values = new int[cardCount];
        int max = 0;

        for (int i = 0; i < cardCount; i++) {
            values[i] = Integer.parseInt(st1.nextToken());
        }

        for (int i = 0; i < cardCount; i++) {
            for (int j = i+1; j < cardCount; j++) {
                for (int k = j+1; k < cardCount; k++) {
                    int sum = values[i] + values[j] + values[k];
                    if (sum > max && sum <= limit) max = sum;
                }
            }
        }

        System.out.println(max);
    }
}
