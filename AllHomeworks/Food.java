package AllHomeworks;

public class Food {
    public String name;
    public String cuisine;
    public boolean healthy;
    public boolean bestfood;
    public int numberOfIngredients;
    public int cookTime;


    public boolean IsItSpecialorNot() {
        if (numberOfIngredients >= 10 || cookTime >= 30) {
            return true;
        }
        else
            return false;
    }
    public String TimeSaver (){
        if(bestfood== true && numberOfIngredients<= 8 && cookTime<=15){
            return "it is easy to do";
        }
        else if (bestfood== true && numberOfIngredients <= 6 && cookTime <= 30){
            return "it is hard to do";
        }
        else if (bestfood== true && numberOfIngredients <=12 && cookTime <= 120){
            return "I had to cook long time";
        }
        else
            return "I will not have time to study Java";
    }
}

