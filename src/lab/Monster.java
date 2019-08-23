package lab;
public class Monster {

    private String name;
    private int hp;
    private int atk;
    private int def;
    private Monster attacker;






    public Monster(String name, int hp, int atk, int def) {

        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;

    }



    public String getName() {
        return name; }

    public int getHp() {

        final int oldhp = hp;
        return hp;
    }




    public int getAtk() { return atk; }

    public int getDef() { return def; }



    public int attack(Monster attacker, Monster defender) {

        if ( defender.getDef() < attacker.getAtk() ) {

            hp = defender.getHp() - (Math.abs(attacker.getAtk() - defender.getDef()));
            if (hp < 1) {
                hp = 0;
            }

        }
        return hp;
    }

    public void heal(Monster attacker, int healer, int old) {

        if ( healer > 0 )
        if (  healer <= old    ) {
            hp = hp + healer;
        }
        else{
            hp = old;
        }
    }

    public boolean lose(Monster attacker) {

        if ( attacker.getHp() < 1  ) {
            return true;
        }
        else {
            return false;
        }
    }

    public void winner(Monster attacker, Monster defender, int oldhp) {
        if ( attacker.getHp() >= 1 && defender.getHp() < 1 ) {
            System.out.println();
            this.attacker = attacker;
            System.out.println("The Winner Is ..........\n" +
                    "Monster "+ attacker.getName()+" atk : "+atk+" def : "+def+" hp : "+hp+"/"+oldhp+"\n");
        }
    }

    public void monsterInfo(Monster attacker, Monster defender, int old1, int old2) {

        System.out.println("Monster "+ attacker.getName()+" atk : " + attacker.getAtk() + " def : " + attacker.getDef() + " hp : " + attacker.getHp() + "/"+old1);
        System.out.println("Monster "+defender.getName()+" atk : " + defender.getAtk() + " def : " + defender.getDef() + " hp : " + defender.getHp() + "/"+old2);
    }


}
