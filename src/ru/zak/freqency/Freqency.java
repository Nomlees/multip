package ru.zak.freqency;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Freqency {
    public static void main(String[] args) {

        String filename = "C:\\Users\\User\\IdeaProjects\\kurs\\src\\ru\\zak\\freqency\\arr.txt";
        ArrayList list = readerArr(filename);
        int[] numbers = transfer(arr);
        numbers = sorting(numbers);
        numbers = compound(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }

    }


    /**
     * Метод для чтения чисел из файла и добавление чисел в строковый список.
     * @param filename - путь к файлу.
     * @return - строковый массив с числами.
     */
    private static ArrayList readerArr(String filename) {
        String[] arr = new String[10];
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            String str;

            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((str = br.readLine()) != null) {
               arrayList.add(str);
            }
            br.close();
        } catch (IOException exc) {
            System.out.println("IO error!" + exc);
        }
        return arrayList;
    }

    /**
     * Метод перевода строкового массива в целочисленный
     * @param arr - массив с числами
     * @return - целочисленный массив
     */

    private static int[] transfer(String[] arr) {
        int[] numbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }
        return numbers;
    }

    /**
     * Сортировка по убыванию
     * @param numbers - массив
     * @return - отсортированный массив
     */
    private static int[] sorting(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }

    private static int[] compound(int[] numbers){

        int[] result = new int[numbers.length];



        return result;
    }

//    /**
//     * Метод сортировка по частоте.
//     * @param numbers - массив с числами
//     * @return - должен возвращать массив должен овторяющихся чисел.
//     */
//    private static int[] compound(int[] numbers){
//        int[] result = new int[numbers.length];
//        int[] interval = new int[numbers.length];
//        for (int i = 0; i < numbers.length-1; i++) {
//            if (numbers[i] == numbers[i+1]){
//                interval[i] = numbers[i];
//                interval[i+1] = numbers[i];
//            }
//        }
//
//        for (int j = 0; j < numbers.length-1; j++) {
//            if (interval[j]!=0){
//                result[j] = interval[j];
//            } else {
//                result[j] = interval[j+1];
//            }
//        }
//
//        return result;
//    }
//
//
//    private static int[] notUnic(int[] numbers){
//        for (int i = 0; i < numbers.length; i++) {
//
//        }
//        return
//    }



}


