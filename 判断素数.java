import java.util.Scanner;
/**
 * �ж�������
 * 	       ���棺�ж��Ƿ��ܱ���1������n��������
 * 	       �Ľ�����2*3,2*3+5����ʼ�ж��Ƿ��ܱ�����
 * 	       �Ľ�����Χ���޵�������������������ֱ�Ӳ��
 * */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scn = new Scanner(System.in);
//		int M = scn.nextInt();
//		int N = 0;
//		int sum = 0;
//		for(int i = 0; i < M; i ++){
//			
//			N = scn.nextInt();
//			
//			for(int j = 0; j < N; j ++){
//				
//				int tmp = scn.nextInt();
//				
//				if(isPrime(tmp)){
//					
//					sum += tmp;
//					
//				}
//				
//				
//			}
//			
//			System.out.println(sum);
//			sum = 0;
//			
//		}

		PrimeTable();
		
	}
//����	
//	private static boolean isPrime(int n){
//		
//		if(n <=1) return false;
//		
//		for(int i = 2; i <= Math.sqrt(n); i ++){
//			
//			if(n % i == 0) return false;
//			
//		}
//		
//		return true;
//	}
	//�Ľ�
//	private static boolean isPrime(int n){
//		
//		if(n == 1) return false;
//		if(n == 2 || n == 3){
//			return true;
//		}
//		
//		if(n % 6 != 1 && n % 6 != 5){
//			return false;
//		}
//		
//		for(int i = 5; i * i <= n; i +=6){
//			if(n % i == 0 || n % (i + 2) == 0){
//				return false;
//			}
//		}
//		
//		return true;
//		
//	}
	//�Ľ�ɸѡ���������⣬���޸ģ�
//	private static void PrimeTab(){
//		
//		final int N = 100;
//		
//		int[] increment = new int[]{0, 4, 0, 0, 0, 2};
//		boolean[] notPrime = new boolean[N + 5];
//		
//		for(int i = 5; i * i <= N; i += increment[i % 6]){
//			for(int j = i; i * j <= N; j += increment[j % 6]){
//				notPrime[i * j] = true;
//				System.out.println("not prime" + i*j);
//			}
//		}
//		for(int i = 0; i < N; i ++){
//			if(!notPrime[i]){
//				System.out.println("prime is " + i);
//			}	
//		}
//	}
	private static void PrimeTable(){
		
		final int n = 10000;
		boolean[] notPrime = new boolean[n + 5];
		
		for(int i = 2; i * i <= n; i ++){
			if(!notPrime[i]){
				for(int j = i * i; j <= n; j += i){
					notPrime[j] = true;
				}
			}
		}
		
		for(int i = 2; i < n; i ++){
			if(!notPrime[i]){
				System.out.println(i);
			}
			
		}
		
	}

}
