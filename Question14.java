package Lab03;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        int correct =0, wrong=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is 3 * 5 :");
        int a = sc.nextInt();
        if (a==15){
            System.out.println("Your Answer is Correct!");
            correct++;
        }else{
            System.out.println("Your Answer is Wrong.");
            System.out.println("3 * 5 should be 15");
            wrong++;
        }
        System.out.print("\n What is 4 * 5 :");
        int b = sc.nextInt();
        if (b==20){
            System.out.println("Your Answer is Correct!");
            correct++;
        }else{
            System.out.println("Your Answer is Wrong.");
            System.out.println("4 * 5 should be 20");
            wrong++;
        }
        System.out.print("\n What is 5-5 :");
        int c = sc.nextInt();
        if (c==0){
            System.out.println("Your Answer is Correct!");
            correct++;
        }else{
            System.out.println("Your Answer is Wrong.");
            System.out.println("5-5 should be 0");
            wrong++;
        }
        System.out.print("\n What is 4 + 5 :");
        int d = sc.nextInt();
        if (d==9){
            System.out.println("Your Answer is Correct!");
            correct++;
        }else{
            System.out.println("Your Answer is Wrong.");
            System.out.println("4 + 5 should be 9");
            wrong++;
        }
        System.out.print("\n What is 4 * 4 :");
        int e = sc.nextInt();
        if (e==16){
            System.out.println("Your Answer is Correct!");
            correct++;
        }else{
            System.out.println("Your Answer is Wrong.");
            System.out.println("4 * 4 should be 16");
            wrong++;
        }
        System.out.println("Correct count is : "+correct);
        System.out.println("Wrong Count is : "+wrong);
        System.out.println("\n");
        System.out.print("3 * 5 :"+a);
        if (a==15){
            System.out.println(" correct");
        }else{
            System.out.println(" wrong");
        }
        System.out.print("4 * 5 : "+b);
        if (b==20){
            System.out.println(" correct");
        }else{
            System.out.println(" wrong");
        }
        System.out.print("5-5 : "+c);
        if (c==0){
            System.out.println(" correct");
        }else{
            System.out.println(" wrong");
        }
        System.out.print("4 + 5 : "+d);
        if (d==9){
            System.out.println(" correct");
        }else{
            System.out.println(" wrong");
        }
        System.out.print("4 * 4 : "+e);
        if (e==16){
            System.out.println(" correct");
        }else{
            System.out.println(" wrong");
        }
    }
}
