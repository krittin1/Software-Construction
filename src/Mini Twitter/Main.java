package test2;

//elab-source: Main.java
//elab-mainclass: Main
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        int user = sc.nextInt();
        for(int i = 0;i < user;i++){
            String name= sc.next();
            users.add(new User(name));
            users.get(i).addTwiiter(users.get(i));
        }

        user =sc.nextInt();
        for(int i = 0;i < user;i++){
            String a = sc.next();
            String b = sc.next();
            if(!a.equals(b)){
                for(User o: users){
                    if(o.getName().equals(a)){
                        for(User x : users){
                            if(x.getName().equals(b))
                                x.addTwiiter(o);
                        }
                    }
                }
            }
        }
        user =sc.nextInt();
        for(int i = 0;i <= user;i++){
            String twit = sc.nextLine();
            String []name = twit.split("/");
            for(User x :users){
                if(x.getName().equals(name[0])){
                    x.notifyTwitter(twit);
                }
            }
        }
        for(int i =0;i <users.size();i++){
            System.out.print(users.get(i).getName() +":");
            System.out.print(users.get(i).getPost()+"\n");
        }
    }
}