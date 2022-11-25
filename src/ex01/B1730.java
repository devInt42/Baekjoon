    package ex01;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class B1730 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            char[][] arr = new char[N][N];
            String str = br.readLine();
            int x = 0, y = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = '.';
                }
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'U' && x > 0) {
                    if (arr[x][y] == '.') arr[x][y] = '|';
                    else if (arr[x][y] == '-')  arr[x][y] = '+';
                    else if (arr[x][y] == '+')  arr[x][y] = '+';
                    else if (arr[x][y] == '|')  arr[x][y] = '|';
                    x--;
                    if (arr[x][y] == '.') arr[x][y] = '|';
                    else if (arr[x][y] == '-') arr[x][y] = '+';
                    else if (arr[x][y] == '+') arr[x][y] = '+';
                    else if (arr[x][y] == '|') arr[x][y] = '|';
                }
                else if (str.charAt(i) == 'D' && x < N - 1) {
                    if (arr[x][y] == '.') arr[x][y] = '|';
                    else if (arr[x][y] == '-') arr[x][y] = '+';
                    else if (arr[x][y] == '+') arr[x][y] = '+';
                    else if (arr[x][y] == '|') arr[x][y] = '|';
                    x++;
                    if (arr[x][y] == '.') arr[x][y] = '|';
                    else if (arr[x][y] == '-') arr[x][y] = '+';
                    else if (arr[x][y] == '+') arr[x][y] = '+';
                    else if (arr[x][y] == '|') arr[x][y] = '|';
                }
                else if (str.charAt(i) == 'R' && y < N - 1) {
                    if (arr[x][y] == '.') arr[x][y] = '-';
                    else if (arr[x][y] == '|') arr[x][y] = '+';
                    else if (arr[x][y] == '+') arr[x][y] = '+';
                    else if (arr[x][y] == '-') arr[x][y] = '-';
                    y++;
                    if (arr[x][y] == '.') arr[x][y] = '-';
                    else if (arr[x][y] == '|') arr[x][y] = '+';
                    else if (arr[x][y] == '+') arr[x][y] = '+';
                    else if (arr[x][y] == '-') arr[x][y] = '-';
                }
                else if (str.charAt(i) == 'L' && y > 0) {
                    if (arr[x][y] == '.') arr[x][y] = '-';
                    else if (arr[x][y] == '|') arr[x][y] = '+';
                    else if (arr[x][y] == '+') arr[x][y] = '+';
                    else if (arr[x][y] == '-') arr[x][y] = '-';
                    y--;
                    if (arr[x][y] == '.') arr[x][y] = '-';
                    else if (arr[x][y] == '|') arr[x][y] = '+';
                    else if (arr[x][y] == '+') arr[x][y] = '+';
                    else if (arr[x][y] == '-') arr[x][y] = '-';
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[i][j]);
                }
                if (i != N - 1) {
                    System.out.println();
                }
            }
        }
    }