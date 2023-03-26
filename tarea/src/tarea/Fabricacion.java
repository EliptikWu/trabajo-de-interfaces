package tarea;

abstract class Fabricacion implements Silla, Mesilla,Sofa{

    public void hasLegs(){
    }
    public void sitOn(){}
    public void tamañoTabla(){
        System.out.println("60cm");
    }
    public void color(){
        System.out.println("Color Brown");
    }
    public void numCojines(){
        System.out.println("4 cushions");
    }

}