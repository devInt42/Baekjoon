package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1296 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[4]; //arr[0] =L의 개수 arr[1] = O의개수 ...
        String teamName = ""; //선정된 팀이름을 저장할 변수
        int max = 0; //최고확률의 수치를 저장할 변수

        for (int i = 0; i < name.length(); i++) {   //입력받은 이름에서 L O V E 개수 검출
            if (name.charAt(i) == 'L') {
                arr[0]++;
            } else if (name.charAt(i) == 'O') {
                arr[1]++;
            } else if (name.charAt(i) == 'V') {
                arr[2]++;
            } else if (name.charAt(i) == 'E') {
                arr[3]++;
            }
        }

        for (int i = 0; i < num; i++) {   //입력받은 팀이름에서 L O V E 개수 검출
            String str = br.readLine();
            int[] arr2 = new int[4];    //팀 이름에서 나온 LOVE갯수
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'L') {
                    arr2[0]++;
                } else if (str.charAt(j) == 'O') {
                    arr2[1]++;
                } else if (str.charAt(j) == 'V') {
                    arr2[2]++;
                } else if (str.charAt(j) == 'E') {
                    arr2[3]++;
                }
            }
            int res = 1;//초기화

            for (int k = 0; k < 3; k++) { //((L+O) × (L+V) × (L+E) × (O+V) × (O+E) × (V+E))
                for (int l = k + 1; l < 4; l++) {
                    res *= (arr[k] + arr2[k] + arr[l] + arr2[l]);
                }
            }
            res %= 100; //((L+O) × (L+V) × (L+E) × (O+V) × (O+E) × (V+E)) mod 100

            if (teamName.equals("")) {
                teamName = str;
            }
            if (res == max) {   //확률이 같을 경우 사전순으로 가장 먼저오는것을 선정
                String[] dictTest = new String[2];
                dictTest[0] = teamName;
                dictTest[1] = str;
                Arrays.sort(dictTest);
                teamName = dictTest[0];
            } else if (res > max) {
                max = res;
                teamName = str;
            }
        }
        System.out.println(teamName);
    }
}
