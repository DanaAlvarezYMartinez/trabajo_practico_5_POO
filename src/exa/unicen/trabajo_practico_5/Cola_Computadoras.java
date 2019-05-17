package exa.unicen.trabajo_practico_5;

import java.util.Vector;

public class Cola_Computadoras extends Cola {

    public Cola_Computadoras() {
        super();
    }

    public void add(Object o) {
        Computadora c=(Computadora) o;
        int i=0;
        while ( (i<els.size()) && (((Computadora)els.elementAt(i)).getVelocidad()>c.getVelocidad()) ){
            i++;
        }
        els.insertElementAt(c,i);
    }

    public void removeComputer(){
        els.removeElementAt(0);
    }

    public Computadora onTop(){
        return (Computadora)els.elementAt(0);
    }

    public int cantComputers(){
        return els.size();
    }
}
