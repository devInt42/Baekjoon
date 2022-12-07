package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long num = Long.parseLong(br.readLine());
        if (num == 0) {
            System.out.println("NO");
            System.exit(0);
        }
        for (int i = 20; i > -1; i--) {
            if (num >= fac(i)) {
                num -= fac(i);

            }

        }
        if (num == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    static Long fac(int i) {
        if (i == 0) {
            return 1L;
        } else {
            return i * fac(i - 1);
        }
    }
}
