package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int cnt = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        //65
        for (int i = 0; i < 11; i++) {     // A~G
            if (i == 1 || i == 4 || i == 6 || i == 9 || i == 11) {
                continue;
            }
            cnt = i;
            res = i;
            for (int j = 0; j < arr.length; j++) {
                if (res == 1 || res == 4 || res == 6 || res == 9 || res == 11) {
                    break;
                }
                res += arr[j];
                if (res > 11) {
                    res %= 12;
                } else if (res < 0) {
                    res = 12 - (Math.abs(res) % 12);
                }
            }
            if (res == cnt) {
                char ch = 'K';
                switch (cnt) {
                    case 0:
                        ch = 'A';
                        break;
                    case 2:
                        ch = 'B';
                        break;

                    case 3:
                        ch = 'C';
                        break;

                    case 5:
                        ch = 'D';
                        break;

                    case 7:
                        ch = 'E';
                        break;

                    case 8:
                        ch = 'F';
                        break;

                    case 10:
                        ch = 'G';
                        break;

                }

                sb.append(ch + " " + ch + "\n");

            }
        }

        System.out.println(sb);

    }
}
