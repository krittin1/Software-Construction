package test2;

//elab-source: User.java

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class User implements Subject,Observer{
    private String name;
    private Set<Observer> follower;
    private ArrayList<String> post;

    public User(String name) {
        this.name = name;
        follower= new LinkedHashSet<>();
        post = new ArrayList<>();
    }

    public String getPost(){
        String posts = "";
        for(String x :post)
            posts += "\n"+x ;
        return  posts;
    }

    @Override
    public void update(String post) {
        this.post.add(post);

    }

    @Override
    public void addTwiiter(Observer o) {
        follower.add(o);
    }

    @Override
    public void removeTwitter(Observer o) {
        follower.remove(o);
    }

    public void addPost(String post){
        String [] a =post.split("/");
    }

    public String getName() {
        return name;
    }

    public Set<Observer> getFollower() {
        return follower;
    }

    @Override
    public void notifyTwitter(String post) {
        String [] a =post.split("/");
        for(Observer o:follower){
            o.update("("+a[0]+") "+a[1]);
        }
    }
}