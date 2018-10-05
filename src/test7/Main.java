package test7;

public class Main {
    public static void main(String[] args) {
        Vocab vo = new Vocab("iterate","Verb","To say, or do again","She kept reiterating her request.");
        Vocab dic = new Vocab("recursive","Adjective","Of or relating to a repeating process whose output at each stage is applied as input in the succeeding stage.","It is easy to implement Fibonacci with recursive function.");
        Dictonary a = new Dictonary();
        a.add(vo);
        a.add(dic);
        System.out.println(a.find("iterate"));

    }
}
