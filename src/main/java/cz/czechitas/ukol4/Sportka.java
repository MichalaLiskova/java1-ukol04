package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Třída pro losování Sportky.
 */
public class Sportka {
    private final List<Integer> osudi = new ArrayList<>();

    public Sportka() {
        //naplnit osudí čísly 1 až 49.
      /*  Integer cislo = 1 ;
        while (cislo < 50) {
            osudi.add(cislo);
            cislo++;
        } */
        for (int cislo = 1; cislo < 50; cislo++) {  //bezne se pouziva u metody fori "i(=index)", ale nyni jsem si vyrobila instanci "cislo", abych to lepe videla
            osudi.add(cislo);
        }
    }

    /**
     * Zamíchá osudí.
     *
     * @see Collections#shuffle(List)
     */
    public void zamichej() {
        // zamíchat osudí
        Collections.shuffle(osudi);
    }

    /**
     * Vrátí seznam s 6 vylosovanými čísly.
     *
     * @return Seznam vylosovaných čísel.
     * @see List#subList(int, int)
     */
    public List<Integer> dejVylosovanaCisla() {
        //Vrátit seznam prvních 6 čísel z osudí.
        return osudi.subList(0, 6);
    }

    /**
     * Vrátí sedmé vylosované číslo (dodatkové číslo)
     *
     * @return Dodatkové číslo.
     */
    public Integer dejDodatkoveCislo() {
        //Vrátit sedmé číslo z osudí.
        return osudi.get(6);
    }
}
