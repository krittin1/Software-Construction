package test8;

public class InternetCafeMemberCard implements Pointable {
    private double  total = 0;
    private int p ;
    private String info;
    private int point;

    public InternetCafeMemberCard(String info) {

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
        if ( score >= 2 ){
            score = score/2;
            point = point+(int)score;
        }

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
        return "InternetCafeMemberCard{name='"+info+"', totalHour=" +(int)this.total+ ", point=" + ((int)this.point)+"}";
    }



}
