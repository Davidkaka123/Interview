import org.omg.CORBA.FloatSeqHelper;

/**
 * Created by davidshuvli on 2016/8/30.
 */
public class Main {

    public static void main(String[] args) {
        char[] input = {'a','b','c','e','s','f','c','s','a','d','e','e'};
        char[] temp = {'b', 'c','c','e','d'};
        if (hasPath(input, 3, 4, temp)) {
            System.out.println("ok");
        } else {
            System.out.println("not ok");
        }
    }

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        int[] flag = new int[matrix.length];
        for (int i = 0; i < rows; i ++) {
            for (int j = 0; j < cols; j ++) {
                if (hasPathCore(matrix, rows, cols, i, j, str, 0, flag)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasPathCore(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
        int index = i * cols + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[k] || flag[index] == 1) {
            return false;
        }

        if (k == str.length - 1) return true;

        flag[index] = 1;

        if (hasPathCore(matrix, rows, cols, i - 1, j, str, k + 1, flag) ||
            hasPathCore(matrix, rows, cols, i + 1, j, str, k + 1, flag) ||
            hasPathCore(matrix, rows, cols, i, j - 1, str, k + 1, flag) ||
            hasPathCore(matrix, rows, cols, i, j + 1, str, k + 1, flag)) {
            return true;
        }

        flag[index] = 0;
        return false;
    }



}
