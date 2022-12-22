package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2755 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        double avg = 0;
        int hakjum = 0;      // 이수 학점
        double score =0;    // 점수
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken(); // 과목명
            double res = Integer.parseInt(st.nextToken()); // 이수학점
            hakjum += res; // 총 이수학점
            String str= st.nextToken(); // 성적
            if(str.charAt(0)== 'A')  score =4;
            else if (str.charAt(0) == 'B') score=3;
            else if (str.charAt(0) == 'C') score=2;
            else if (str.charAt(0) == 'D') score=1;
            //  F학점은 + - 0가 없기에 인덱스오류를 피하기위해
            if(str.charAt(0) != 'F'){
            if(str.charAt(1)=='+') score+=0.3;
            if(str.charAt(1)=='-') score-=0.3;
            }
            else score=0;
            avg += res*score;
        }
        System.out.printf("%.2f", avg/hakjum);
    }
}
