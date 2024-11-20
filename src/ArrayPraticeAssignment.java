import java.util.Arrays;
import java.util.Scanner;

public class ArrayPraticeAssignment {
    public static void main(String[] args) {
        System.out.println("========================question1=====================================");
        question1();
        System.out.println("========================question2=====================================");
        question2();
        System.out.println("========================question3=====================================");
        question3();
        System.out.println("========================question4=====================================");
        question4();
        System.out.println("========================question5=====================================");
        question5();
        System.out.println("========================question6=====================================");
        question6();
        System.out.println("========================question7=====================================");
        question7();
        System.out.println("========================question8=====================================");
        question8();
        System.out.println("========================question9=====================================");
        question9();
        System.out.println("========================question10=====================================");
        question10();
        System.out.println("========================question11=====================================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        int number = scanner.nextInt();
        question11(number, scanner);
        scanner.close();

    }

    /**
     * Write a program that creates an array of integers with a length of 3.
     * Assign the values 1, 2, and 3 to the indexes. Print out each array element.
     */
    public static void question1() {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

    /**
     * Write a program that returns the middle element in an array.
     * Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
     */
    public static void question2() {
        int[] numbers = new int[5];
        numbers[0] = 13;
        numbers[1] = 5;
        numbers[2] = 7;
        numbers[3] = 68;
        numbers[4] = 2;

        int middleIndex = numbers.length / 2;
        System.out.println(numbers[middleIndex]);
    }

    /**
     * Write a program that creates an array of String type and initializes it with the strings
     * “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy using the clone( ) method.
     * Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
     */
    public static void question3() {
        String[] strArr = new String[4];
        strArr[0] = "red";
        strArr[1] = "green";
        strArr[2] = "blue";
        strArr[3] = "yellow";
        System.out.println("length of array: " + strArr.length);

        String[] strArr2 = strArr.clone();
        System.out.println("Original array : " + Arrays.toString(strArr));
        System.out.println("Clone array : " + Arrays.toString(strArr2));
    }

    /**
     * Write a program that creates an integer array with 5 elements (i.e., numbers).
     * The numbers can be any integers.
     * Print out the value at the first index and the last index using length - 1 as the index.
     * Now try printing the value at index = length (e.g., myArray[myArray.length] ).
     * Notice the type of exception which is produced. Now try to assign a value to the array index 5.
     * You should get the same type of exception.
     */
    public static void question4() {
        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println("Original array : " + Arrays.toString(numbers));
        System.out.println("first index value : " + numbers[0]);
        System.out.println("last index value : " + numbers[numbers.length - 1]);
        // System.out.println("last index value check error: " + numbers[numbers.length]); //java.lang.ArrayIndexOutOfBoundsException:
        // numbers[5] = 20;
        //  System.out.println("last index value check error: " + numbers[numbers.length]);////java.lang.ArrayIndexOutOfBoundsException:
    }

    /**
     * Write a program where you create an integer array with a length of 5.
     * Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
     */
    public static void question5() {
        int[] numbers = new int[5];
        // Assign values to the array using a for loop
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        // Print the array elements
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    /**
     * Write a program where you create an integer array of 5 numbers.
     * Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.
     */
    public static void question6() {
        int[] numbers = new int[5];
        // Assign values to the array using a for loop
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        // Print the array elements
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    /**
     * Write a program where you create an array of 5 elements.
     * Loop through the array and print the value of each element, except for the middle (index 2) element.
     */
    public static void question7() {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            // Skip the middle element (index 2)
            if (i != 2) {
                System.out.println(numbers[i]);
            }
        }
    }

    /**
     * Write a program that creates a String array of 5 elements and swaps the first element
     * with the middle element without creating a new array.
     */
    public static void question8() {
        String[] words = {"apple", "banana", "orange", "grape", "kiwi"};
        String temp = null;
        System.out.println("Before swap : " + Arrays.toString(words));
        for(int i=0; i< words.length; i++){
            if(i == 0){
                temp = words[i];
            }
            if(i == 2){
                words[0] = words[i];
                words[i] = temp;
            }
        }
        System.out.println("After swap : " + Arrays.toString(words));
    }

    /**
     * Write a program to sort the following int array in
     * ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, and print the smallest and the
     * largest element of the array. The output will look like the following:
     * Array in ascending order: 0, 1, 2, 4, 9, 13
     * The smallest number is 0
     * The biggest number is 13
     */
    public static void question9() {
        int[] numbers =  {4, 2, 9, 13, 1, 0};
        System.out.println("Before  sorting : " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After  sorting : " + Arrays.toString(numbers) );
        System.out.println("Smallest elemet  : " + numbers[0] );
        System.out.println("Largest elemet  : " + numbers[numbers.length-1] );
    }

    /**
     *  Create an array that includes an integer, 3 strings, and 1 double. Print the array.
     */
    public static void question10() {
        Object[] myArray = {42, "hello", "world" ,"welcome", 3.14};

        for (Object element : myArray) {
            System.out.println(element);
        }
    }

    /**
     * Write some Java code that asks the user how many favorite things they have.
     * Based on their answer, you should create a String array of the correct size.
     * Then ask the user to enter the things and store them in the array you created.
     * Finally, print out the contents of the array.
     */
    public static void question11(int numberOfInput, Scanner scanner) {
        String[] favoriteThings = new String[numberOfInput];
        for (int i = 0; i < numberOfInput; i++) {
            System.out.print("Enter favorite thing #" + (i + 1) + ": ");
            favoriteThings[i] = scanner.next();
        }
        System.out.println("Your favorite things are:");
        for (String thing : favoriteThings) {
            System.out.println("- " + thing);
        }
    }

}