package scrap.heap.refactor;

public enum CakeFlavor {
	CHOCOLATE,
	VANILLA;
	
	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
}
