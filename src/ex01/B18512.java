package ex01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B18512 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int aStart = Integer.parseInt(st.nextToken());
        int bStart = Integer.parseInt(st.nextToken());
        int cnt=0;

        while (true) {
                if (aStart < bStart) {
                    aStart += a;
                } else if (bStart < aStart) {
                    bStart += b;
                } else if (aStart == bStart) {
                    System.out.println(aStart);
                    break;
                }
                cnt++;
                if(cnt == 10000){
                    System.out.println("-1");
                    break;
                }
            }

    }
}
