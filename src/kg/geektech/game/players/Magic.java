package kg.geektech.game.players;

public class Magic extends Hero {
    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int erer = RPG_Game.random.nextInt(10);
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + erer);

        }
        System.out.println("МАГ УВЕЛЕЧИЛ УРОН ГЕРОЕВ " + erer);
    }
}

