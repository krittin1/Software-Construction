package rope;

public class Main {
    public static void main(String[] args) {

        Obstacle obs = new Obstacle();
        obs.setLength(8);
        System.out.println(obs.image());

        SquareObstacle sqObs = new SquareObstacle();
        sqObs.setLength(5);
        System.out.println(sqObs.image());

        PatternSquareObstacle patObs = new PatternSquareObstacle();
        patObs.setLength(4);
        System.out.println(patObs.image());


        ((PatternSquareObstacle)patObs).setPattern('X');
        System.out.println(patObs.image());


    }
}
