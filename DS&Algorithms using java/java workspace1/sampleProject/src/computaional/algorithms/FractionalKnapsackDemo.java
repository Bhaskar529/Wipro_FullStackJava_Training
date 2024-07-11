package computaional.algorithms;
import java.util.Arrays;
import java.util.Comparator; 

public class FractionalKnapsackDemo {
	static class Item{
	int profit,weight;
	
	public Item(int profit,int weight) {
		super();
		this.profit=profit;
		this.weight=weight;
	}//item
}//inner class
	private static double getMaxValue(Item[] arr, int capacity) {
		
		Arrays.sort(arr,new Comparator<Item>() {
			@Override
			public int compare(Item item1,Item item2) {
				double cpr1 =new Double((double)item1.profit)/(double)item1.weight;
				double cpr2=new Double((double)item2.profit)/(double)item2.weight;
				if(cpr1<cpr2)
					return 1;
				else
					return -1;
			
			}//fun
		});
		double totalValue=0d;
		for(Item i:arr) {
			int curWt=(int)i.weight;
			int curVal1=(int)i.profit;
			if(capacity-curWt>=0) {
				capacity=capacity-curWt;
				totalValue+=curVal1;
			}
			else {
				double fraction=((double)capacity/(double)curWt);
				totalValue+=(curVal1*fraction);
				capacity=(int)(capacity-(curWt*fraction));
				break;
			}
		}
		return totalValue;
	}//fun
	public static void main(String[] args) {
		Item[] arr= {
				new Item(60,10),
				new Item(100,20),
				new Item(120,30)
		};
		int capacity=50;
		double maxValue=getMaxValue(arr,capacity);
		System.out.println(maxValue);
	}

}
