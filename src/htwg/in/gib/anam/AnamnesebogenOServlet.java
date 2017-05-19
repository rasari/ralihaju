package htwg.in.gib.anam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AnamnesebogenOServlet extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp){
	String vorname = req.getParameter("Vorname");
	String nachname = req.getParameter("Nachname");
	String geschlecht = req.getParameter("Geschlecht");
	String gebDat = req.getParameter("gebDat");
	String strasse = req.getParameter("Str");
	String plz = req.getParameter("PLZ");
	String ort = req.getParameter("Ort");
	String beruf = req.getParameter("Beruf");
	String datenschutz = req.getParameter("Datenschutz");
	String skala = req.getParameter("Skala");
	String zeitpunkt = req.getParameter("Zeitpunkt");
	String antwort008WennJa = req.getParameter("Antwort008 wenn ja");
	String frage010ProTag = req.getParameter("Frage010ProTag");
	String frage010ProWoche = req.getParameter("Frage010ProWoche");
	String frage010ProMonat = req.getParameter("Frage010ProMonat");
	String frage010ProJahr = req.getParameter("Frage010ProJahr");
	String medikament015 = req.getParameter("Medikament015");
	String operation015 = req.getParameter("Operation015");
	String infusion015 = req.getParameter("Infusion015");
	String einspritzungenSchmerzgebiet015 = req.getParameter("Einspritzungen ins Schmerzgebiet015");
	String nervenBlockade015 = req.getParameter("Nervenblockade015");
	String einspritzungenRueckenmark015 = req.getParameter("Einspritzungen Rückenmarksnah015");
	String systeme015 = req.getParameter("Rückenmarksnahe Sonden- oderPumpensysteme015");
	String kg015 = req.getParameter("Krankengymnastik015");
	String massage015 = req.getParameter("Massagen, Bäder, Kälte-,	Wärmebehandlungen015");
	String tens015 = req.getParameter("Elektr. Nervstimulation (TENS)015");
	String akupunktur015 = req.getParameter("Akupunktur015");
	String chiropraktik015 = req.getParameter("Chiropraktik015");
	String psych015 = req.getParameter("Psychotherapie015");
	String entspannungsv015 = req.getParameter("Entspannungsverfahren015");
	String hypnose015 = req.getParameter("Hypnose, Biofeedback015");
	String entzug015 = req.getParameter("Medikamentenentzug015");	
	String sonstiges015 = req.getParameter("Sonstiges015");
	String medikament01601 = req.getParameter("Medikament016-01");
	String medikament01602 = req.getParameter("Medikament016-02");
	String medikament01603 = req.getParameter("Medikament016-03");
	String medikament01604 = req.getParameter("Medikament016-04");
	String art01601 = req.getParameter("Art016-01");
	String art01602 = req.getParameter("Art016-02");
	String art01603 = req.getParameter("Art016-03");
	String art01604 = req.getParameter("Art016-04");
	String dosierung01601 = req.getParameter("Dosierung016-01");
	String dosierung01602 = req.getParameter("Dosierung016-02");
	String dosierung01603 = req.getParameter("Dosierung016-03");
	String dosierung01604 = req.getParameter("Dosierung016-04");
	String zeitraum01601 = req.getParameter("Zeitraum016-01");
	String zeitraum01602 = req.getParameter("Zeitraum016-02");
	String zeitraum01603 = req.getParameter("Zeitraum016-03");
	String zeitraum01604 = req.getParameter("Zeitraum016-04");
	String untersuchungWann = req.getParameter("UntersuchungWann");
	String untersuchungWo = req.getParameter("UntersuchungenWo");
	String untersuchungKoerperteil = req.getParameter("UntersuchungKörperteil");
	String roentgenWann = req.getParameter("RöntgenWann");
	String roentgenWo = req.getParameter("RöntgenWo");
	String roentgenKoerperteil = req.getParameter("RöntgenKörperteil");
	String ctWann = req.getParameter("CTWann");
	String ctWo = req.getParameter("CTWo");
	String ctKoerperteil = req.getParameter("CTKörperteil");
	String mrtWann = req.getParameter("MRTWann");
	String mrtWo = req.getParameter("MRTWo");
	String mrtKoerperteil = req.getParameter("MRTKörperteil");
	String sonoWann = req.getParameter("SonoWann");
	String sonoWo = req.getParameter("SonoWo");
	String sonoKoerperteil = req.getParameter("SonoKörperteil");
	String skelettszintigraphieWann = req.getParameter("SkelettszintigraphieWann");
	String skelettszintigraphieWo = req.getParameter("SkelettszintigraphieWo");
	String skelettszintigraphieKoerperteil = req.getParameter("SkelettszintigraphieKörperteil");
	String muskelUndNervenWann = req.getParameter("MuskelUndNervenWann");
	String muskelUndNervenWo = req.getParameter("MuskelUndNervenWo");
	String muskelUndNervenKoerperteil = req.getParameter("MuskelUndNervenKörperteil");
	String sonstigesWann = req.getParameter("SonstigesWann");
	String sonstigesWo = req.getParameter("SonstigesWo");
	String sonstigesKoerperteil = req.getParameter("SonstigesKörperteil");

	String frage019au = req.getParameter("Frage019-au");
	String frage019ewm = req.getParameter("Frage019-EWM");
	String frage019bg = req.getParameter("Frage019-BG");
	
	String uploadDatei001 = req.getParameter("uploadDatei001");
	String uploadDatei002 = req.getParameter("uploadDatei002");
	String uploadDatei003 = req.getParameter("uploadDatei003");
	String nachricht024 = req.getParameter("nachricht024");
	String datenschutzbestimmung = req.getParameter("datenschutzbestimmung");
	
	String antwort003 = req.getParameter("Antwort003");
	String antwort004 = req.getParameter("Antwort004");
	String antwort005 = req.getParameter("Antwort005");
	String antwort008 = req.getParameter("Antwort008");
	String antwort009 = req.getParameter("Antwort009");
	String antwort010 = req.getParameter("Antwort010");
	String antwort011 = req.getParameter("Antwort011");
	String antwort012 = req.getParameter("Antwort012");
	String antwort013 = req.getParameter("Antwort013");
	String antwort014 = req.getParameter("Antwort014");
	String antwort015 = req.getParameter("Antwort015");
	String antwort017 = req.getParameter("Antwort017");
	String antwort020 = req.getParameter("Antwort020");
	String antwort021 = req.getParameter("Antwort021");
	String antwort022 = req.getParameter("Antwort022");
	
	String frage008 = req.getParameter("Frage008");
	String frage009 = req.getParameter("Frage009");
	String frage014 = req.getParameter("Frage014");
	String frage017 = req.getParameter("Frage017");
	String frage020 = req.getParameter("Frage020");
	String frage021 = req.getParameter("Frage021");
	String frage022 = req.getParameter("Frage022");
	
	String antwort0191 = req.getParameter("Frage019-01");
	String antwort0192 = req.getParameter("Frage019-02");
	String antwort0193 = req.getParameter("Frage019-03");
	String antwort0194 = req.getParameter("Frage019-04");
	String antwort0195 = req.getParameter("Frage019-05");
	String antwort0196 = req.getParameter("Frage019-06");

	}
}
