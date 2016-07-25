import java.util.Scanner;

/**
 * Created by David on 2016/7/24.
 */
public class 判断单词字典 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            boolean res = true;
            String[] arr = new String[n];
            for (int i = 0; i < n; i ++) {
                arr[i] = sc.next();
            }

            for (int j = 1; j < n; j ++) {
                if (arr[j - 1].charAt(arr[j - 1].length() - 1) == arr[j].charAt(0)) {
                    continue;
                } else
                    res = false;
            }

            String out = res ? "Yes" : "No";
            System.out.println(out);

        }
    }
}


