package scrap.heap.refactor;

public enum BalloonMaterial {
	LATEX,
	MYLAR;
	
	@Override
	public String toString() {
		return this.name().toLowerCase();
	}
}
