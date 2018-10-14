package l02;
import java.util.Scanner;
public class MainProgram {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            if ( count > 0 ) {
                break;
            }
            System.out.println("*********************************************************************************************************************************************");
            System.out.println("|                                                         ComSci Bar & Bistro                                                               |");
            System.out.println("|                                                                                                                                           |");
            System.out.println("_____________________________________________________________________________________________________________________________________________");
            System.out.println("welcome                                           ");
            System.out.println("press 1(Cocktails) :                              ");
            System.out.println("press 2(Juices) :                                 ");
            System.out.println("press 3(Soft drinks) :                            ");
            Scanner a = new Scanner(System.in);
            int CJS = a.nextInt();
            if (( CJS <= 0 || CJS > 3 ) && ( count == 0 )) {
                System.out.println("Invalid  please try again. ");
            }
            else if ( CJS >= 1 && CJS <= 3 ) {
                System.out.println("choose your size 1-3 : ");
                System.out.println("[1] short(10 ฿)");
                System.out.println("[2] tall(20 ฿)");
                System.out.println("[3] grande(30 ฿)");
                Scanner s = new Scanner(System.in);
                int size = s.nextInt();
                System.out.println("choose your type 1-2 : ");
                System.out.println("[1] cold(10 ฿)");
                System.out.println("[2] frappe(15 ฿)");
                Scanner t = new Scanner(System.in);
                int type = t.nextInt();


                System.out.println("select your quantity : ");
                Scanner q = new Scanner(System.in);
                int qauntity = q.nextInt();

                if ( CJS == 1 && size >= 1 && size <= 5 && type >= 1 && type <= 3 ) {
                    while (true) {
                        System.out.println("choose your Cocktail type 1-5 : ");
                        System.out.println("[1] martini(500 ฿)");
                        System.out.println("[2] gimlet(800 ฿)");
                        System.out.println("[3] screwdriver(1500 ฿)");
                        System.out.println("[4] mojito (1750 ฿)");
                        System.out.println("[5] margarita (2000 ฿)");
                        Scanner tt = new Scanner(System.in);
                        int cType = t.nextInt();
                        if ( cType >= 1 && cType <= 5 ) {
                            Cocktails cocktails = new Cocktails(size,type,qauntity,cType);
                            System.out.println(cocktails.toString());
                            count = count + 1;
                            break;

                        }
                        else {
                            System.out.println("invalid  please try again. ");
                        }
                    }
                }
                else if ( CJS == 2 && size >=  1 && size <= 5 && type >= 1 && type <= 3 ) {
                    while (true) {
                        System.out.println("choose your Juice type 1-5 : ");
                        System.out.println("[1] orange juice (100 ฿)");
                        System.out.println("[2] grape juice (100 ฿)");
                        System.out.println("[3] apple juice (100 ฿)");
                        System.out.println("[4] melon juice (100 ฿)");
                        System.out.println("[5] mango juice (100 ฿)");
                        Scanner s1 = new Scanner(System.in);
                        int jType = t.nextInt();
                        if ( jType >= 1 && jType <= 5 ) {
                            Juice juice = new Juice(size,type,qauntity,jType);
                            System.out.println(juice.toString());
                            count = count + 1;
                            break;

                        }
                        else {
                            System.out.println("invalid  please try again. ");
                        }
                    }
                }
                else if ( CJS == 3 && size >=  1 && size <= 5 && type >= 1 && type <= 3 ) {

                    while (true) {
                        System.out.println("choose your Soft drinks type 1-5 : ");
                        System.out.println("[1] pepsi (80 ฿)");
                        System.out.println("[2] coke (80 ฿)");
                        System.out.println("[3] est (80 ฿)");
                        System.out.println("[4] italian soda  (100 ฿)");
                        System.out.println("[5] green tea soda (150 ฿)");
                        Scanner ct = new Scanner(System.in);
                        int sType = t.nextInt();
                        if ( sType >= 1 && sType <= 5 ) {
                            Softdrinks softdrinks = new Softdrinks(size,type,qauntity,sType);
                            System.out.println(softdrinks.toString());
                            count = count + 1;
                            break;

                        }
                        else {
                            System.out.println("invalid  please try again. ");
                        }
                    }
                }
                else {
                    System.out.println("invalid please try again. ");
                }
            }
        }
    }
}
