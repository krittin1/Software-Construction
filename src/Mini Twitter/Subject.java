package test2;

//elab-source: Subject.java
public interface Subject {
    void addTwiiter(Observer o);
    void removeTwitter(Observer o);
    void notifyTwitter(String post);
}