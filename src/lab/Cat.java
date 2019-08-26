

public class Cat extends Animal {

 private int leg;

    public Cat(String name, int age ) {
        super(name, age);
        setName(getName()+"!!!!");
        this.leg = 4;


    }

    // overide method
    public void eat() {
        super.eat();
        System.out.println("Cat eat");
    }



    // overload method

    public void eat(String food) {
        eat();
        System.out.println(food);
    }

    public void run() {
        System.out.println("run!!!!!!!!!!!!!!!!");
    }





}
