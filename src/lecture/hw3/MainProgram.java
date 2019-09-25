package hw3;

import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        BankAccount[] bankAccounts = {new BankAccount(500), new BankAccount(),
                new BankAccount(24566)};

        Arrays.sort(bankAccounts);
        System.out.print("Balance after sort: ");
        for (BankAccount i : bankAccounts) {
            System.out.print(i.getBalance() + " ");
        }
        System.out.println();

        Animal[] animals = {new Animal(5), new Animal(2),
                new Animal(10)};

        Arrays.sort(animals);
        System.out.print("Animal Age after sort: ");
        for (Animal i : animals) {
            System.out.print(i.getAge() + " ");
        }
        System.out.println();




    }
}
