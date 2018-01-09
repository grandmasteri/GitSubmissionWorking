
/**
 * Write a description of class ArrayDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayDriver
{
    
    /**
     * Constructor for objects of class ArrayDriver
     */
    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(ArrayCalculations.averageArray(arr));
        int a[] = ArrayCalculations.sumArray(arr);
        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        int b[][] = ArrayCalculations.squareArray(arr);
        for (int row = 0; row < b.length; row++) {
            for(int col = 0; col < b[0].length; col++) {
                System.out.print(b[row][col] + " ");
            }
            System.out.println(" ");
        }
    }
}
