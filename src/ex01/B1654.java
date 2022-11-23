package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        long N = Integer.parseInt(st.nextToken());
        long[] arr = new long[K];
        long top = 0;
        long bot = 1;
        long mid = 0;

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            top = Math.max(top, arr[i]);
        }


        while (top >= bot) {
            long cnt = 0;
            mid = (top + bot) / 2;

            for (int i = 0; i < K; i++) {
                cnt += arr[i] / mid;
            }
            if (cnt >= N) {
                bot = mid + 1;
            } else {
                top = mid - 1;
            }
        }
        System.out.println(top);
    }
}