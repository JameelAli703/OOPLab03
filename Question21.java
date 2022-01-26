package Lab03;

import java.util.Scanner;

public class Question21 {
        public static void main(String[] args) {
            double sum = 0;
            System.out.println("Enter value of n: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            double k;
            for (k = 1; k <= n; k++) {
// Math.sqrt(k);
                sum += Math.sqrt(k);
            }

            System.out.println(sum);
        }
        }
