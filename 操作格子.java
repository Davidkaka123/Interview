import java.util.Scanner;

/**
 * Created by davidshuvli on 2016/9/8.
 */
//class parent {
//    int i;
//    protected int x;
//    public parent() {x=0;i=0;}
//    void change() {x++;i ++;}
//    public void display() {};
//}
//
//class son extends parent {
//    public void modify(){x++;};
//
//    @Override
//    public void display() {
//        System.out.println("x=" + x);
//    }
//}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] box = new int[n];
            int m = sc.nextInt();
            for (int i = 0; i < n; i ++) {
                box[i] = sc.nextInt();
            }
            for (int j = 0; j < m; j ++) {
                int operate = sc.nextInt();
                int no1 = sc.nextInt();
                int no2 = sc.nextInt();
                switch (operate) {
                    case 2:
                        sumbox(box, no1, no2);
                        break;
                    case 3:
                        maxbox(box, no1, no2);
                        break;
                    default:
                        break;
                }
            }

        }
    }

    public static void sumbox(int[] box, int o1, int o2) {
        int res = 0;
        for (int i = o1 - 1; i < o2; i ++) {
            res += box[i];
        }
        System.out.println(res);
    }
    public static void maxbox(int[] box, int o1, int o2) {
        int max = 0;
        for (int i = o1 - 1; i < o2; i ++) {
            max = max > box[i] ? max : box[i];
        }
        System.out.println(max);
    }

    public static void test() {
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                System.out.print("foo");
            }
        };
        Thread t = new Thread(runner);
        t.run();
        System.out.print("bar");
        System.out.println();
    }
}
