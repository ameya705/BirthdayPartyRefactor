package scrap.heap.refactor;

public enum CakeColor {
	BROWN,
	YELLOW;
	
	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
}
