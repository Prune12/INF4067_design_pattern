package pattern_de_structuration.Bridge.Three_Shape_With_two_color.code;

public class Triangle extends Shape{
	
	Triangle(Color color) {
	super(color);
	}
	
	public void colorIt() {
	System.out.print("Triangle filled with ");
	color.fillColor();
	}
}