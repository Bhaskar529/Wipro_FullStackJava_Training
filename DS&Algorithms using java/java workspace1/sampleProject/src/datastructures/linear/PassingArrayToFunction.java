package datastructures.linear;

public class PassingArrayToFunction {
	public static void addition(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of array values :"+sum);
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		addition(arr);

	}

}
