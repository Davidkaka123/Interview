package edu.lsw;

public class RailwayDesign {
	
	private static int MAX = 10000; //不连通状态
	public static int[][] adjMat = {
		{MAX,5,MAX,5,7},
		{MAX,MAX,4,MAX,MAX},
		{MAX,MAX,MAX,8,2},
		{MAX,MAX,8,MAX,6},
		{MAX,3,MAX,MAX,MAX}
	};
	
	public static void main(String[] args) {
		RailwayDesign dijstraAlgorithm = new RailwayDesign();
		int start = 0;
		int end   = 2;
		System.out.println("------测试------");
		System.out.println("\n从" + start + "到" + end 
				+ "的距离是:" + dijstraAlgorithm.reslove(adjMat, start, end));
		
	}
	
	/**
	 * 在用邻接矩阵adjMat表示的图中，求解从点s到点t的最短路径
	 * @param adjMat 邻接矩阵
	 * @param s 起点
	 * @param t 终点
	 * @return
	 */
	public int reslove(int[][] adjMat,int s,int t) {
		
		//判断参数是否正确
		if(s < 0 || t < 0 || s >=adjMat.length || t >= adjMat.length) {
			System.out.println("错误，顶点不在图中!");
			return MAX;
		}
		
		//用来记录某个顶点是否已经完成遍历，即替代优先队列的"移出队列"动作
		boolean[] isVisited = new boolean[adjMat.length];
		//用于存储从s到各个点之间的最短路径长度
		int[] d = new int[adjMat.length]; 
		
		//初始化数据
		for(int i=0;i<adjMat.length;i++) {
			isVisited[i] = false;
			d[i] = MAX;
		}
		d[s]=0;
		//d[s] = MAX; //s到s的距离是0 
		//isVisited[s] = false; //将s标记为已访问过的
		isVisited[s] = true; //将s标记为已访问过的

		//尚未遍历的顶点数目，替代优先队列是否为空的判断即Queue.isEmpty()
		int unVisitedNum = adjMat.length;
		//用于表示当前所保存的子路径中权重最小的顶点的索引,对应优先队列中,默认是起点
		int index = s; 
		while(unVisitedNum > 0 && index != t) {
			int min = MAX;
			for(int i=0;i<adjMat.length;i++) { //取到第i行的最小元素的索引
				if(min > d[i] && !isVisited[i]) {
					min = d[i];
					index = i;
				}
			}
			if(index == t || unVisitedNum == 0) {
				System.out.print(index); //打印最短路径
			} else {
				System.out.print(index + "=>"); //打印最短路径
			}
			for(int i=0;i<adjMat.length;i++) {
				if(d[index] + adjMat[index][i] < d[i]) {
					d[i] = d[index] + adjMat[index][i];
				}
			}
			unVisitedNum --;
			isVisited[index] = true;
		}
		return d[t];
	}
}
