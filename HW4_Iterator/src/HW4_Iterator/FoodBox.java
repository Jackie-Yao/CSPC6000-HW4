package HW4_Iterator;

public class FoodBox {
	GroceryItem[] groceryitems = new GroceryItem[3];
	int index = 0;
	
	public FoodBox() {
		this.groceryitems[0] = new GroceryItem("Milk", 2);
		this.groceryitems[1] = new GroceryItem("Bread", 0.5);
		this.groceryitems[2] = new GroceryItem("Apples", 3);
	}
	
	public Iterator createIterator() {
		return new FoodBoxIterator(groceryitems);
	}
}
