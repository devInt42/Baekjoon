package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1388 {
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

        for (int i = 0; i < N; i++) {
            char now ='a';
            for (int j = 0; j < M; j++) {
                if((now=='a' || now=='|') && arr[i][j]=='-'){
                    cnt++;
                }
                now = arr[i][j];
            }
        }

        for (int i = 0; i < M; i++) {
            char now ='a';
            for (int j = 0; j < N; j++) {
                if((now=='a' || now=='-') && arr[j][i]=='|'){
                    cnt++;
                }
                now = arr[j][i];
            }
        }

        System.out.println(cnt);


    }
}
