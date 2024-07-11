package computaional.algorithms;

public class TowerOfHanoi {

	public static void solveTowerOfHanoi(int n,char sourceRod,
			char targetRod,char auxilaryRod) {
		if(n==1) {
			System.out.println("Move disk 1 from rod "+sourceRod+" to "+
		targetRod);
		return ;
		}
		solveTowerOfHanoi(n-1,sourceRod,auxilaryRod,targetRod);
		System.out.println("Move disk "+n+" from rod "+sourceRod+
				" to Rod "+targetRod);
		solveTowerOfHanoi(n-1,auxilaryRod,targetRod,sourceRod);
	
	}
	
	public static void main(String[] args) {
		
		int numberOfDisks=3;
		
		solveTowerOfHanoi(numberOfDisks,'A','C','B');
	}

}
