package AllHomeworks;

import java.util.Spliterator;

public class Day17_2DArray {
    public static void main(String[] args) {
        //part4, as homework
        //USING TWO LOOP print names and surnames
        //ex:
        //Bayram Guney
        //Micheal Jackson
        String[][] s = {           //col .......
                //   0         1         2           3            4
                {"Bayram", "Zeynep", "Sezai", "Micheal", "Baraka"}, //0. row
                {"Guney", "Ucar", "Kalayci", "Jackson", "Obama"},   //1. row
        };
        for (int i = 0; i <= s.length; i++) {
            for (int j = 0; j <= s.length - 1; j++) {
                System.out.print(s[j][i] + " ");


            }
            System.out.println();

        }


    }
}


