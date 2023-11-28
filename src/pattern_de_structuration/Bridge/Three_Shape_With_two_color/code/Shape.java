package pattern_de_structuration.Bridge.Three_Shape_With_two_color.code;

public abstract class Shape {
Color color;
Shape(Color color)
{
this.color=color;
}
abstract public void colorIt();
}
