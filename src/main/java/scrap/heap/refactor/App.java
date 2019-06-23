package scrap.heap.refactor;

public class App {
		
    public String getGreeting() {
        return "Hello world.";
    }

	public static void main(String[] args) throws Exception {
    	
		// Order 1
		OrderDetails orderDetails = new OrderDetails();
		orderDetails.addAvailableItem(new Balloons(BalloonColor.RED, BalloonMaterial.MYLAR, 4));
		orderDetails.addAvailableItem(new Cake(CakeFlavor.CHOCOLATE, CakeFrostingFlavor.CHOCOLATE, 
			 		CakeShape.CIRCLE, CakeSize.LARGE, CakeColor.BROWN));
		orderDetails.order();
		
		// Order 2
		OrderDetails orderDetails2 = new OrderDetails();
		orderDetails2.addAvailableItem(new Balloons(BalloonColor.BLUE, BalloonMaterial.LATEX, 7));
		orderDetails2.addAvailableItem(new Cake(CakeFlavor.CHOCOLATE, CakeFrostingFlavor.CHOCOLATE, 
	 			 		CakeShape.CIRCLE, CakeSize.LARGE, CakeColor.BROWN));
		orderDetails2.order();
		
		// Order 3
		OrderDetails orderDetails3 = new OrderDetails();
		orderDetails3.addAvailableItem(new Balloons(BalloonColor.YELLOw, BalloonMaterial.MYLAR, 4));
		orderDetails3.addAvailableItem(new Cake(CakeFlavor.VANILLA, CakeFrostingFlavor.VANILLA, 
	 			 		CakeShape.SQUARE, CakeSize.SMALL, CakeColor.YELLOW));
		orderDetails3.order();
    }
}
