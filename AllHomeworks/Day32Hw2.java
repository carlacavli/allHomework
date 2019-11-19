package AllHomeworks;

public class Day32Hw2 {
    public static void main(String[] args) {
        Food f = new Food();
        f.name = "Hunkar Begendi";
        f.cuisine = "Turkish";
        f.healthy = true;
        f.bestfood = false;
        f.numberOfIngredients = 10;
        f.cookTime = 120;

        System.out.println("it is a speacial dish : " + f.IsItSpecialorNot());
        System.out.println(f.TimeSaver());
    }
}
