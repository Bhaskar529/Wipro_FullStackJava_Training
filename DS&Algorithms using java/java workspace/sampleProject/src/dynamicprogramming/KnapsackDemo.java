package dynamicprogramming;

public class KnapsackDemo {
	
	static int knapSack(int M,int[] w,int[] p,int n) {
		int[][] C=new int[n+1][M+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=M;j++) {
			if(w[i-1] > j)
				C[i][j]=C[i-1][j];
			else {
				C[i][j]=Math.max(p[i-1]+C[i-1][j-w[i-1]],
						C[i-1][j]);
			}//else
			}//if
		}//if
		return C[n][M];
	}
	
	public static void main(String[] args) {
		int[] p= {60,100,120};
		int[] w= {10,20,30};
		int M=50;
		int n=p.length;
		System.out.println("The maximum profit : "+knapSack(M,w,p,n));
	}

}
