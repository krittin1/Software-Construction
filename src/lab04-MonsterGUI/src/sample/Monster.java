package sample;
public class Monster {

    private String name;
    private int hp;
    private int atk;
    private int def;

    private String imgPath;


    public Monster(String name, int hp, int atk, int def, String imgPath ) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.imgPath = imgPath;
    }


    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getName() { return name; }

    public int getHp() { return hp; }

    public int getAtk() { return atk; }

    public int getDef() { return def; }



    public int attack(Monster attacker, Monster defender) {

        hp = defender.getHp() - (attacker.getAtk()-defender.getDef())  ;
        if ( hp < 1){
            hp = 0;
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

    public void winner(Monster attacker, Monster defender) {
        if ( attacker.getHp() >= 1 && defender.getHp() < 1 ) {
            System.out.println();
            System.out.println("The Winner Is ..........\n" +
                    "Monster "+attacker.getName()+" atk : "+atk+" def : "+def+" hp : "+hp+"/50\n");
        }
    }

//    public void monsterInfo(Monster attacker, Monster defender) {
//
//        System.out.println("Monster "+attacker.getName()+" atk : " + attacker.getAtk() + " def : " + attacker.getDef() + " hp : " + attacker.getHp() + "/"+MainGame.fif);
//        System.out.println("Monster "+defender.getName()+" atk : " + defender.getAtk() + " def : " + defender.getDef() + " hp : " + defender.getHp() + "/"+MainGame.tir);
//    }
}
