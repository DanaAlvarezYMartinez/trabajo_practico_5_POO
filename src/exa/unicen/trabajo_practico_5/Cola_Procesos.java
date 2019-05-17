package exa.unicen.trabajo_practico_5;

import java.util.Vector;

public class Cola_Procesos extends Cola {

    public Cola_Procesos() {
        super();
    }

    public void add(Object o) {
        Proceso p=(Proceso)o;
        int i=0;
        while ( (i<els.size()) && (((Proceso)els.elementAt(i)).getMemoria()>p.getMemoria()) ){
            i++;
        }
        els.insertElementAt(p,i);
    }

    public void removeProcess(){
        els.removeElementAt(0);
    }
}

