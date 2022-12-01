package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018 {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new char[N][M];
        int min = M * N;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < N-7; i++) {
            for (int j = 0; j < M-7; j++) {
                min = Math.min(min, cnt(i,j));
            }
        }
        System.out.println(min);
    }

    public static int cnt(int x, int y) {
        int Bcnt = 0;
        int Wcnt = 0;
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (arr[i][j] == 'B') Wcnt++;
                    else Bcnt++;
                } else {
                    if (arr[i][j] == 'W') Wcnt++;
                    else Bcnt++;
                }
            }
        }
        return Math.min(Bcnt, Wcnt);
    }
}
