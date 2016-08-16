/**
 * 
 * 
 * ���ö�̬�滮�����Թ���ʱ�临�Ӷ�ΪO(n2)���㷨��
 
�㷨����˼·��

1.�����ȡ��ǽ������еĳ��ȣ�

Ҫ������ǽ������У���֪������һ������������ĳ������Ϊ��β��

��ˣ������ml[0...n-1]��ml[i] ��ʾǰ i ������a[i] Ϊ��β����ǽ������еĳ��ȡ�

ö�� j (0 <= j < i)����a[j] <= a[i]����a[i]������a[j]Ϊ��β�ķǽ������к���ӣ������г���Ϊml[j] + 1.

���ml[i] = max(ml[j] + 1) (0 <= j < i) .

�������ml�󣬱���ml����ȡ���ֵ��
//////////////////////////////////////////////////////////////////////////// 

2.��ȡ��ǽ������е�һ���⡣

����൱�򵥡�ֻ��Ҫ�ڹ����ml�Ĺ����У���ӱ�pre[0...n-1]��pre[i] ���浱ǰa[i]Ϊ��β�ķǽ������е�ǰһ��Ԫ�صı�š�

�ڻ����ǽ������еĳ��Ⱥ󣬲��ϲ��ұ�pre�����ҵ��������С���pre ��ʼ��Ϊ-1����ʾ���е�ͷ��
 * 
 * */
public class Main {
	public static String getMaxLen(int[] a){
        //return the length of longest increasing subsequence and the subsequence
        int[] ml = new int[a.length];
        int[] pre = new int[a.length];
        //build length table
        for(int i = 0; i < ml.length; i ++){
            ml[i] = 1;
            pre[i] = -1;
            for(int j = 0; j < i; j ++){
                if(a[j] <= a[i] && ml[j] + 1 > ml[i]){
                    ml[i] = ml[j] + 1;
                    pre[i] = j;
                }
            }
        }
        //find max length
        int k = 0;
        for(int i = 1; i < ml.length; i ++){
            if(ml[k] < ml[i]){
                k = i;
            }
        }
        String result = Integer.toString(ml[k]);
        String temp = "";
        //get subsequence
        while(k != -1){
            temp = Integer.toString(a[k]) + " " + temp;
            k = pre[k];
        }
        result += "/" + temp;
        return result;
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 4, 9, 6, 8};
        String[] result = getMaxLen(a).split("/");
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
