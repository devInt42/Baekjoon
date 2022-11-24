package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        int num = Integer.parseInt(br.readLine());
        while (num >= 5) { // 5 25 125
            cnt += num / 5;
            num /= 5;
        }
        System.out.println(cnt);

    }
}