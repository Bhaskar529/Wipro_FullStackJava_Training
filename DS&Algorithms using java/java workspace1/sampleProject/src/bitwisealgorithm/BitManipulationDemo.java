package bitwisealgorithm;

public class BitManipulationDemo {
	
	static int bitwiseAndOfAllSubsets(int[] arr) {
		int result=arr[0];
		for(int i=1;i<arr.length;i++) {
			result&=arr[i];
			if(result==0) {
				break;
			}//if
		}//for
		return result;
	}//method
	
	public static void main(String[] args) {
		int arr[]= {4,2,6}; 
	
		int result=bitwiseAndOfAllSubsets(arr);
		System.out.println("Bitwise AND of all subsets: "+result);

	}

}
