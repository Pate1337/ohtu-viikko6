/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

import java.util.LinkedList;

/**
 *
 * @author paavo
 */
public class Pino {
     private LinkedList<Matcher> matchers;

    public Pino() {
        matchers = new LinkedList<Matcher>();
    }

    public void push(Matcher matcher){
        matchers.addFirst(matcher);
    }

    public Matcher pop(){
        return matchers.remove();
    }

    public boolean empty(){
        return matchers.isEmpty();
    }
}
