package scrap.heap.refactor;

public enum BalloonColor {
	RED,
	BLUE,
	YELLOw;
	
	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
}
