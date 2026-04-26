import java.util.HashMap;
import java.util.Map;

public class HashMapnew {

    public static void main(String[] args) throws InterruptedException {

        // create an HashMap
        HashMap<String, Integer> primeNumbers = new HashMap<>();

        // add mappings to HashMap
        primeNumbers.put("Two", 2);
        primeNumbers.put("Three", 3);
        System.out.println("Prime Numbers: " + primeNumbers);

        // create another HashMap
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 22);

        // Add all mappings from primeNumbers to numbers
       // numbers.putAll(primeNumbers);
        primeNumbers.putAll(numbers);
        System.out.println("primeNumbers: " + primeNumbers);

    }
}
