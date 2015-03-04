package KortOppgave;


import java.util.Calendar;
import java.util.GregorianCalendar;


// TODO: Auto-generated Javadoc
/**
 * The Class Gjest.
 */
public class Gjest extends Kort {
	
	/** The utstedt dato. */
	GregorianCalendar utstedtDato;
	
	/**
	 * Instantiates a new gjest.
	 */
	public Gjest() {
		this("Udefinert fornavn", "Udefinert etternavn");
	}
	
	/**
	 * Instantiates a new gjest.
	 *
	 * @param fornavn the fornavn
	 * @param etternavn the etternavn
	 */
	public Gjest(String fornavn, String etternavn) {
		super(fornavn, etternavn, 9999);
		this.utstedtDato = new GregorianCalendar();
	}
	
	/**
	 * Instantiates a new gjest.
	 *
	 * @param navn the navn
	 */
	public Gjest(String navn) {
		super(navn, 9999);
		this.utstedtDato = new GregorianCalendar();
	}
	

	/* (non-Javadoc)
	 * @see KortOppgave.Kort#SjekkPIN(int)
	 */
	@Override
	public boolean SjekkPIN(int pin) {
		
		if (sperret) {
			return false;
		}

		if (pin != this.pin) {
			return false;
		}
		GregorianCalendar temp = (GregorianCalendar) utstedtDato.clone();
		temp.add(Calendar.DAY_OF_MONTH, 7);
		if (temp.compareTo(new GregorianCalendar())<0) {
			sperret = true;
			return false;
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see KortOppgave.Kort#settFornavn(java.lang.String)
	 */
	public void settFornavn(String fornavn) {
		this.forNavn = fornavn;
		
	}
	
	/* (non-Javadoc)
	 * @see KortOppgave.Kort#hentFornavn()
	 */
	public String hentFornavn() {
		return forNavn;
	}
	
	/* (non-Javadoc)
	 * @see KortOppgave.Kort#settEtternavn(java.lang.String)
	 */
	public void settEtternavn(String etternavn) {
		this.etterNavn = etternavn;
	}
	
	/* (non-Javadoc)
	 * @see KortOppgave.Kort#hentEtterNavn()
	 */
	public String hentEtterNavn() {
		return etterNavn;
	}
	
	/* (non-Javadoc)
	 * @see KortOppgave.Kort#settFulltNavn(java.lang.String)
	 */
	public void settFulltNavn(String navn) {
		String[] navnArr = navn.split(" ");
		int halvNavnArr = navnArr.length/2;
		for (int i = 0; i < navnArr.length; i++) {
			if (i<halvNavnArr) {
				forNavn += (navnArr[i] +" ");
			}else {
				etterNavn += (navnArr[i] +" ");
			}
			
		}
	}
	
	/* (non-Javadoc)
	 * @see KortOppgave.Kort#hentFulltNavn()
	 */
	public String hentFulltNavn() {
		return (forNavn + " " + etterNavn);
	}
	
	/* (non-Javadoc)
	 * @see KortOppgave.Kort#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + "Type: Gjest.");
	}
	
	/* (non-Javadoc)
	 * @see KortOppgave.Kort#compareTo(KortOppgave.Kort)
	 */
	@Override
	public int compareTo(Kort k) {
		return super.compareTo(k);
	}

}