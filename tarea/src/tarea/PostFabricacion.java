package tarea;

public class PostFabricacion extends Fabricacion {

    @Override
    public void sitOn() {
        super.sitOn();
        System.out.println("you can sit");
    }

    @Override
    public void hasLegs() {
        super.hasLegs();
        System.out.println("It has legs");
    }

    @Override
    public void color() {
        super.color();
        System.out.println("Color Black");
    }
}