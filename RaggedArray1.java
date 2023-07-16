package Array6;/** * Ragged array -> Triangle is the best example. */public class RaggedArray1 {    public static void printRaggedArray(int[][] raggedArray){        final int arrayLength = raggedArray.length;        for(int row = 0; row < arrayLength; row++){ /*We know more efficient using enhance for loop*/            for(int column = 0; column < raggedArray[row].length; column++){                System.out.printf("%4d", raggedArray[row][column]);            }            System.out.println();        }    }    public static void main(String[] args) {        int[][] ragged1 = {            {1, 2, 3, 4, 5},            {1, 2, 3, 4},            {1, 2, 3},            {1, 2},            {1}        };        printRaggedArray(ragged1);        System.out.println("--------------------------------");        int[][] ragged2 = {            {1},            {1, 2},            {1, 2, 3},            {1, 2, 3, 4},            {1, 2, 3, 4, 5},        };        printRaggedArray(ragged2);    }}