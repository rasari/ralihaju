package htwg.in.gib.anam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AnamnesebogenOServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp){
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
	}
}
