package pattern_de_structuration.Bridge.Shape_With_example_of_course.code;

public abstract class Shape {
Color color;
Shape(Color color)
{
this.color=color;
}
abstract public void colorIt();
}
