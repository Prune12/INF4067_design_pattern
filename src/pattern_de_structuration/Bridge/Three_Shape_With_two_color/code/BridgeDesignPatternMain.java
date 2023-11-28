package pattern_de_structuration.Bridge.Three_Shape_With_two_color.code;

public class BridgeDesignPatternMain {

	public static void main(String[] args) {
		//forme du rectangle avec la couleur rouge
		Shape s1=new Rectangle(new RedColor());
		s1.colorIt();
		
		//forme du cercle avec la couleur bleu
		Shape s2=new Circle(new BlueColor());
		s2.colorIt();
		
		//forme du triangle de couleur bleu
		Shape s3=new Triangle(new BlueColor());
		s3.colorIt();
		//forme du triangle de couleur rouge
		Shape s4=new Triangle(new RedColor());
		s4.colorIt();

	}

}
