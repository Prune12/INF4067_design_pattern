package pattern_de_structuration.Bridge.Shape_With_example_of_course.code;

public class Rectangle extends Shape{
Rectangle(Color color) {
super(color);
}
public void colorIt() {
System.out.print("Rectangle filled with ");
color.fillColor();
}
}
