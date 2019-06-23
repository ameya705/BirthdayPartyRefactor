package scrap.heap.refactor;

public class Cake implements AvailableItem {
	
	CakeFlavor flavor;
	CakeFrostingFlavor frostingFlavor;
	CakeShape shape;
	CakeSize size;
	CakeColor color;
	
	public Cake(CakeFlavor flavor, CakeFrostingFlavor frostingFlavor, CakeShape shape, CakeSize size, CakeColor color) {
		this.flavor = flavor;
		this.frostingFlavor = frostingFlavor;
		this.shape = shape;
		this.size = size;
		this.color = color;
	}
	
	public void order() {
		System.out.println("cake ordered; " + flavor + ", " + frostingFlavor  + ", " + shape + ", " + size + ", " + color);
	}
	
	
}
