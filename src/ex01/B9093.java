package ex01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[21];
        String str;
        for (int i = 0; i < num; i++) {
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int cnt = 0;
            while (st.hasMoreTokens()) {
                arr[cnt] = st.nextToken();
                cnt++;
            }
            for (int j = 0; j < cnt; j++) {
                for (int k = arr[j].length() - 1; k >= 0; k--) {
                    System.out.print(arr[j].charAt(k));
                }
                if(j<cnt-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
