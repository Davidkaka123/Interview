import java.util.*;

/**
 * Created by David on 2016/8/17.
 */
public class 找出序列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i ++) {
            int input = sc.nextInt();
            System.out.println(findout(input));
        }
    }

    public static String findout(int input) {
        Queue<Integer> queue = new LinkedList<Integer>();
        while (input > 0) {
            queue.add(input);
            int tmp = queue.peek();
            queue.remove();
            queue.add(tmp);
            input --;
        }

        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new Stack<Integer>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop() + " ");
        }
        return sb.toString().trim();
    }
}
