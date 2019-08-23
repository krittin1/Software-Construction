

public class MemberCard implements Pointable {
    private double  total = 0;
    private int p ;
    private String info;
    private int point;

    public MemberCard(String info) {

        this.info = info;
        this.point = 0;

    }

    public int getP() {
        return p;
    }



    public double getTotal() {
        return total;
    }
    @Override
    public void addScore(double score) {
        this.total = this.total + score;


            score = score/250;
            double t = this.total/250;
            point = (int)t;



    }


    @Override
    public int getPoint() {


        return point;




    }

    @Override
    public void  usePoint(int p){
        if ( point >= p ) {
            point = point - p;
        }




    }



    @Override
    public String getInfo() {
        return "MemberCard{name='"+info+"', totalPurchase=" +this.total+ ", point=" + this.point+"}";
    }
}