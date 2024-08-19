import java.util.Arrays;

public class RPL {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] results = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int temp = numbers[i] + 1;
            results[i] = temp * temp;
        }

        System.out.println(Arrays.toString(results));
    }
}