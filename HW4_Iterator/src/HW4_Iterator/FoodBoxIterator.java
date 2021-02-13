package HW4_Iterator;

public class FoodBoxIterator implements Iterator{
	GroceryItem[] items;
	int position = 0;
	
	public FoodBoxIterator(GroceryItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Object next() {
		GroceryItem groceryitem = items[position];
		position += 1;
		return groceryitem;
	}

}
