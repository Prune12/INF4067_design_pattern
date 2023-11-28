package pattern_de_structuration.Bridge.Three_Shape_With_two_color.code;

public class Circle extends Shape{
	
		Circle(Color color) {
		super(color);
		}
		
		public void colorIt() {
		System.out.print("Circle filled with ");
		color.fillColor();
		}
}
