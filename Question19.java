package Lab03;

public class Question19 {
    public static void main(String[] args) {
        double a = 38500;
        double i;
        int n = 21;
        int begins = 38500;
        while (true){
            i = a * 0.07;
            a +=i;
            n++;
            if (a >= 77000){
                break;
            }
        }
        System.out.println( "fees will be double in this year 20"+n);

    }
}
