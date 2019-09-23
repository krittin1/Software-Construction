package rope;

public class Obstacle {

    private int length;


    public Obstacle(){
        this.length = length;
    }

     public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public String image(){
        char[] arr = new char[length];
        for(int i=0; i < length;i++){
            arr[i] = '*';
        }
        return String.copyValueOf(arr);
    }
}
