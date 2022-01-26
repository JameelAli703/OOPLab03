package Lab03;

public class Question20 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i =1; i<=100; i++){
            if (i==11){
                continue;
            }if (i==22){
                continue;
            }if (i==33){
                continue;
            }if (i==44){
                continue;
            }if (i==55){
                continue;
            }if (i==66){
                continue;
            }if (i==77){
                continue;
            }if (i==88){
                continue;
            }if (i==99){
                continue;
            }
            sum = sum+i;
        }
        System.out.println(sum);
    }
}