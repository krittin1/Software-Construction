package hw;

public class Monster implements Comparable<Monster>{
    private String name;
    private int hitPoint;

    public Monster(String name, int hitPoint) {
        this.name = name;
        this.hitPoint = hitPoint;
    }


    @Override
    public String toString() {
        return name+":"+hitPoint;
    }

    public int compareTo(Monster monster){
        if(hitPoint==monster.hitPoint)
            return 0;
        else if(hitPoint>monster.hitPoint)
            return -1;
        else
            return 1;
    }




}
