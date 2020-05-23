package lab.assignment.afterRefactor;

import lab.assignment.afterRefactor.CoffeeMakerTemplate;

public class CoffeeClient {

    public static void main(String[] args) {
        Americano americano = new Americano();
        Mocha mocha = new Mocha();
        Capuccino capuccino = new Capuccino();

        americano.prepareCoffee();

        System.out.println("********************");

        mocha.prepareCoffee();

        System.out.println("********************");

        capuccino.prepareCoffee();
    }

}