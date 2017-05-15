package htwg.in.gib.anam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class PDF_Generierung extends HttpServlet  {

	@SuppressWarnings({ "resource" })
	// static nicht möglich, da sonst getServletContext nicht geht
	public PDF_Generierung(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String pdfFilename = "Anamnesebogen.pdf";
		String contextPath = getServletContext().getRealPath(File.separator);
		File pdfFile = new File(contextPath + pdfFilename);

		resp.setContentType("application/pdf");
		resp.addHeader("Content-Disposition", "attachment; filename: " + pdfFilename);
		resp.setContentLength((int) pdfFile.length());

		FileInputStream fileInputStream = new FileInputStream(pdfFile);
		OutputStream respOutputStream = resp.getOutputStream();
		int bytes;
		while ((bytes = fileInputStream.read()) != -1) {
			respOutputStream.write(bytes);
		}
	}

}
