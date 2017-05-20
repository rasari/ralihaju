package htwg.in.gib.anam;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class PDF_Generierung {

	String inhaltText = "";
	OutputStream resp;

	public PDF_Generierung(String inhaltText, OutputStream resp) {
		this.inhaltText = inhaltText;
		this.resp = resp;
		// pdfGenerieren();

	}

	public void pdfGenerieren(String inhaltText, OutputStream resp) {
		this.resp = resp;
		Document document = new Document();

		try {
			PdfWriter.getInstance(document, resp);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		document.open();
		// System.out.println(document);
		try {
			document.add(new Paragraph(this.inhaltText));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		document.close();

		// Meldung : Wollen Sie es ansehen ?

		// public static void main(String[] args) {
		//
		// PDF_Generierung pdf = new PDF_Generierung("Hallo Aybars, was geht
		// broo");
		// pdf.pdfGenerieren("Hallo Aybars, was geht broo");
		//
	}

}
