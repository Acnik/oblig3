package KortOppgave;

// TODO: Auto-generated Javadoc
/**
 * Kort klassen
 */
public abstract class Kort {
	
	/** fornavnet til korteier */
	String forNavn;
	
	/** etternavnet til korteier */
	String etterNavn;
	
	/** pinkode */
	int pin;
	
	/** The kort nummer. */
	int kortNummer;
	
	/** booleansk verdi etter om kortet er sperret eller ikke. */
	boolean sperret;
	
	/**
	 * Initialiserer et nytt kort.
	 */
	public Kort() {
		this("Udefinert fornavn", "Udefinert etternavn", 0000);
		
	}


	/**
	 * Instantiates a new kort.
	 *
	 * @param fornavnet til korteieren
	 * @param etternavnet til korteieren
	 * @param pinkoden til kortet
	 */
	public Kort(String fornavn, String etternavn, int pin) {
		this.forNavn = fornavn;
		this.etterNavn = etternavn;
		this.pin = pin;
		this.sperret = false;
		//this.kortNummer = //nåkka lurt
		
	}
	public abstract boolean SjekkPIN(int pin);
	@Override
	public String toString() {
		return String.format("Navn: %s %s. Pin: %d . Kortnummer: %d . Sperret: %s", forNavn, etterNavn, pin, kortNummer, (sperret? "Ja":"Nei") );
	}
}
