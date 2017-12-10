/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paavo
 */
public class QueryBuilder {
    private List<Matcher> matchers;
    
    public QueryBuilder() {
        this.matchers = new ArrayList<>();
    }
    
    public QueryBuilder playsIn(String team) {
        this.matchers.add(new PlaysIn(team));
        return this;
    }
    
    public QueryBuilder hasAtLeast(int value, String category) {
        this.matchers.add(new HasAtLeast(value, category));
        return this;
    }
    
    public QueryBuilder hasFewerThan(int value, String category) {
        this.matchers.add(new HasFewerThan(value, category));
        return this;
    }
    
    public QueryBuilder oneOf(Matcher m1, Matcher m2) {
        this.matchers.add(new Or(m1, m2));
        return this;
    }
    
    public Matcher build() {
        Matcher[] taulukko = new Matcher[this.matchers.size()];
        int i = 0;
        for (Matcher m: this.matchers) {
            taulukko[i] = m;
            i++;
        }
        this.matchers = new ArrayList<>();
        return new And(taulukko);
    }
    
}
