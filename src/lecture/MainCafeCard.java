public class MainCafeCard {

    public static void main(String[] args) {

        CafeCard people = new CafeCard("Jump Pongnut");
        EmployeeCafeCard teacher = new EmployeeCafeCard();
        teacher.getCardinfo();

        teacher.addCredit(200);
        teacher.getCardinfo();

        teacher.paid(100);
        teacher.getCardinfo();

        people.getCardinfo();

        people.addCredit(200);
        people.getCardinfo();

        people.paid(100);
        people.getCardinfo();





    }
}
