package rope;

public class PatternSquareObstacle extends Obstacle{

    private char patt;

    public PatternSquareObstacle() {
        super();
        this.patt = '*';
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
    }

    public void setPattern(char set){
        this.patt = set;
    }


    @Override
    public String image() {
        String str="";
        for(int i = 0 ; i < getLength();i++){
            for ( int j=0; j < getLength();j++){
                str += this.patt;
            }
            str += "\n";
        }
        return str;
    }
}
