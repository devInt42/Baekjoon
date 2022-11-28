package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int N1 = N;
        ArrayList list = new ArrayList();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        int index = K-1;
        int cnt=0;
        sb.append("<");
        while (cnt<N1) {
            if(cnt!=0){
                sb.append(", ");
            }
            sb.append(list.get(index));
            list.remove(index);
            N-=1;
            index += K-1;
            if (N>0 && index>N-1){
                index %= N;
            }
            cnt++;
        }
        sb.append(">");
        System.out.println(sb);


    }
}
