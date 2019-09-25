package hw4;

import java.util.Arrays;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {





        BankAccount[] bankAccounts = {new BankAccount(500), new BankAccount(),
                new BankAccount(24566)};



        Arrays.sort(bankAccounts, new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                return (int)o1.getBalance() - (int)o2.getBalance();
            }
        });


        System.out.print("Balance after sort: ");
        for (BankAccount i : bankAccounts) {
            System.out.print(i.getBalance() + " ");
        }
        System.out.println();

        Animal[] animals = {new Animal(5), new Animal(12),
                new Animal(2)};



        Arrays.sort(animals, new Comparator<Animal>() {
                    @Override
                    public int compare(Animal o1, Animal o2) {
                        return o1.getAge() - o2.getAge();
                    }
                });


                System.out.print("Animals Age after sort: ");
        for (Animal i : animals) {
            System.out.print(i.getAge() + " ");
        }
        System.out.println();


    }
}

