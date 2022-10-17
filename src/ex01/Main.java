package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Parent{
    int a=0;
    Parent(){
        a++;
        System.out.print(a);
    }
}

class Child extends Parent{
    int b=0;
    Child(int a){
        this.b = a;
        System.out.println(a++);
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
     Parent pa = new Child(5);
    }
}
