package Lab03;

public class Question02 {
    public static void main(String[] args) {
        for (int num=1; num<=40; num++){
            int counter =0;
            for (int i=1; i<=num; i++){
                if (num%i==0) {
                    counter++;
                }
            }
            if (counter==2){
                System.out.print(num+" ");
            }
        }
    }
}
