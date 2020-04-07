public class DrinksLibrary {

    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name="Sex on the Beach";
        drink.price=9.99d;
        drink.isAlco=true;

        drink.ingredient1 = new Ingredient();
        drink.ingredient2 = new Ingredient();
        drink.ingredient3 = new Ingredient();

        drink.ingredient1.name = "vodka";
        drink.ingredient1.amount = 1.5d;

        drink.ingredient2.name = "juice";
        drink.ingredient2.amount = 200d;

        drink.ingredient3.name = "ice";
        drink.ingredient3.amount = 30;

        double volume = drink.ingredient1.amount + drink.ingredient2.amount + drink.ingredient3.amount;

        System.out.println("Drink:\t\t" + drink.name);
        System.out.println("Contains alcohol:\t" + drink.isAlco);
        System.out.println( "Ingredients:\t"   + drink.ingredient1.name + "(" + drink.ingredient1.amount + "ml)" +
                " + "           + drink.ingredient2.name + "(" + drink.ingredient2.amount + "ml)" +
                " + "           + drink.ingredient3.name + "(" + drink.ingredient3.amount + "ml)" );
        System.out.println("Volume:\t" + volume + "ml");
        System.out.println("Price:\t\t" + drink.price + "$");

    }
}
