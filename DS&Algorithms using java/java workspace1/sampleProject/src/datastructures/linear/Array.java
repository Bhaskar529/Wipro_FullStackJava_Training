package datastructures.linear;

public class Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks;
		marks=new int[5];
		marks[0]=75;
		marks[1]=34;
		marks[2]=54;
		marks[3]=55;
		marks[4]=76;
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(i+" "+marks[i]);
		}
	}
}
