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
public class Summa implements Komento {
    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private String edellinenSyotekentta;

    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        sovellus.plus(Integer.parseInt(syotekentta.getText()));
        tuloskentta.setText(String.valueOf(sovellus.tulos()));
        this.edellinenSyotekentta = syotekentta.getText();
    }

    @Override
    public void peru() {
        sovellus.miinus(Integer.parseInt(edellinenSyotekentta));
        tuloskentta.setText(String.valueOf(sovellus.tulos()));
    }
    
}
