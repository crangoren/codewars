package solutions;
import java.util.Arrays;

public class FindOutlier{

    static int find(int[] integers){
        int[] sample = new int[integers.length];
        int result = 0;

        for (int i = 0; i < integers.length; i++) {
            sample[i] = Math.abs(integers[i] %2);
        }

        int controlSum = Arrays.stream(sample).sum();
        if (controlSum > 1) {

            for (int j = 0; j < integers.length; j++) {
                int sum = Math.abs(integers[j] % 2);

                if (sum == 0) {
                    result = integers[j];
                }
            }
        } else {
            for (int k = 0; k < integers.length; k++) {
                int sum = Math.abs(integers[k] % 2);

                if (sum > 0) {
                    result = integers[k];
                }
            }
        }
        return result;
    }}


