package datastructures.searchingAlgorithms;

public class LinearProductSearchDemo {

	public static Product linearSearchById(Product[] products,int id) {
		for(Product product:products) {
			if(product.getId()==id)
				return product;
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		Product[] products= {
				new Product(1,"Laptop",99000.00),
				new Product(2,"Desktop",44000.00),
				new Product(3,"Tab",18000.00),
				new Product(4,"SmartTv",59000.00),
				new Product(5,"Speakers",9000.00),
		};
		
				int searchid=3;
				Product result=linearSearchById(products,searchid);
				if(result!=null) {
					System.out.println("Product found: "+result);					
				}
				else {
					System.out.println("Product with id"+searchid+"not found");
				}
	}

}
