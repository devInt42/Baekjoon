package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int cnt = 0, res = 0, sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int num = 1000;
        boolean flag = false;
        while (true) {
            sum = 0;
            for (int i = 0; i < N; i++) {
                sum += arr[i] / num;
            }
            if (sum < N) {
                if (!flag) {
                    num /= 10;
                    continue;
                } else {

                }

            }
            else {
                flag = true;

                res=num;
            }


        } // end while

    }
}
