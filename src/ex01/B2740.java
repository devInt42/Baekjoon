package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2740 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");   // 공백 기준으로 나누기
        StringBuilder sb = new StringBuilder(); // 결과값을 출력

        int N = Integer.parseInt(st.nextToken());   //A의 행
        int M = Integer.parseInt(st.nextToken());   //A의 열
        int[][] A = new int[N][M];  //행렬 A

        for (int i = 0; i < N; i++) {    //행렬 A에 입력값 넣기
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine(), " ");
        st.nextToken();
        int K = Integer.parseInt(st.nextToken());
        int[][] B = new int[M][K];

        for (int i = 0; i < M; i++) {    //행렬 B에 입력값 넣기
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < K; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                int sum = 0;
                for (int k = 0; k < M; k++) {
                    sum += A[i][k] * B[k][j];   //행렵 곱을 구하는 법
                }
                sb.append(sum).append(' '); //스트링빌더에 sum 넣은 뒤 공백추가
            }
            sb.append('\n');    //개행
        }
        System.out.println(sb);
    }
}
