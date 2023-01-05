package arrayTypes;

public class ArrayTypesDemo {

    public static void main(String[] args) {

        //primitive
        int array1[] = new int[4];

        float array2[] =  new float[2];

        double array3[] = new double[5];

        byte aByte = 2;
        short aShortMaxLim = 32767;

        //int primitive type can store other primitive types as they can be promoted to int
        array1[0] = 1;
        array1[1] = 'a';
        array1[2] = aByte;
        array1[3] = aShortMaxLim;

        // int can be stored by long, long can be stored by float and float can be stored by double

        System.out.println("---------------OBJECT CLASS ARRAY---------------");

        Object objectsArray[] = new Object[5];
        objectsArray[0] = new Object();
        objectsArray[1] = new String();

        System.out.println("---------------ABSTRACT CLASS ARRAY---------------");

        Number numberArray[] = new Number[5];
        numberArray[0] = new Integer(1);
        numberArray[1] = new Float(1.2);
        numberArray[2] = new Byte("1");
        numberArray[3] = new Double("1.1231");

        System.out.println("---------------INTERFACE CLASS ARRAY---------------");

        Runnable runnableArray[] = new Runnable[5];
        runnableArray[0] = new Thread();
    }

}
