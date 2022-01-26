package Lab03;

public class Question16 {
    public static void main(String[] args) {
        System.out.println("          Multiplication Table      ");
        System.out.println("________________________________________________");
        for (int j = 1; j<2; j++){
           for (int i = 1; i<=10; i++){
             //  System.out.print(i+"   ");

               System.out.println("    "+i+"|  "+i*j+"  "+i*2+"  "+i*3+"  "+i*4+"  "+i*5+"  "+i*6+"  "+i*7+"  "+i*8+"  "+i*9+"  ");
           }
        }
    }
}
