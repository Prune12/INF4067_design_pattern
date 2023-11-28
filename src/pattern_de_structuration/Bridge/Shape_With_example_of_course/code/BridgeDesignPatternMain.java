package pattern_de_structuration.Bridge.Shape_With_example_of_course.code;

public class BridgeDesignPatternMain {

	public static void main(String[] args) {
		//forme du rectangle avec la couleur rouge
		Shape s1=new Rectangle(new RedColor());
		s1.colorIt();
		//forme du cercle avec la couleur bleu
		Shape s2=new Circle(new BlueColor());
		s2.colorIt();
		

	}

}
