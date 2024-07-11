package PatternSearch;
// Time complexity = 0(m*n)worst case
public class NaivePatternSearch {

	static void search(String text,String pattern) {
		int n=text.length();
		int m=pattern.length();
		for(int i=0;i<=n-m;i++) {
			int j;
			
			for(j=0;j<m;j++) {
				if(text.charAt(i+j)!=pattern.charAt(j))
					break;
			}//for
			if(j==m)
				System.out.println("Pattern found at index : "+i);
		}//for
		
	}//fun
	
	
	public static void main(String[] args) {
		
		String text="ABAAABCD";
		String pattern="ABC";
		search(text,pattern);

	}

}
