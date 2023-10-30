package pattern_de_structuration.Adapter.example1.documenthtmlandPDF.code;

public class ComponentPDF {
	
	int pdfFixeContenu(int contenu) {
		return contenu;
	}
	
	int pdfPrepareAffichage () {
		int contenu=9;
		return contenu;
	}
	
	int pdfRafraichir () {
		int pdf=5;
		return pdf;
		
	}
	
	int pdfTermineAffichage () {
		int pdf=5;
		return pdf;
		
	}

	int pdfEnvoieImprimante () {
		int pdf=5;
		return pdf;
		
	}
	

}
