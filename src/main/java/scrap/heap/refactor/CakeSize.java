package scrap.heap.refactor;

public enum CakeSize {
	LARGE,
	MEDIUM,
	SMALL;
	
	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
}
