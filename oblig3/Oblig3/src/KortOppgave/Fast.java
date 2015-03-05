package KortOppgave;
//Interface som brukest i alle fast-ansatte og fremtidige ansatt-klasser.
public interface Fast {
public void settFornavn(String fornavn);
public String hentFornavn();
public void settEtternavn(String etternavn);
public String hentEtterNavn();
public void settFulltNavn(String navn);
public String hentFulltNavn();
public double beregnKreditt();
public double berengBonus();
}
