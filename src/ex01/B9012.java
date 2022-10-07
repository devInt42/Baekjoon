package ex01;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class B9012 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //ex) 6
        boolean flag = true;

        for (int i=0; i<N; i++) {
            Stack<Character> stack = new Stack<Character>(); //Character형 스택
            flag = true;
            String input = sc.next(); //ex) (())))
            //System.out.println(input);

            for (int j=0; j<input.length(); j++) {
                char bracket = input.charAt(j); //ex) (
                //System.out.println(bracket);

                if (bracket == '(') { //열린괄호면
                    stack.push(bracket); //스택에 담음
                }
                else { //닫힌괄호면
                    if (stack.empty()){
                        flag = false;
                        continue; }//만약 스택이 비어있는 경우에는 꺼낼 수 없으므로 해당 조건문 탈출
                    else stack.pop(); //스택의 맨 위에 있는 열린괄호를 꺼냄
                }
            } //end for j

            if (stack.size()==0 && input.contains(")")==true && flag == true) { //스택이 비었다면 (열린괄호가 모두 꺼내졌다면) 괄호 짝이 맞았다는 뜻
                System.out.println("YES");
            }
            else System.out.println("NO");

        } //end for

        sc.close();
    }

}