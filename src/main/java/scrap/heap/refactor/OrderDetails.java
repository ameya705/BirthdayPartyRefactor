package scrap.heap.refactor;

import java.util.ArrayList;
import java.util.List;

public class OrderDetails {
	
	List<AvailableItem> availableItems = new ArrayList<AvailableItem>();
	
	public OrderDetails() {
		
	}
	
	public void addAvailableItem(AvailableItem item) {
		availableItems.add(item);
	}
	
	public void order() {
		for (AvailableItem item : availableItems) {
			item.order();
		}
	}
}
