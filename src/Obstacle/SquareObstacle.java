package rope;

public class SquareObstacle extends  Obstacle {

    public SquareObstacle() {
        super();
    }

    @Override
    public String image() {
        String str="";
        for(int i = 0 ; i < getLength();i++){
            for ( int j=0; j < getLength();j++){
                str += "*";
            }
            str += "\n";
        }
        return str;
    }


    @Override
    public  void setLength (int length){
        super.setLength(length);
    }

}
