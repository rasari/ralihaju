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
	File file;
	
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		file = new File("Bogen.pdf");
		this.file = file;
	}

	// private static final String System = null;
	String inhaltText = "";

	public PDF_Generierung() {
//		this.inhaltText = inhaltText;
		// pdfGenerieren();

	}


	public void pdfGenerieren(String inhaltText) {
		Document document = new Document();
		try {
			//

			file = new File("Bogen.pdf");
			// FileOutputStream: "AnamneseBogen.pdf"
			FileOutputStream out = new FileOutputStream(file);

			PdfWriter.getInstance(document, out);

			document.open();
//			System.out.println(document);
			document.add(new Paragraph(this.inhaltText));

			document.close();
			try {
				//
				// hier gibt man den Pfad ein, in dem sich eine PDF befindet,
				// genau die wird dann auf dem Desktop geöffnet -> Pfad bis .pdf
				Desktop.getDesktop().open(file);
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

	// public static void main(String[] args) {
	//
	// PDF_Generierung pdf = new PDF_Generierung("vorname nachname");
	// pdf.pdfGenerieren("vorname nachname");
	//
	// }

}
