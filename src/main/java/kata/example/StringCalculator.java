package kata.example;

import java.util.Arrays;

public class StringCalculator {


    public static int sum(String text) {
        if (text.isEmpty()){
            return 0;
        }

        if(text.startsWith("//")){
            String delimiter = text.substring(2, 3);
            String numbers = text.substring(4);
            return Arrays.stream(numbers.split(delimiter))
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);

        }

        String[] numbers = text.replace("\\n", ",").split(",");
        return Arrays.stream(numbers)
                .map(String::trim)
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }
}
