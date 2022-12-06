package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 1;
        int sum = 0;
        for (int i = 1; i < N+1; i++) {
            sum = i;
            for (int j = i + 1; j < N+1; j++) {
                sum += j;
                if (sum == N) {
                    cnt++;
                } else if (sum > N) {
                    break;
                }
            }
        }
        System.out.println(cnt);


    }
}
