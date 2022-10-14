package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1524 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            br.readLine();
            StringTokenizer st =new StringTokenizer(br.readLine());
            int SN= Integer.parseInt(st.nextToken());
            int SB= Integer.parseInt(st.nextToken());
            int S = 0, B = 0;

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < SN; j++) {
                S = Math.max(S, Integer.parseInt(st2.nextToken()));
            }

            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for (int j = 0; j < SB; j++) {
                B = Math.max(B, Integer.parseInt(st3.nextToken()));
            }

            String res = (S >= B) ? "S" : "B";
            System.out.println(res);
        }

    }
}
