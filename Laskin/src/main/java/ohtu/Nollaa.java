/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author paavo
 */
public class Nollaa implements Komento {
    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private String edellinenTuloskentta;

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        this.sovellus.nollaa();
        this.edellinenTuloskentta = tuloskentta.getText();
        tuloskentta.setText(String.valueOf(sovellus.tulos()));
    }

    @Override
    public void peru() {
        sovellus.plus(Integer.parseInt(edellinenTuloskentta));
        tuloskentta.setText(String.valueOf(sovellus.tulos()));
    }
    
}
