package pattern_de_structuration.Bridge.code;

public abstract class Shape {
Color color;
Shape(Color color)
{
this.color=color;
}
abstract public void colorIt();
}
