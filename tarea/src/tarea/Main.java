package tarea;

public class Main {
    public static void main(String[] args) {

        PostFabricacion pF = new PostFabricacion();

        System.out.println("Chair: ");
        pF.hasLegs();
        pF.sitOn();
        System.out.println("///////////////////");
        System.out.println("Sofa: ");
        pF.numCojines();
        System.out.println("///////////////////");
        System.out.println("Table: ");
        pF.color();
        pF.tamañoTabla();


    }
}