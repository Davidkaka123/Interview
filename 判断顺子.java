import java.util.Arrays;

/**
 * Created by davidshuvli on 2016/9/2.
 */
public class Main {

    public static void main(String[] args) {

        int[] num = {};// {0, 0, 0, 3, 0};
        System.out.print(isContinuous(num));

    }

    public static boolean isContinuous(int [] numbers) {
        int numOfzero = 0;
        int numOfGap = 0;
        if (numbers.length == 0) return false;
        Arrays.sort(numbers);
        for (int tmp : numbers) {
            if (tmp == 0) {
                numOfzero ++;
            }
        }

        for (int i = 0; i < numbers.length - 1; i ++) {
            int j = i + 1;
            if (numbers[i] == 0) {
                continue;
            }

            if (numbers[i] == numbers[j]) {
                return false;
            }
            numOfGap += numbers[j] - 1 - numbers[i];
        }

        if (numOfGap <= numOfzero) {
            return true;
        } else {
            return false;
        }

    }
}
