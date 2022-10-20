package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];
        ArrayList list = new ArrayList();
        for (int i = 1; i <= N; i++) {
//            arr[i] = i;
            list.add(i);
        }
        System.out.print("<");
        int index = K-1;
        int cnt=0;
        while (cnt<N) {
            System.out.print(list.get(index));
            list.remove(index);
            index += K;
            if (index>=N-1){
                index -= N;
            }
            cnt++;
        }
        System.out.print(">");


    }
}
