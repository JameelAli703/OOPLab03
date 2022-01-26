package Lab03;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int c = sc.nextInt();
        long factorial =1;
        int i =1;
        do {
            factorial = factorial*i;
            i++;
        }while (i<=c);
        System.out.println("factorial of "+c+" is "+factorial);
    }
}
