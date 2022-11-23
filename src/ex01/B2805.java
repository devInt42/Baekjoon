package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long top = 0;
        long bot = 1;
        long mid = 0;
        long[] arr = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            top = Math.max(top, arr[i]);
        }

        while (top >= bot) {
            long cnt = 0;
            mid = (top + bot) / 2;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] - mid > 0) {
                    cnt += arr[i] - mid;
                }
            }
            if (cnt >= M) {
                bot = mid + 1;
            } else {
                top = mid - 1;
            }
        }

        System.out.println(top);


    }
}
