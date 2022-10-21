package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1380 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                return;
            } else {
                cnt++;
            }
            boolean[] flag = new boolean[num];
            String[] arr = new String[num];
            for (int i = 0; i < num; i++) {
                arr[i] = br.readLine();
            }

            for (int i = 0; i < num; i++) {
                br.readLine();
            }

            for (int i = 0; i < num - 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                flag[Integer.parseInt(st.nextToken()) - 1] = true;
            }

            for (int i = 0; i < num; i++) {
                if (flag[i] == false) {
                    System.out.println(cnt + " " + arr[i]);
                }
            }

        } //end while
    }
}
