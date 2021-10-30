package carpet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*        Floor floor = new Floor(10,10);
        Carpet carpet = new Carpet(10);
        Calculator calculator = new Calculator(floor,carpet);

        System.out.println("Your carpet will cost " + calculator.getTotalCost() + "eur");*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter width and length of your floor");

        Floor floor = new Floor(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Please enter carpet cost");

        Carpet carpet = new Carpet(scanner.nextDouble());

        Calculator calculator = new Calculator(floor,carpet);

        System.out.println("Your carpet will cost " + calculator.getTotalCost() + "eur");
    }
}


