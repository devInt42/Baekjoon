package ex01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String board = br.readLine();
        StringTokenizer st = new StringTokenizer(board, ".");
        StringTokenizer st2 = new StringTokenizer(board, "X");

        if(board.charAt(0) == '.'){
            sb.append(st2.nextToken());
        }
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            int len = str.length();
            if (str.length() % 2 != 0) {
                System.out.println("-1");
                System.exit(0);
                break;
            }

            while (len>0){
                if(len>=4){
                    sb.append("AAAA");
                    len -= 4;
                }
                else if(len==2){
                    sb.append("BB");
                    len -=2;
                }
            }
            if(st2.hasMoreTokens()){
            sb.append(st2.nextToken());
            }
        }
//        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);

    }
}
