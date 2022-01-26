package Lab03;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        int prime_sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the ten prime numbers :");
        for (int i=1;i<=10;i++){
            System.out.print("enter prime number "+i+" : ");
            int k=sc.nextInt();
            prime_sum+=k;
        }
        System.out.println("prime sum = "+prime_sum);
    }

}

