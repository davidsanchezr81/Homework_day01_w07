public class Godzilla extends Kaiju implements IAttack {

    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    @Override
    public String roar(String scream){
        return "Roar, " + scream;
    }
}
