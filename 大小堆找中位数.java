import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by davidshuvli on 2016/8/23.
 */
public class Main {
    //创建两个堆，默认为最小堆，和一个最大堆。
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(11,new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1<o2 ? 1 : (o1==o2 ? 0 : -1);
        }
    });

    public static void main(String[] args) {

    }
    public void Insert(Integer num) {
        if(((minHeap.size()+maxHeap.size())&1)==0){  //总共为偶数

            if(!maxHeap.isEmpty()&&num<maxHeap.peek()){
                maxHeap.offer(num);
                num=maxHeap.poll();
            }
            minHeap.offer(num);
        }else{

            if(!minHeap.isEmpty()&&num>minHeap.peek()){
                minHeap.offer(num);
                num=minHeap.poll();
            }
            maxHeap.offer(num);
        }
    }

    public Double GetMedian() {
        int size=minHeap.size()+maxHeap.size();
        if(size==0)
            throw new RuntimeException("no available number!");
        double result;

        if((size&1)==1)
            result=minHeap.peek();
        else
            result=(minHeap.peek()+maxHeap.peek())/2.0;
        return result;
    }
}
