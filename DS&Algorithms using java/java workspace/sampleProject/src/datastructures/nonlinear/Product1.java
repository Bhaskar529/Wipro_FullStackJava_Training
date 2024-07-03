package datastructures.nonlinear;

public class Product1 {
	private String name;
	private Product end;
	
	
	
	
	public Product1(String name, Product end) {
		super();
		this.name = name;
		this.end = end;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product getEnd() {
		return end;
	}
	public void setEnd(Product end) {
		this.end = end;
	}
	
	
}
