import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        int n;
        // Input the integer
        System.out.println(" Input N Value : ");
        Scanner s =new Scanner(System.in);
        n =s.nextInt();
        for (int i=1;i<11;i++){
            int result = n*i;
            System.out.println(n + " x " +i+ " = "+result);
        }
    }
}