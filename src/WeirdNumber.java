import java.util.Scanner;

class WeirdNumber {
    public static void main(String[] args)
    {
        int n;
        // Input the integer
        System.out.println(" Input N Value : ");
        // Create Scanner object
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        if (n % 2 != 0 & n>=5 && n<=9) {
            System.out.println("Entered Number is Weird");
        }
        else {
            System.out.println("Entered Number is Not Weird");
        }
    }
}