import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by David on 2016/7/20.
 */
public class 空饮料瓶换饮料 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int input = sc.nextInt();
            if (0 == input) break;
            else {
                System.out.println(solution(input));
            }
        }
    }

    public static int solution (int n) {
        int sum = 0;
        if (n <= 1) sum = 0;
        else sum = n / 2;
        return sum;
    }
}
