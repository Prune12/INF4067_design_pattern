package pattern_de_structuration.Adapter.example3.code;

public class Rectangle {
	private float longueur;
	private float largeur;
	
	public float perimetre() {
		return 2*(longueur+largeur);
	}
	
	public float aire() {
		return longueur*largeur;
	}

	public float getLongueur() {
		return longueur;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}

	public float getLargeur() {
		return largeur;
	}

	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}

	
}
