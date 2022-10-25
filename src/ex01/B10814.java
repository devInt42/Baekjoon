package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[][] arr = new String[num][2];
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < num ; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = st.nextToken();
            }
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for(int i=0;i<num;i++){
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}