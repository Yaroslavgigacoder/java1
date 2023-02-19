import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(isSumBetween10And20(num1, num2));
        int x = sc.nextInt();
        System.out.println(isPositive(x));
        
        printString("abcd", 5); // abcdabcdabcdabcdabcd
        int year = sc.nextInt();
        System.out.println(isLeapYear(year));
        System.out.println(Arrays.toString(createArray(5, 8)));
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        swap(array);
        int[] arraymulty = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multy(arraymulty);
        int[][] matrix = new int[5][5];
        diagonal(matrix);
        maxmin(arraymulty); 
        // int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        // int x = array[2][3];
    
        // String[] stringArray = {"aaa", "aab", "aa"};
        // System.out.println(findCommonPrefix(stringArray)); // aa
        // String[] stringArray2 = {"abc", "bca", "cda"};
        // System.out.println(findCommonPrefix(stringArray2)); // ""
    }
    
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        if(a + b > 10 && a + b < 20){
            return true;
        }
        return false;
    }
    
    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if(x > 0){
            return true;
        }
        return false;
    }
    
    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        String s = new String();
        while(repeat > 0){
            repeat--;
            s = s + source;
        }
        System.out.println(source);
    }
    
    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if (year % 4 == 0){
            return true;
        }
        return false;
    }
    
    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] arr = new int[len];
        for(int i = 0; i < arr.length; i++){
            arr[i] = initalValue;
        } 
        return arr;
    }
    
    private static String findCommonPrefix(String[] source) {
        /** Найти общий префикс среди слов из одного массива.
         * ["aaa", "aab", "aa"] -> "aa", ["abc", "bca", "cda"] -> ""
         */
        return null;
    }
    //Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void swap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                arr[i] = 1;
            }
            else{
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static void multy(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            if(arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void diagonal(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(i == j){
                    matrix[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
    private static void maxmin(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }      
    /**
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * 4. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     */
    }