///**
// * Created by davidshuvli on 2016/8/5.
// */
//import java.util.Scanner;
//
//public class Main{
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int sum_money = 0;
//        int num = 0;
//        sum_money=sc.nextInt();
//        num=sc.nextInt();
//        int price[]=new int[num+1];
//        int val[]=new int[num+1];
//        int[] q = new int[num+1];
//        for (int i = 1; i <= num; i++) {
//            price[i]=sc.nextInt();
//            val[i]=sc.nextInt()*price[i];
//            q[i]=sc.nextInt();
//        }
//        int[][] dp=new int[num+1][sum_money+1];
///*
//* ��ʼֵjavaĬ�ϸ�ֵΪ0,����dp[0][0...sum_money]Ϊ0,��dp[1][0...sum_money]
//  �����1��,�����һ����Ʒ
//dp[i][sum_money] �� ǰi�������������Ϊsum_money�ı���������ֵ��
//dp[i-1][sum_money] �� ǰi-1�������������Ϊsum_money�ı���������ֵ��
//dp[i-1][sum_money-price[i]] �� ǰi-1�������������Ϊsum_money-price[i]�ı���������ֵ��
//dp[i][sum_money]=Math.max{dp[i-1][sum_money-price[i]]+val[i] , dp[i-1][sum_money]}
//*/
//        for (int i = 1; i <=num; i++) {
//            for (int j = 1; j <= sum_money; j++) {
//                if(q[i]==0)
//                {
//                    if(price[i]<=j)
//                        dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-price[i]]+val[i]);
//                }
//                if(q[i]>0)
//                {
//                    if(price[i]+price[q[i]]<=j)
//                        dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-price[i]-price[q[i]]]+val[i]+val[q[i]]);
//                }
//            }
//
//        }
//        System.out.println(dp[num][sum_money]);
//    }
//
//}