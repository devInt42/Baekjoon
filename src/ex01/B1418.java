package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1418 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int res = 0;


        for (int i = 1; i <= N; i++) {
            int max = 0;
            int num = i;
            for (int j = 2; j <= Math.sqrt(i); ) {
                if (num % j == 0) {
                    num /= j;
                    max = j;
                } else {
                    j++;
                }
            }
            if (num != 1) {
                max = num;
            }
            if(max <=K){
                res++;
            }
        }
        System.out.println(res);
    }
}
