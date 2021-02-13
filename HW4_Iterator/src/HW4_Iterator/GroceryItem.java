package HW4_Iterator;

public class GroceryItem {
	String name;
	double weight;
	
	public GroceryItem(String name, double weight) {
		this.name = name;
		this.weight= weight;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void PrintItem() {
		System.out.print(this.getName() + ",");
		System.out.print(this.getWeight() + "kg");
		System.out.println();
	}
}
