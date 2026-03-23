package bronze.p2562;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int idx = 0;
        int max = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 9; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (input > max) {
                max = input;
            }
            idx = i+1;
        }

        System.out.println(max);
        System.out.println(idx);
    }
}