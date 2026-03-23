package silver.p10828;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        Stack response = new Stack(size);

        for (int i = 0; i < size; i++) {
            String input = br.readLine();
            String req = input.substring(0, 3);

            switch (req) {
                case "pus":
                    int value = Integer.parseInt(input.substring(5));
                    response.push(value);
                    break;
                case "top":
                    response.top();
                    break;
                case "pop":
                    response.pop();
                    break;
                case "siz":
                    response.size();
                    break;
                case "emp":
                    response.empty();
                    break;
            }
        }
    }
}

class Stack {
    int[] array;
    int top = -1;

    public Stack(int size) {
        array = new int[size];
    }

    public void push(int x) {
        array[++top] = x;
    }

    public void pop() {
        if (top == -1) System.out.println(-1);
        else System.out.println(array[top--]);
    }

    public void size() {
        if (top == -1) System.out.println(0);
        else System.out.println(top+1);
    }

    public void top() {
        if (top == -1) System.out.println(-1);
        else System.out.println(array[top]);
    }

    public void empty() {
        if (top == -1) System.out.println(1);
        else System.out.println(0);
    }
}

