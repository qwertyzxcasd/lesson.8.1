package kg.geektech.game.players;

public class Thor extends Hero {
    public Thor(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.STAN);
    }
@Override
    public void applySuperPower(Boss boss, Hero[] heroes) {


    }
}