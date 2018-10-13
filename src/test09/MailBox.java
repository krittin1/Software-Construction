package test09;

public class MailBox {
    private int[][] room;
    private int[][] mail;

    public MailBox() {
        int num = 14010;
        this.room = new int[12][10];
        this.mail = new int[12][10];

        for ( int i=0; i < 12; i++ ){
            for ( int j=0; j < 10; j++){
                this.room[i][j] = num;
                this.mail[i][j] = 0;
                num++;
            }
        }
    }

    public void insertMail(int roomnum, int mail ) throws Exception {
        if(roomnum < 14010 || roomnum > 14129){
            throw new Exception("Invalid Room Number");
        }
        else
            {
                for ( int i=0; i < 12; i++ )
                {
                    for ( int j=0; j < 10; j++)
                    {
                        if(this.room[i][j] == roomnum)
                        {
                            this.mail[i][j] += mail;
                        }
                    }
                }

            }

    }

    public int checkTotal( int roomnum ) throws Exception {
        if(roomnum < 14010 || roomnum > 14129){
            throw new Exception("Invalid Room Number");
        }
        int mai = 0;
        for ( int i=0; i < 12; i++ ){
            for ( int j=0; j < 10; j++){
                if(this.room[i][j] == roomnum){
                    mai =this.mail[i][j] ;
                }
            }
        }
        return mai;
    }

    public void getMail( int roomnum ) throws Exception {
        if(roomnum < 14010 || roomnum > 14129){
            throw new Exception("Invalid Room Number");
        }
        for ( int i=0; i < 12; i++ ){
            for ( int j=0; j < 10; j++){
                if(this.room[i][j] == roomnum && this.mail[i][j] == 0){
                    throw new Exception("Not Found Mail in Room "+roomnum);
                }
                else if (this.room[i][j] == roomnum && this.mail[i][j] != 0)
                    this.mail[i][j] = 0;
            }
        }
    }




}
