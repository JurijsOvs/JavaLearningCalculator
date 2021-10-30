package carpet;

public class Main {
    public static void main(String[] args) {

        Floor floor = new Floor(10,10);
        Carpet carpet = new Carpet(10);
        Calculator calculator = new Calculator(floor,carpet);

        System.out.println("Your carpet will cost " + calculator.getTotalCost() + "eur");

    }
}


