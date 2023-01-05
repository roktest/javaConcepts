package annonymousArrays;

public class AnnonymousArrayDemo {

    public static void main(String[] args) {

        //we are passing an anonymous array to getAverageOfGrades method
        float result = getAverageOfGrades(new int[] {2,4,6,8});
        System.out.println("Average Of Grades " + result);

    }

    public static float getAverageOfGrades(int[] notes){
        float sum = 0;
        for (int note: notes) {
            sum = sum + (float) note;
        }
        return sum/notes.length;
    }
}
