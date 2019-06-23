package scrap.heap.refactor;

public enum CakeFrostingFlavor {
	CHOCOLATE,
	VANILLA;
	
	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
}
