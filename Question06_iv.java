package Lab03;

public class Question06_iv {
    public static void main(String[] args) {
        int space;
        for (int i = 1, k=0; i<=5; ++i, k=0){
            for (space=1; space<=5-i; ++space){
                System.out.print("  ");
            }
            while (k!=2*i-1){
                System.out.print(" *");
                ++k;
            }
            System.out.println();
        }
    }
}
