package AllHomeworks;

public class Day14 {
    public static void main(String[] args) {

        //task 1 ,2 ,3 :
        int [] arr ={34,5,6,2,3,78,1};
        int max = arr[0];
        int min =arr[0];
        int average  = arr[0]/arr.length;

        for (int i = 0; i < arr.length; i++){

        if (arr[i] > max )
        max = arr[i];

        if (arr[i] < min)
        min = arr[i];

        average += arr[i] / arr.length;

        }
        System.out.println( "max is: " +max);
        System.out.println("min is : " + min);
        System.out.println("average is : " + average);

//
//        int[] myArray = {34, 5, 6, 2, 3, 78, 1};
//
//        System.out.println("TASK1-------------------------------------");
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < myArray.length; i++) {
//            int currentNumber = myArray[i];
//            if (currentNumber > max) {
//                max = currentNumber;
//            }
//        }
//        System.out.println("Max: " + max);
//
//        System.out.println("TASK2-------------------------------------");
//        int min = Integer.MAX_VALUE;
//        for (int currentNumber : myArray) {
//            if (currentNumber < min) {
//                min = currentNumber;
//            }
//        }
//        System.out.println("Min: " + min);
//
//        System.out.println("TASK3-------------------------------------");
//        int i, sum, average;
//        sum = 0;
//        for (i = 0; i < myArray.length; i++) {
//            sum += myArray[i];
//        }
//        average = sum / myArray.length;
//        System.out.println("The average of given score " + average);
//

    }
}
