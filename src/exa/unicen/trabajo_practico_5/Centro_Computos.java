package exa.unicen.trabajo_practico_5;

public class Centro_Computos {

    private Cola_Computadoras computadoras;
    private Cola_Procesos procesos;

    public Centro_Computos(Cola_Computadoras computadoras, Cola_Procesos procesos) {
        this.computadoras = computadoras;
        this.procesos = procesos;
    }

    public void addProcess(Object p){
        procesos.add(p);
    }

    public void addComputer(Object c){
        computadoras.add(c);
    }

    public void runProcess(){
        computadoras.removeComputer();
        procesos.removeProcess();
    }

}

