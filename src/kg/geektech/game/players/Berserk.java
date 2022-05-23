package kg.geektech.game.players;

public class Berserk extends Hero {
    private int savedDamage;
    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int zzxx = boss.getDamage()/2;
        for (int i = 0; i < heroes.length; i++) {
            if(heroes.length > 0) {
                boss.setHealth(boss.getHealth() - zzxx);
                System.out.println("берсерк поглотил половину урон босса");
                break;
            }

        }

    }

    public int getSavedDamage() {
        return savedDamage;
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }
}
