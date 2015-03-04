package KortOppgave;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Ansatt extends Kort {
	public Ansatt() {
		this("Udefinert fornavn", "Udefinert etternavn", 0000);
	}
	public Ansatt(String fornavn, String etternavn, int pin) {
		super(fornavn, etternavn, pin);
		
	}

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

}
