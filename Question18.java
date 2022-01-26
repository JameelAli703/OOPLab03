package Lab03;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        int x, y, gcd = 1;
        System.out.print("Enter first number : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextByte();
        System.out.print("Enter Second number : ");
        y = sc.nextByte();
        for(int i = 1; i <= x && i <= y; i++)
        {
            if(x%i==0 && y%i==0)
                gcd = i;
        }
        System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
    }
}
