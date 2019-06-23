package scrap.heap.refactor;

public enum CakeShape {
	CIRCLE,
	SQUARE;
	
	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
}
