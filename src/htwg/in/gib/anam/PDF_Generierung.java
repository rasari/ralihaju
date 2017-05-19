package htwg.in.gib.anam;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class PDF_Generierung {

	String inhaltText = "";

	// @SuppressWarnings({ "resource" })
	// // static nicht möglich, da sonst getServletContext nicht geht
	// public PDF_Generierung(HttpServletRequest req, HttpServletResponse resp)
	// throws ServletException, IOException {
	//
	// String pdfFilename = "Anamnesebogen.pdf";
	// String contextPath = getServletContext().getRealPath(File.separator);
	// File pdfFile = new File(contextPath + pdfFilename);
	//
	// resp.setContentType("application/pdf");
	// resp.addHeader("Content-Disposition", "attachment; filename: " +
	// pdfFilename);
	// resp.setContentLength((int) pdfFile.length());
	//
	// FileInputStream fileInputStream = new FileInputStream(pdfFile);
	// OutputStream respOutputStream = resp.getOutputStream();
	// int bytes;
	// while ((bytes = fileInputStream.read()) != -1) {
	// respOutputStream.write(bytes);
	// }
	// }

	public PDF_Generierung(String inhaltText) {
		this.inhaltText = inhaltText;
		pdfGenerieren();

	}

	public void pdfGenerieren() {
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream("Anamnesebogen_Anaesthesie.pdf"));
		
		document.open();
		document.add(new Paragraph(inhaltText));
		document.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}

		// Meldung : Wollen Sie es ansehen ?
	}

}
