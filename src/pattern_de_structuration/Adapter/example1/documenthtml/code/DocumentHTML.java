package pattern_de_structuration.Adapter.example1.documenthtml.code;

public class DocumentHTML implements Document {
	
	public int setContenu(int contenu) {
		contenu=8;
		return contenu;
	}
	
	public int imprime() {
		int Imp= setContenu(8);
		return Imp;
	}
	
	public int dessine() {
		int Imp= setContenu(8);
		return Imp;
	}

}
