import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by David on 2016/9/6.
 */
class Consum {
    public int num = 0;
    public int con = 0;
    public Consum(int num, int con) {
        this.num = num;
        this.con = con;
    }
}
public class 贪心求最大消费 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> table = new ArrayList<Integer>();
        ArrayList<Consum> con = new ArrayList<Consum>();
        for (int i = 0; i < n; i ++) {
            int temp = sc.nextInt();
            table.add(temp);
        }

        for (int i = 0; i < m; i ++) {
            int num = sc.nextInt();//人数
            int cost = sc.nextInt();//消费金额
            Consum tmp = new Consum(num, cost);
            con.add(tmp);
        }

        int max = 0;
        for (Integer capibility : table) {
            int index = 0;
            int curMax = 0;
            for (int i = 0; i < con.size(); i ++) {
                Consum cur = con.get(i);
                if (cur.num <= capibility) {
                    if (curMax <= cur.con) {
                        index = i;
                        curMax = cur.con;
                    }
                }
            }
            max += curMax;
            con.remove(index);
        }
//        Iterator it = table.iterator();
//        while (it.hasNext()) {
//            int capibility = (Integer)it.next();
//            int index = 0;
//            int curmax = 0;
//            for (int i = 0; i < con.size(); i ++) {
//                Consum cur = con.get(i);
//                if (cur.num <= capibility) {
//                    if (curmax <= cur.con) {
//                        index = i;
//                        curmax = cur.con;
//                    }
//                }
//            }
//
//            max += curmax;
//            con.remove(index);
//            it.remove();
//
//        }

        System.out.println(max);


    }
}
