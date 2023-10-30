package pattern_de_structuration.Adapter.example1.documenthtmlandPDF.code;

public class DocumentPDF implements Document {
	
	ComponentPDF outilPdf= new ComponentPDF();
	public int setContenu(int contenu) {
		contenu=outilPdf.pdfFixeContenu(8);
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
	
	int pdfRafraichir () {
		return outilPdf.pdfRafraichir();
		
	}
	
	int pdfTermineAffichage () {
		return outilPdf.pdfTermineAffichage();
		
	}

	int pdfEnvoieImprimante () {
		return outilPdf.pdfEnvoieImprimante();
		
	}


}
