package KortOppgave;
import java.util.ArrayList;
import java.util.Collections;

public class KortTest {

    public static void main(String[] args) {
        
        ArrayList<Kort> reg = new ArrayList<Kort>();
        
        Kort k1 = new Ansatt("Ole Olsen", 1234);
        Kort k2 = new Gjest("Marit Olsen");
        reg.add(k1);
        reg.add(k2);

        for (int i=0; i<reg.size(); i++) {
            Kort kort = (Kort)reg.get(i);
            System.out.print(kort);
            System.out.println("\nTest av kort: med kode 1234 er" + (kort.SjekkPIN(1234) ?  " gyldig" :  " ugyldig" ) );
            System.out.println("\nTest av kort: med kode 9999 er" + (kort.SjekkPIN(9999) ?  " gyldig" :  " ugyldig" ) );
        }
        
        
        Kort k3 = new Ansatt("Test testesen testlos trol", 4561);
        reg.add(k3);
        System.out.println(String.format("Sammenligne :\n %s \n med \n %s \n får da: %d", k1, k3, k1.compareTo(k3)));
        Kort k4 = new Gjest("Wilhelm grøtvold hemsedal");
        System.out.println(k4 + "\n\n\n\n");
        
        for (int i = 0; i < reg.size(); i++) {
			System.out.println(reg.get(i) + "\n");
		}
        System.out.println("sorterer....\n");
        Collections.sort(reg);
        for (int i = 0; i < reg.size(); i++) {
			System.out.println(reg.get(i) + "\n");
		}
    }
}