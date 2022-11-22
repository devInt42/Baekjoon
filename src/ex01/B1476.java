package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken()); // 지구를 나타내는 수 1~15
        int S = Integer.parseInt(st.nextToken()); // 태양을 나타내는 수 1~28
        int M = Integer.parseInt(st.nextToken()); // 달을 나타내는 수 1~19
        int i = 1, j = 1, k = 1;
        int year = 1;
        while (true) {
            if (i == E && j == S && k == M) {
                System.out.println(year);
                break;
            }
            year++;
            i++;
            j++;
            k++;
            if (i > 15) {
                i -= 15;
            }
            if (j > 28) {
                j -= 28;
            }
            if (k > 19) {
                k -= 19;
            }
        }
    }
}
