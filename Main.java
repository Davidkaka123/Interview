import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static class Job implements Comparable<Job>{
        int arriveTime;//到达时间
        int jobTime;//工作时间
        Job(int arriveTime, int jobTime){
            this.arriveTime = arriveTime;
            this.jobTime = jobTime;
        }

        

        @Override
        public int compareTo(Job obj) {
            if(this.arriveTime < obj.arriveTime){
                return -1;
            }
            if(this.arriveTime == obj.arriveTime){
                if(this.jobTime < obj.jobTime){
                    return -1;
                }else if(this.jobTime > obj.jobTime){
                    return 1;
                }else{
                    return 0;
                }


            }
            return 1;
        }
        @Override
        public String toString(){
            return "("+this.arriveTime+","+this.jobTime+")";

        }

    }


    //短作业优先,使用优先级队列来实现短作业优先调度算法
    public static void SJF(List<Main.Job> jobList){
        int sumWaitTime = 0;//总等待时间
        int waitTime = 0;
        int curTime;//当前时间
        int jobNum = jobList.size();

        Collections.sort(jobList);
        curTime = jobList.get(0).arriveTime;//当前时间为第一个任务到达时间
        while(!jobList.isEmpty()){
            Job job = jobList.remove(0);
            waitTime = curTime-job.arriveTime;
            sumWaitTime += waitTime;
            curTime = curTime + job.jobTime;

        }

        System.out.println((double)sumWaitTime/jobNum);
    }

    public static void main(String args[]) {
        int num ;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        List<Job> jobList = new ArrayList<Job>();
        for(int i=0; i<num; i++){
            jobList.add(new Main.Job(scan.nextInt(),scan.nextInt()));
        }
        SJF(jobList);


    }


}