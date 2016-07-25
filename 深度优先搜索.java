import java.beans.beancontext.BeanContext;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by David on 2016/7/9.
 */
public class 深度优先搜索 {
    static boolean res = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] chararrs = new char[n][m];
        String W = sc.next();
        int i = 0;
        while (sc.hasNext()) {
            String curString = sc.next();
            for (int j = 0; j < curString.length(); j ++) {
                chararrs[i][j] = curString.charAt(j);
            }
            i ++;
            if (i == n) break;
        }

        char one = W.charAt(0);
        for (i = 0; i < chararrs.length; i ++) {
            for (int j = 0; j < chararrs[i].length; j ++) {
                if (chararrs[i][j] == one) {
                    HashSet curset = new HashSet();
                    DSP(chararrs, n, m, i, j, W, curset);
                    if (res) break;
                }
            }
        }
        if (!res) System.out.println("NO");

    }

    public static void DSP(char[][] arrys, int n, int m, int i, int j, String W, HashSet hashSet) {
        char one = W.charAt(0);
        if (arrys[i][j] != one){
            return;
        }
        if (hashSet.contains(i + j)) {
            return;
        }
        if (W.length() == 1) {
            System.out.println("YES");
            res = true;
            return;
        }
        hashSet.add(i + j);
        W = W.substring(1);
        for (int tr = 0; tr < 4; tr ++ ) {
            HashSet temp = new HashSet(hashSet);
            switch (tr) {
                case 0 :
                    if (i > 0) DSP(arrys, n, m, i - 1, j, W, temp);
                    else return;
                    break;
                case 1 :
                    if (i < n - 1) DSP(arrys, n, m, i + 1, j, W, temp);
                    else return;
                    break;
                case 2 :
                    if (j > 0) DSP(arrys, n, m, i, j - 1, W, temp);
                    else return;
                    break;
                case 3 :
                    if (j < m - 1) DSP(arrys, n, m, i, j + 1, W, temp);
                    else return;
                    break;
                default: break;
            }
        }
    }
}
