package htwg.in.gib.anam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AnamnesebogenAServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		String vorname = req.getParameter("Vorname");
		String nachname = req.getParameter("Nachname");
		String antwortGeschlecht = req.getParameter("Antwort");
		String gebDat = req.getParameter("gebDat");
		String strasse = req.getParameter("Str");
		String plz = req.getParameter("PLZ");
		String ort = req.getParameter("Ort");
		String beruf = req.getParameter("Beruf");
		String datenschutz = req.getParameter("Datenschutz");
		String antwort000 = req.getParameter("Antwort000");
		String antwort001 = req.getParameter("Antwort001");
		String antwort002 = req.getParameter("Antwort002");
		String antwort003 = req.getParameter("Antwort003");
		String antwort004 = req.getParameter("Antwort004");
		String antwort005 = req.getParameter("Antwort005");
		String antwort006 = req.getParameter("Antwort006");
		String antwort007 = req.getParameter("Antwort007");
		String antwort008 = req.getParameter("Antwort008");
		String antwort009 = req.getParameter("Antwort009");
		String antwort010 = req.getParameter("Antwort010");
		String antwort011 = req.getParameter("Antwort011");
		String antwort012 = req.getParameter("Antwort012");
		String antwort013 = req.getParameter("Antwort013");
		String antwort014 = req.getParameter("Antwort014");
		String antwort015 = req.getParameter("Antwort015");
		String antwort016 = req.getParameter("Antwort016");
		String antwort017 = req.getParameter("Antwort017");
		String antwort018 = req.getParameter("Antwort018");
		String antwort019 = req.getParameter("Antwort019");
		String antwort020 = req.getParameter("Antwort020");
		String antwort021 = req.getParameter("Antwort021");
		String antwort022 = req.getParameter("Antwort022");
		String antwort023 = req.getParameter("Antwort023");
		String frage000 = req.getParameter("Frage000");
		String frage001 = req.getParameter("Frage001");
		String frage002 = req.getParameter("Frage002");
		String frage003 = req.getParameter("Frage003");
		String frage004 = req.getParameter("Frage004");
		String frage005 = req.getParameter("Frage005");
		String frage006 = req.getParameter("Frage006");
		String frage007 = req.getParameter("Frage007");
		String frage008 = req.getParameter("Frage008");
		String frage009 = req.getParameter("Frage009");
		String frage010 = req.getParameter("Frage010");
		String frage011 = req.getParameter("Frage011");
		String frage012 = req.getParameter("Frage012");
		String frage013 = req.getParameter("Frage013");
		String frage014 = req.getParameter("Frage014");
		String frage015 = req.getParameter("Frage015");
		String frage016 = req.getParameter("Frage016");
		String frage017 = req.getParameter("Frage017");
		String frage018 = req.getParameter("Frage018");
		String nachricht000 = req.getParameter("Nachricht00");
		String nachricht001 = req.getParameter("Nachricht01");
		String nachricht002 = req.getParameter("Nachricht02");
		String nachricht003 = req.getParameter("Nachricht03");

		resp.setContentType("text/html");
		String htmlResp = "<html>";
		htmlResp += "<head> </head>";
		htmlResp += "<body>";
		htmlResp += "<h2> Vorname des Patienten: " + vorname;
		htmlResp += "<h2> Nachname des Patienten: " + nachname;
		htmlResp += "<h2> Geschlecht des Patienten: " + antwortGeschlecht;
		htmlResp += "<h2> Geburtsdatum des Patienten: " + gebDat;
		htmlResp += "</body>";
		htmlResp += "</html>";
		PrintWriter writer = resp.getWriter();

		writer.println(htmlResp);
	}

}
