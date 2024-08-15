import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class UniqueNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 5, 2, 1, 3, 4);

        List<Integer> uniqueNumber = numbers.stream()
                .distinct()
                .collect(toList());
        System.out.println("Unique Numbers: " + uniqueNumber);

    }
}