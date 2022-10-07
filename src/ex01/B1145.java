package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        int min = 1;    //최소한의 공배수
        int cnt = 0;    
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if (min % arr[i] == 0) {
                    cnt++;
                }
            }
            if (cnt >= 3) { //3개수 이상의 공배수 발견시 종료
                System.out.println(min);
                break;
            }
            min++;
            cnt = 0;
        }
    }
}
