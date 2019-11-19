package AllHomeworks;

public class Day15 {
    public static void main(String[] args) {

        int[] arr = {3, 11, 24, 3, 4, 5, 2, 1};
        boolean arrayHasOne = false;
        boolean arrayHasTwo = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arrayHasOne = true;
            }
            if (arr[i] == 2) {
                arrayHasTwo = true;
            }

        }
        if (arrayHasOne) {
            System.out.println("array has 1");
        }
        if (arrayHasTwo) {
            System.out.println("array has 2");
        }
        if(arrayHasOne && arrayHasTwo){
            System.out.println("array has both numbers");

    }
    }
    }

