package test09;
import java.util.Scanner;
public class MainProgram {
    public static void main(String[] args) {
        // initialize MailBox object
        MailBox mailBox = new MailBox(); //obeject
        System.out.println("Welcome to Comsi Condominium");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Please select menu [I] = insert mail ; [C] = check total mail ; [G] = get mail ; [E] = exit");
            String command = sc.next(); // rub ka string kong java
            if(command.toLowerCase().charAt(0) == 'i'){ // tong pen tua i tao nan
                System.out.println("Please enter [roomNumber numberOfMail] e.g. 14019 5");
                int room = sc.nextInt();
                int mail = sc.nextInt();
                try{
                    mailBox.insertMail(room,mail);
                }catch( Exception e ){
                    System.out.println(e.getMessage());
                }
            }else if(command.toLowerCase().charAt(0) == 'c'){
                System.out.println("Please enter [roomNumber] e.g. 14019");
                int roomnumber  =sc.nextInt();
                try{
                    System.out.println("Total Mail in Your MailBox :  "+ mailBox.checkTotal(roomnumber));
                }catch ( Exception e) {
                    System.out.println(e.getMessage());
                }
            }else if (command.toLowerCase().charAt(0) == 'g'){
                System.out.println("Please enter [roomNumber] e.g. 14019");
                int roomn = sc.nextInt();
                try{
                    mailBox.getMail(roomn);
                }catch ( Exception e ){
                    System.out.println(e.getMessage());
                }


            }else if(command.toLowerCase().charAt(0 )== 'e'){
                break;
            }
        }
    }

            }
