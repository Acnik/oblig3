package KortOppgave;


import java.util.Calendar;
import java.util.GregorianCalendar;


public class Gjest extends Kort {
	GregorianCalendar utstedtDato;
	public Gjest() {
		this("Udefinert fornavn", "Udefinert etternavn");
	}
	public Gjest(String fornavn, String etternavn) {
		super(fornavn, etternavn, 9999);
		this.utstedtDato = new GregorianCalendar();
	}

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
			return false;
		}
		return true;
	}

}