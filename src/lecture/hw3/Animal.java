package hw3;

public class Animal implements Comparable<Animal> {

    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Animal o) {
        if (this.age == o.age) {
            return 0;
        } else if (this.age > o.age) {
            return 1;
        } else {
            return -1;
        }

    }


    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }
}