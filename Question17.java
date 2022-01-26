package Lab03;

public class Question17 {
    public static void main(String[] args) {
        double sum = 0;
        for (double i =0.01; i<=10; i++){
           sum = sum +i;
            System.out.print(i+" ");
        }
        System.out.println("\n Sum : "+sum);
    }
}
