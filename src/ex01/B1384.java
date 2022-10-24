package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1384 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int group = 0;
        int num;
        String[][] arr;
        while (true) {
            StringBuilder sb = new StringBuilder();
            StringTokenizer st;
            num = Integer.parseInt(br.readLine());
            if (num == 0) {
                System.exit(0);
            } else {
                group++;
            }
            sb.append("Group " + group + "\n");
            arr = new String[num][num];
            for (int i = 0; i < num; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < num; j++) {
                    arr[i][j] = st.nextToken();
                }
            }
            int cnt=0;
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if(arr[i][j].equals("N")){
                        int a= (i-j) >= 0 ? i-j : num+i-j;
                        sb.append(arr[a][0] + " was nasty about " + arr[i][0] + "\n");
                        cnt++;
                    }
                }
            }
            if(cnt==0){
                sb.append("Nobody was nasty" + "\n");
            }
            System.out.println(sb);
        }
    }
}
