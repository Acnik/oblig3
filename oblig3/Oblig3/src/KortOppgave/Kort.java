package KortOppgave;

// TODO: Auto-generated Javadoc
/**
 * Kort klassen.
 */
public abstract class Kort implements Comparable<Kort>{

	/** fornavnet til korteier. */
	String forNavn;

	/** etternavnet til korteier. */
	String etterNavn;

	/** pinkode. */
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
	 * @param navn
	 *            the navn
	 * @param pin
	 *            the pin
	 */
	public Kort(String navn,  int pin) {
		this("","",pin);
		this.settFulltNavn(navn);
		
	}

	/**
	 * Instantiates a new kort.
	 *
	 * @param fornavn
	 *            the fornavn
	 * @param etternavn
	 *            the etternavn
	 * @param pin
	 *            the pin
	 */
	public Kort(String fornavn, String etternavn, int pin) {
		this.forNavn = fornavn;
		this.etterNavn = etternavn;
		this.pin = pin;
		this.sperret = false;
		// this.kortNummer = //nåkka lurt

	}

	/**
	 * Sjekk pin.
	 *
	 * @param pin
	 *            the pin
	 * @return true, if successful
	 */
	public abstract boolean SjekkPIN(int pin);

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"Navn: %s %s. Pin: %d . Kortnummer: %d . Sperret: %s ",
				forNavn, etterNavn, pin, kortNummer, (sperret ? "Ja" : "Nei"));
	}

	/**
	 * Sets the t fornavn.
	 *
	 * @param fornavn
	 *            the new t fornavn
	 */
	public void settFornavn(String fornavn) {
		this.forNavn = fornavn;

	}

	/**
	 * Hent fornavn.
	 *
	 * @return the string
	 */
	public String hentFornavn() {
		return forNavn;
	}

	/**
	 * Sets the t etternavn.
	 *
	 * @param etternavn
	 *            the new t etternavn
	 */
	public void settEtternavn(String etternavn) {
		this.etterNavn = etternavn;
	}

	/**
	 * Hent etter navn.
	 *
	 * @return the string
	 */
	public String hentEtterNavn() {
		return etterNavn;
	}

	/**
	 * Deler opp en lang string og setter de første halvparten av navnene som
	 * fornavn om den andre halvparten som etternavn.
	 *
	 * @param Fullt
	 *            navn der navn skilles med mellomrom.
	 */
	public void settFulltNavn(String navn) {
		String[] navnArr = navn.split(" ");
		int halvNavnArr = navnArr.length / 2;
		for (int i = 0; i < navnArr.length; i++) {
			if (i < halvNavnArr) {
				forNavn += (navnArr[i] +" ");
			} else {
				etterNavn += (navnArr[i] +" ");
			}

		}
	}

	/**
	 * Hent fullt navn.
	 *
	 * @return the string
	 */
	public String hentFulltNavn() {
		return (forNavn + " " + etterNavn);
	}

	/**
	 * Compare.
	 *
	 * @param temp
	 *            , Kort objektet du skal sammenligne kortet ditt med.
	 * @return Returns 0 om navnene til kortholderne er lik. Returnerer et tall
	 *         som er mindre enn 0 om objektet ligger over argumentet
	 *         alfabetisk. Returnerer et negativt tall om argumentet er over
	 *         objektet alfabetisk.
	 */
	public int compareTo(Kort k) {
		if (hentEtterNavn().compareTo(k.hentEtterNavn()) == 0) {
			if (hentFornavn().compareTo(k.hentFornavn()) == 0) {
				return 0;
			}
			return hentFornavn().compareTo(k.hentFornavn());
		}

		return hentEtterNavn().compareTo(k.hentEtterNavn());

	}
}
