package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1969 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb= new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int sum =0;
        int max=0;
        char[][] arr = new char[N][M];
        int[][] s = new int[M][4];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j);
                if (arr[i][j] == 'A') {
                    s[j][0]++;
                } else if (arr[i][j] == 'C') {
                    s[j][1]++;
                } else if (arr[i][j] == 'G') {
                    s[j][2]++;
                } else if (arr[i][j] == 'T') {
                    s[j][3]++;
                }
            }
        }
        for (int i = 0; i < M; i++) {
            max = -1;
            int res = -1;
            for (int j = 0; j < 4; j++) {
                if(s[i][j]>max){
                    max = s[i][j];
                    res = j;
                }
            }
            if(res==0){
                sb.append('A');
            } else if (res==1) {
                sb.append('C');
            }else if (res==2) {
                sb.append('G');
            }else if (res==3) {
                sb.append('T');
            }
            sum+= N - s[i][res];
        }
        System.out.println(sb);
        System.out.println(sum);
    }
}
