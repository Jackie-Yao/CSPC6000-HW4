package HW4_Iterator;

public class InteratorTest {

	public static void main(String[] args) {

		FoodBox foodbox = new FoodBox();
		Iterator iter = foodbox.createIterator();
		
		while(iter.hasNext()) {
			GroceryItem item =  (GroceryItem)iter.next();
			item.PrintItem();
		}
	}

}
