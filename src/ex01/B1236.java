package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] arr = new char[N][M];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        int Ncnt = 0;
        int Mcnt = 0;
        for (int i = 0; i < N; i++) {
            Boolean NF = false;
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 'X') {
                    NF = true;
                    break;
                }
            }
            if (NF == false) {
                Ncnt++;
            }
        }

        for (int j = 0; j < M; j++) {
            Boolean MF = false;
            for (int i = 0; i < N; i++) {
                if (arr[i][j] == 'X') {
                    MF = true;
                    break;
                }
            }
            if (MF == false) {
                Mcnt++;
            }
        }
        System.out.println(Math.max(Ncnt, Mcnt));
    }
}


