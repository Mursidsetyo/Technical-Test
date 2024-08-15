import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class PrimeNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);

        System.out.println(numbers.stream()
                .filter(PrimeNumber::isPrime)
                .collect(toList()));
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}