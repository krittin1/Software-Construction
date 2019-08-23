public class Number {


    private static long n;




    public static long getN() {
        return n;
    }

    public void setN(long n) {
        this.n = n;
    }

    public static boolean checkPrime(long number) {


        int count = 0;
        for (int i = 1; i <= number; i++) {

            if (number%i == 0) {

                count++;



            }
        }

        if (count == 2) {
            return true;
        }
        else {
            return false;
        }

    }



    public static long fact(long number) {
        long result = 1;
        for (int i=1; i <= number; i++ ) {

            result = result * i;

        }

        return result;
    }



    public static  long fact_recursive(long number) {

        if ( number == 0 ) {

            return 1;
        }


        return number * fact_recursive(number-1);
    }


}






