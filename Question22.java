package Lab03;

public class Question22 {
    public static void main(String[] args) {
        System.out.print("the largest positive n for which condition satisfies = ");
        for (int n = 1; n <= 300; n++) {
            // int n=300;
            if (((3 * n * n) - (730 * n)) < 0) {
                //System.out.println(n);
                // break;
                continue;
            } else {
                System.out.println(n);
                break;

            }
        }
    }
}