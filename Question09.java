package Lab03;

import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println("Multiplication Table of "+n);
        for (int i = 1; i<=10; i++){
            System.out.println(i+" x "+n+"="+i*n);
        }
    }
}
