package htwg.in.gib.anam;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class PDF_Generierung {

	String inhaltText = "";

	public PDF_Generierung(String inhaltText) {
		this.inhaltText = inhaltText;
		pdfGenerieren();

	}

	public void pdfGenerieren() {
		Document document = new Document();
		try {
			//
			File file = new File(inhaltText);
			// So heißt die File
			FileOutputStream out = new FileOutputStream("C:/Users/Jülide/Desktop/" + file + ".pdf");
			PdfWriter.getInstance(document, out);

			document.open();
			document.add(new Paragraph(inhaltText));
			document.close();
			try {
//				
				// hier gibt man den Pfad ein, in dem sich eine PDF befindet,
				// genau die wird dann geöffnet -> Pfad bis .pdf
				Desktop.getDesktop().open(new File("C:/Users/Jülide/Desktop/" + file + ".pdf"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}

		// Meldung : Wollen Sie es ansehen ?
	}
	
	public static void main(String[] args) {
		
		PDF_Generierung pdf = new PDF_Generierung("vorname nachname");
		pdf.
		System.out.println(pdf);
		
	}

}
