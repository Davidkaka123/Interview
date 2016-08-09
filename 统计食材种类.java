import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by David on 2016/8/2.
 */
/**
 * //首先，最近3小时，1天，一周播放歌曲的数量级相差较大，针对不同的数据及大小，可以分别使用不同的方式
 ​一、对于求3小时播放次数和1天播放次数最多的K个歌曲，由于数据集相对较小（1天播放次数数据根据情况而定），可以使用的方式主要有：
 （1）如果3小时内歌曲index数据可以装入内存，则可以通过快速排序的方式找到播放次数最多的K个歌曲；​
 ​（2）如果歌曲index数据无法全部装入内存，可以通过外部排序的方式找出播放次数最多的K个歌曲；
 ​（3）如果歌曲index数据无法全部装入内存，可以通过小顶堆的方式找出播放次数最多的K个歌曲；
 ​
 ​二、对于求1天和一周播放次数最多的K个歌曲，由于数据集很大（1天播放次数根据数据情况而定），需要通过集群处理
 ​（1）可以通过将数据集通过Hash进行分块，使每块数据量在单机处理能力之内，对每个数据块的数据使用上述（一）中的方式进行处理；
 ​（2）通过MapReduce方式，对每首歌曲的index进行词频的统计，对词频统计结果进行排序，得到词频最高的K个歌曲。
 * */
public class 统计食材种类 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
        while (sc.hasNext()) {
            set.add(sc.next());
        }
        System.out.println(set.size());
    }
}
