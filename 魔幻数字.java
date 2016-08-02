import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by David on 2016/7/28.
 */
public class 魔幻数字 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int source = sc.nextInt();
            while (true) {
                int[] numbers = new int[4];
                int index = 10;
                boolean flag = false;
                for (int i = 0; i < 4; i++) {
                    numbers[i] = (source % index) / (index / 10) ;
                    index *= 10;
                }
                Arrays.sort(numbers);

                int big = 0;
                int small = 0;

                for (int i = 0; i < 4; i++) {
                    if (numbers[i] == 0) {
                        flag = true;
                    }
                    small = small * 10 + numbers[i];
                }

                for (int i = 3; i >= 0; i--) {
                    big = big * 10 + numbers[i];
                }

                int result = big - small;
                String little = Integer.toString(small);
                if (flag) {
                    little = "0" + little;
                }

                if (result == 0) {
                    System.out.println(big + " - " + little + " = 0000");
                    break;
                } else if (big - small == 6174) {
                    System.out.println(big + " - " + little + " = 6174");
                    break;
                } else {
                    System.out.println(big + " - " + little + " = " + result);
                    source = result;
                }
            }

        }
    }

}
