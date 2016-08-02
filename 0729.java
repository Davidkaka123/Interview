//public class Knapsack
//{
//    public static void knapsack(int[] v, int[] w, int c, int[][] m)
//    {
//        /** v[] w[] c �ֱ��Ǽ�ֵ���������ͱ�����������
//        m[i][j]��ʾ��i~n����Ʒ����������Ϊj������ֵ��*/
//
//        int n = v.length-1;
//        int jMax = Math.min(w[n]-1, c);
//        for(int j = 0; j <= jMax; j++)
//            m[n][j] = 0;        //��w[n]>j �� m[n][j]=0
//
//        //m[n][j] ��ʾֻ��n��Ʒ������������Ϊjʱ������ֵ
//        for (int l = w[n]; l <= c; l++)
//            m[n][l] = v[n];  //��w[n]<=j ��m[n][j]=v[n]
//
//        //�ݹ�������m[][]����ֵ��ֱ�����m[0][c]
//        for(int i = n-1; i >=1; i--)
//        {
//            jMax = Math.min(w[i]-1,c);
//            for(int k = 0; k <=jMax; k++)
//                m[i][k] = m[i+1][k];
//
//            for(int h = w[i]; h <= c; h++)
//                m[i][h] = Math.max(m[i+1][h],m[i+1][h-w[i]]+v[i]);
//        }
//        m[0][c] = m[1][c];
//        if(c >= w[0])
//            m[0][c] = Math.max(m[0][c],m[1][c-w[0]]+v[0]);
//
//        System.out.println("bestw ="+m[0][c]);
//    }
//
//    public static void traceback(int[][] m, int[] w, int c, int[] x)
//    {// ��������ֵ������Ž�
//        int n = w.length-1;
//        for(int i = 0; i<n;i++)
//            if(m[i][c] == m[i+1][c])
//                x[i] = 0;
//            else{
//                x[i] = 1;
//                c -= w[i];
//            }
//        x[n] = (m[n][c]>0)?1:0;
//    }
//    public static void main(String[] args)
//    {
//        //����
//        int[] ww = {2,2,6,5,4};
//        int[] vv = {6,3,5,4,6};
//        int[][] mm = new int[11][11];
//        knapsack(vv,ww,10,mm);
//
//        int[] xx =new int[ww.length];
//        traceback(mm,ww,10,xx);
//        for(int i = 0;i<xx.length;i++)
//            System.out.println(xx[i]);
//    }
//}