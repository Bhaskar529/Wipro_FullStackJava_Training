package bitwisealgorithm;

public class FindNonRepeatingElements {
	
	public static void  findNonRepeating(int[] arr) {
		int xor=0;
		for(int num: arr) {
			xor^=num;
		}//for
		int setBit=xor&-xor;
		int x=0,y=0;
		
		for(int num: arr) {
			if((num&setBit)==0) {
				x^=num;
			}else {
				y^=num;
			}//else
		}
		System.out.println("Two non repeating elements are : "+x+
				" and "+y);
	}//fun
	
	public static void main(String[] args) {
		int[] arr= {4,1,2,1,2,3,4,5};
		findNonRepeating(arr);

	}//main

}//class
