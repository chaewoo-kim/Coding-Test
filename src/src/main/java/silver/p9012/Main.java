package silver.p9012;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bf.readLine());

        for (int i = 0; i < size; i++) {
            Stack<Character> stack = new Stack<>();
            String input = bf.readLine();
            boolean isTrue = true;

            for (char c : input.toCharArray()) {
                if (c == '(') stack.push(c);
                else {
                    if (stack.isEmpty()) {
                        isTrue = false;
                        break;
                    }
                    stack.pop();
                }
            }

            System.out.println(isTrue && stack.isEmpty() ? "YES" : "NO");
        }
    }
}
