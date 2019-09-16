public class Weapon {


    private int damage;
    private int durability;


    public Weapon(int dmg, int dur) {
        damage = dmg;
        durability = dur;
    }
    public int getDamage() {
        return damage;
    }
    public void use() {
        if (--durability < 0) durability = 0;
    }

}
