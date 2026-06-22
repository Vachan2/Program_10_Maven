package org.example.program_1010;

public class Program1010Application {
    public int add(int a, int b){ return a+b;}
    public static void main(String[] args) {
        Program1010Application app = new Program1010Application();
        int result = app.add(2,3);
        System.out.println("2 + 3 is equals to "+result);
    }
}
