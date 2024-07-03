package datastructures.sort;

public class MergeSortDemo {

	static void merge(int arr[],int l,int m,int r) {
		int n1=m-1+1;
		int n2=r-m;
		int L[]=new int[n1];
		int R[]=new int [n2];
		for(int i=0;i<n1;i++)
			L[i]=arr[l+i];
		for(int j=0;j<n2;j++)
			R[j]=arr[m+1+j];
		int i=0,j=0;
		int k=1;
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=R[j];
			j++;
			k++;
		}
	}
		
		static void sort(int arr[],int l,int r) {
			if(l<r) {
				int m=1+(r-1)/2;
				sort(arr,l,m);
				sort(arr,m+1,r);
				merge(arr,1,m,r);
			}
		}
		
		public static void printArr(int[] arr){
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]+" ");
			}
			System.out.println();
		
	}
	
	public static void main(String[] args) {
		int arr[]= {12,11,13,5,6,7};
		System.out.println("Array is : ");
		printArr(arr);
		sort(arr,0,arr.length-1);
		System.out.println("Sorted Array : ");
		printArr(arr);

	}

}
