import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
* Created by David on 2016/8/17.
*/
class Line {
    int x0;
    int y0;
    int x1;
    int y1;
    public Line(int x0, int y0, int x1, int y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }
}
public class Main {

    public static Set<Line> set = new HashSet<Line>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xmin = 0;
        int ymin = 0;
        int xmax = 0;
        int ymax = 0;
        for (int i = 0; i < n; i ++) {
            int x0 = sc.nextInt();
            int y0 = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            Line line = new Line(x0, y0, x1, y1);
            set.add(line);
            xmin = xmin > x0 ? x0 : xmin;
            xmin = xmin > x1 ? x1 : xmin;
            xmax = xmax > x0 ? xmax : x0;
            xmax = xmax > x1 ? xmax : x1;

            ymin = ymin > y0 ? y0 : ymin;
            ymin = ymin > y1 ? y1 : ymin;
            ymax = ymax > y0 ? ymax : y0;
            ymax = ymax > y1 ? ymax : y1;
        }
        System.out.println(xmin + " " + ymin + " " + xmax + " " + ymax);
    }
}
