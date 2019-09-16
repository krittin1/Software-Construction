public class Gun extends Weapon{

    private int numAmmo;
    private double accuracy;
    public Gun(int dmg, int dur, int ammo, double acc) {
        super(dmg, dur);
        numAmmo = ammo;
        accuracy = acc;
    }

    public Gun() {
        this(0,0,0,0);
    }


    @Override
    public void use() {
        super.use();
        if (--numAmmo < 0) numAmmo = 0;
    }

}
