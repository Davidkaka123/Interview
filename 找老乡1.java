import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by davidshuvli on 2016/9/19.
 */
public class ’“¿œœÁ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            if (N == 0 && M == 0) {
                break;
            }
            HashMap<Integer, HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>();

            for (int i = 0; i < M; i ++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (map.get(a) == null) {
                    HashSet<Integer> tmp = new HashSet<Integer>();
                    tmp.add(b);
                    tmp.add(a);
                    map.put(a, tmp);
                } else {
                    HashSet<Integer> tmp = map.get(a);
                    if (map.get(b) == null) {
                        tmp.add(b);
                        tmp.add(a);
                    } else {
                        for (Integer btemp : map.get(b)) {
                            tmp.add(btemp);
                        }
                    }
                    map.put(a, tmp);
                }

                if (map.get(b) == null) {
                    HashSet<Integer> tmp = new HashSet<Integer>();
                    tmp.add(b);
                    tmp.add(a);
                    map.put(b, tmp);
                } else {
                    HashSet<Integer> tmp = map.get(b);
                    if (map.get(a) == null) {
                        tmp.add(b);
                        tmp.add(a);
                    } else {
                        for (Integer btemp : map.get(a)) {
                            tmp.add(btemp);
                        }
                    }
                    map.put(b, tmp);
                }
            }

            if (map.get(1) == null) {
                System.out.println(0);
            } else {
                HashSet<Integer> tmp = map.get(1);
                for ( Integer num :map.get(1) ) {
                    if (map.get(num) != null) {
                        for (Integer data : map.get(num)) {
                            tmp.add(data);
                        }
                    }
                }
                System.out.println(tmp.size() - 1);
            }

        }
    }
}
