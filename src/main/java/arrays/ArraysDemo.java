package arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        int declaredArray[];
        int declaredAndInitializedArray[] = {1,2,3,4,5,6};

        //int type
        //arrayOfIntegers name of the array
        // [] array indicator
        int firstArrayOfIntegers[] = new int[10];

        //this is possible
        int secondArrayOfIntegers[] = new int[0];

        //this is possible. it converts into ascii character value
        int thirdArrayOfIntegers[] = new int['a'];

        //this is not possible. it will throw an exception // UNCOMMENT TO TEST
        //int forthArrayOfIntegers[] = new int[-1];

        //this is not possible. it won't compile // UNCOMMENT TO TEST
        //int firstArrayOfIntegers[] = new int[10000000000000000000000000];

        System.out.println("-----------------------------------");
        System.out.println("BEFORE");
        int arrayA[] = {11,3};

        for (int arrayElement: arrayA) {
            System.out.println("Array A, element " + arrayElement);
        }
        System.out.println();

        int arrayB[] = {13,5,45};

        for (int arrayElement: arrayB) {
            System.out.println("Array B, element " + arrayElement);
        }
        System.out.println();

        //this changes the pointing to another array, so it would hold the values as the other array
        arrayB = arrayA;
        System.out.println("AFTER");
        for (int arrayElement: arrayB) {
            System.out.println("Array B, element " + arrayElement);
        }

        System.out.println("-----------------------------------");
        String[] string = new String[3];
        Object[] object = string;


        System.out.println("-----------------------------------");
        System.out.println(firstArrayOfIntegers.getClass().getName()); //expected [I
        // TODO: try with other types

        System.out.println(declaredAndInitializedArray[4]);

        System.out.println("declared And Initialized Array " + declaredAndInitializedArray);

        for (int i = 0; i < declaredAndInitializedArray.length; i++){
            System.out.println("index (" + i + ") has the value " + declaredAndInitializedArray[i]);
        }






    }

}
