package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue queue = new LinkedList();

        for(int i=1; i<=N; i++){
            queue.add(i);
        }

        while(queue.size()>0){
            System.out.print(queue.peek());
            queue.poll();
            queue.add(queue.peek());
            queue.poll();
            if(queue.size()>0){
                System.out.print(" ");
            }
        }

    }
}
