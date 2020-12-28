package assignment1;

import java.awt.Label;
import java.util.Arrays;

public class NaredbeZaKontroluToka {

    public static void main(String[] args) {
        int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
        System.out.println(Arrays.toString(array));
        int positiveCounter = 0;
        int negativeCounter = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {
                negativeCounter++;
            } else if (array[i] > 0) {
                positiveCounter++;
            } else {
                continue;
            }
        }
        System.out.println("There is " + positiveCounter + " positvie numbers and " + negativeCounter + " negative numbers in array.");
        int[] positive = new int[positiveCounter];
        int[] negative = new int[negativeCounter];
        int counterP=0;
        int counterN=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>0){
                positive[counterP]=array[i];
                counterP++;
            }else if(array[i]<0){
                negative[counterN]=array[i];
                counterN++;
            }
        }
        System.out.println("Positive numbers are: " + Arrays.toString(positive));
        System.out.println("Negative numgers are: " + Arrays.toString(negative));
        System.out.println("Duplicates are: ");
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    counter++;
                    System.out.println(array[j]);
                }
            }

        }
        System.out.println("Number of duplicates is: " + counter);
    }
}
