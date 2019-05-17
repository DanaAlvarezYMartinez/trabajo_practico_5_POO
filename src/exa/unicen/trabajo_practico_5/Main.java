package exa.unicen.trabajo_practico_5;

public class Main {
    public static void main (String[] args) {


        Cola_Procesos colita = new Cola_Procesos(); //creo cola de procesos
        Cola_Computadoras potito = new Cola_Computadoras(); //creo cola de computadoras

        Proceso p1 = new Proceso("aprender objetos", 25, 10);
        Proceso p2 = new Proceso("aprender arqui", 23, 8);
        colita.add(p1); //añado proceso 1
        colita.add(p2); //añado proceso 2

        Computadora pc1 = new Computadora("pc1", 2);
        Computadora pc2 = new Computadora("pc2", 8);
        potito.add(pc1);
        potito.add(pc2);

        System.out.println(potito.cantComputers());
        Centro_Computos center = new Centro_Computos(potito, colita);

        Computadora pc3 = new Computadora("pc3", 5);
        center.addComputer(pc3);

        System.out.println(potito.cantComputers());

        Computadora aux = potito.onTop();

        System.out.println(aux.getNombre());

        center.runProcess();
        System.out.println(potito.cantComputers());
    }
}
