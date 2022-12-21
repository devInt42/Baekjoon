package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int now=1;
        int cnt=0;
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int sum=0;
        while(cnt<B){
            for (int i = 0; i < now; i++) {
                cnt++;
                if(cnt>=A && cnt<=B){
                sum += now;
                }
            }
            now++;
        }
        System.out.println(sum);
    }
}
