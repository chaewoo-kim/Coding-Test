package bronze.p10818;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = Integer.parseInt(st.nextToken());
        int min = max;

        for (int i = 1; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
                if (input > max) max = input;
                if (input < min) min = input;
        }
        System.out.println(min + " " + max);
    }
}