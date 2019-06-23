package scrap.heap.refactor;

public class Balloons implements AvailableItem {
	
	BalloonColor color;
	BalloonMaterial material;
	int number;
	
	public Balloons(BalloonColor color, BalloonMaterial material, int number) {
		this.color = color;
		this.material = material;
		this.number = number;
	}
	
	public void order() {
		System.out.println("Balloons ordered; " + color + ", " + material  + ", " + number);
	}
	
}
