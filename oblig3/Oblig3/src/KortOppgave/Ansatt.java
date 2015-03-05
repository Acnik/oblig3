package KortOppgave;

import java.util.Calendar;
import java.util.GregorianCalendar;



// TODO: Auto-generated Javadoc
/**
 * The Class Ansatt.
 */
public class Ansatt extends Kort implements Fast{
	
	/**
	 * Instantiates a new ansatt.
	 */
	public Ansatt() {
		this("Udefinert fornavn", "Udefinert etternavn", 0000);
	}
	
	/**
	 * Instantiates a new ansatt.
	 *
	 * @param fornavn the fornavn
	 * @param etternavn the etternavn
	 * @param pin the pin
	 */
	public Ansatt(String fornavn, String etternavn, int pin) {
		super(fornavn, etternavn, pin);
		
	}
	
	/**
	 * Instantiates a new ansatt.
	 *
	 * @param navn the navn
	 * @param pin the pin
	 */
	public Ansatt(String navn,  int pin) {
		this("","",pin);
		this.settFulltNavn(navn);
		
	}

	/* (non-Javadoc)
	 * @see KortOppgave.Kort#SjekkPIN(int)
	 */
	@Override
	public boolean SjekkPIN(int pin) {
		if (sperret) {
			return false;
		}
		if ((new GregorianCalendar().get(Calendar.HOUR_OF_DAY) < 17)&&(new GregorianCalendar().get(Calendar.HOUR_OF_DAY)>7)) {
			return true;
		}
		if (pin != this.pin) {
			return false;
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see KortOppgave.Kort#settFornavn(java.lang.String)
	 */
	@Override
	public void settFornavn(String fornavn) {
		this.forNavn = fornavn;
		
	}
	
	/* (non-Javadoc)
	 * @see KortOppgave.Kort#hentFornavn()
	 */
	@Override
	public String hentFornavn() {
		return forNavn;
	}
	
	/* (non-Javadoc)
	 * @see KortOppgave.Kort#settEtternavn(java.lang.String)
	 */
	@Override
	public void settEtternavn(String etternavn) {
		this.etterNavn = etternavn;
	}
	
	/* (non-Javadoc)
	 * @see KortOppgave.Kort#hentEtterNavn()
	 */
	@Override
	public String hentEtterNavn() {
		return etterNavn;
	}
	
	/* (non-Javadoc)
	 * @see KortOppgave.Kort#settFulltNavn(java.lang.String)
	 */
	@Override
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
	@Override
	public String hentFulltNavn() {
		return (forNavn + " " + etterNavn);
	}
	
	/* (non-Javadoc)
	 * @see KortOppgave.Fast#beregnKreditt()
	 */
	@Override
	public double beregnKreditt() {
		System.err.println("Metoden beregnKreditt i Ansattklassen er ikke definert.");
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see KortOppgave.Fast#berengBonus()
	 */
	@Override
	public double berengBonus() {
		System.err.println("Metoden beregnBonus i Ansattklassen er ikke definert.");
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see KortOppgave.Kort#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + "Type: Ansatt.");
	}

	/* (non-Javadoc)
	 * @see KortOppgave.Kort#compareTo(KortOppgave.Kort)
	 */
	@Override
	public int compareTo(Kort k) {
		return super.compareTo(k);

	}

}
