package multiDimensionArray;

public class MultiDimensionArrayDemo {

    public static void main(String[] args) {

        int declaredArray1[][];

        int declaredArray2[][] = new int[2][];

        int declaredArray3[][] = new int[2][3];

        int declaredAndInitializedArray[][] = {{1,2},{3,4},{5,6},{7,8},{9,0}};

        //we got a null
        System.out.println(declaredArray2[0]);

        //we got null pointer exception // UNCOMMENT TO TEST
        //System.out.println(declaredArray2[0][0]);

        declaredArray2[0] = new int[2];
        declaredArray2[1] = new int[3];

        // will get 0 as result
        System.out.println(declaredArray2[0][0]);

        declaredArray2[0][0] = 55;

        // should get 55 as result
        System.out.println(declaredArray2[0][0]);

        System.out.println("____________________________");
        for (int[] array : declaredAndInitializedArray) {
            for (int arrayElement: array) {
                System.out.println(arrayElement);
            }
        }

        System.out.println("____________________________");
        for (int array[]: declaredArray3) {

            for (int arrayElement: array) {
                System.out.println(arrayElement);
            }
        }

        System.out.println("____________________________");
        for (int rowIndex = 0; rowIndex < declaredArray3.length; rowIndex++){
            for (int colIndex = 0; colIndex < declaredArray3[rowIndex].length; colIndex++){
                System.out.print("declaredArray3[" + rowIndex + "][" + colIndex + "] == " + declaredArray3[rowIndex][colIndex]);
                System.out.println();
            }
        }


    }
}
