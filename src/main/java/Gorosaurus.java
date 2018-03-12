public class Gorosaurus extends Kaiju implements IAttack{

    public Gorosaurus(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    @Override
    public String roar(String scream){
        return "Roar, " + scream;
    }
}
