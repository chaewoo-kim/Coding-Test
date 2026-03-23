package silver.p18258;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        Queue queue = new Queue(size);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            String input = br.readLine();
            String req = input.substring(0, 3);

            switch (req) {
                case "pus":
                    queue.push(Integer.parseInt(input.substring(5)));
                    break;
                case "pop":
                    sb.append(queue.pop()).append("\n");
                    break;
                case "siz":
                    sb.append(queue.size()).append("\n");
                    break;
                case "emp":
                    sb.append(queue.empty()).append("\n");
                    break;
                case "fro":
                    sb.append(queue.front()).append("\n");
                    break;
                case "bac":
                    sb.append(queue.back()).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}

class Queue {
    int front = 0;
    int back = 0;
    int[] arr;

    public Queue(int size) {
        arr = new int[size];
    }

    public void push(int x) {
        arr[back++] = x;
    }
    public int pop() {
        if (front == back) return -1;
        else return arr[front++];
    }

    public int size() {
        return back - front;
    }

    public int empty() {
        return front == back ? 1 : 0;
    }

    public int front() {
        if (front == back) return -1;
        else return arr[front];
    }

    public int back() {
        if (front == back) return -1;
        else return arr[back - 1];
    }
}