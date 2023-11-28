package pattern_de_structuration.Bridge.Three_Shape_With_Three_color.code;

public class Rectangle extends Shape{
Rectangle(Color color) {
super(color);
}
public void colorIt() {
System.out.print("Rectangle filled with ");
color.fillColor();
}
}
