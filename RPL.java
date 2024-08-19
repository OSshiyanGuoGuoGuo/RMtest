import java.util.Arrays;

public class RPL {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int[] results = Arrays.stream(numbers)
                .map(PipelineExample::addOne)
                .map(PipelineExample::square)
                .toArray();

        System.out.println(Arrays.toString(results));
    }

    private static int addOne(int x) {
        return x + 1;
    }

    private static int square(int x) {
        return x * x;
    }
}