package pattern_de_structuration.Adapter.example3.code;

public class AdaptRectangle implements Icarre{
	
	Rectangle rectangle=new Rectangle();
	public AdaptRectangle() {
		
	}
	
public AdaptRectangle(float cote) {
	rectangle.setLargeur(cote);
	rectangle.setLongueur(cote);
		
	}

public float perimetre() {
	return rectangle.perimetre();
}

public float aire() {
	return rectangle.aire();
}
	

}
