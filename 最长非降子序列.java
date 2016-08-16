/**
 * 
 * 
 * 运用动态规划，可以构造时间复杂度为O(n2)的算法。
 
算法基本思路：

1.打表，获取最长非降子序列的长度；

要构造最长非降子序列，可知此序列一定是以序列中某个数作为结尾。

因此，构造表ml[0...n-1]，ml[i] 表示前 i 个数以a[i] 为结尾的最长非降子序列的长度。

枚举 j (0 <= j < i)，若a[j] <= a[i]，则a[i]可在以a[j]为结尾的非降子序列后添加，此序列长度为ml[j] + 1.

因此ml[i] = max(ml[j] + 1) (0 <= j < i) .

构造出表ml后，遍历ml表，获取最大值。
//////////////////////////////////////////////////////////////////////////// 

2.获取最长非降子序列的一个解。

这个相当简单。只需要在构造表ml的过程中，添加表pre[0...n-1]，pre[i] 保存当前a[i]为结尾的非降子序列的前一个元素的编号。

在获得最长非降子序列的长度后，不断查找表pre即可找到整个序列。（pre 初始化为-1，表示序列的头）
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
