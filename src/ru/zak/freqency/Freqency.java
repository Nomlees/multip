package ru.zak.freqency;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Freqency {
    public static void main(String[] args) {

        String filename = "C:\\Users\\User\\IdeaProjects\\kurs\\src\\ru\\zak\\freqency\\arr.txt";
        String[] arr = readerArr(filename);
        int[] numbers = transfer(arr);
        numbers = sorting(numbers);
        numbers = compound(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }

    }



    private static String[] readerArr(String filename) {
        String[] arr = new String[10];
        try {
            String str = null;
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((str = br.readLine()) != null) {
                arr = str.split(" ");
            }
            br.close();
        } catch (IOException exc) {
            System.out.println("IO error!" + exc);
        }

        return arr;
    }

    private static int[] transfer(String[] arr) {
        int[] numbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }
        return numbers;
    }

    private static int[] sorting(int[] numbers) {

        Arrays.sort(numbers);
        return numbers;
    }


    private static int[] compound(int[] numbers){
        int[] result = new int[numbers.length];
        int[] interval = new int[numbers.length];
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] == numbers[i+1]){
                interval[i] = numbers[i];
                interval[i+1] = numbers[i];
            }
        }
        int i = 0;
        for (int j = 0; j < numbers.length-1; j++) {
            if (interval[j]!=0){
                result[j] = interval[j];
            } else {
                result[j] = interval[j+1];
            }
        }

        return result;
    }

    private static int[] notUnic(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if ()
        }
    }



}


