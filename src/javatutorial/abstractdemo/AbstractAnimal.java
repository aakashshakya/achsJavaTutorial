package javatutorial.abstractdemo;

public abstract class AbstractAnimal {
    
    public abstract void sound();
    
    public abstract void eats();
    
    public String legs(){
        return "All animals have 4 legs.";
    }
    
    public String name;
    public String color;
}
