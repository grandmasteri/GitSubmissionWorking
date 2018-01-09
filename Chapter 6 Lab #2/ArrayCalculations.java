
/**
 * Write a description of class ArrayCalculations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayCalculations
{
    

    /**
     * Constructor for objects of class ArrayCalculations
     */
    public static double averageArray(int[][] nums) {
        // initialise instance variables
        double sum = 0;
        for (int row = 0; row < nums.length; row++) {
            for(int col = 0; col < nums[0].length; col++) {
                sum += nums[row][col];
            }
        }
        return sum/(nums.length*nums[0].length);
    }
    
    public static int[] sumArray(int[][] nums) {
        // initialise instance variables
        int currentColumnSum = 0;
        int[] sumArray = new int[nums[0].length];
        int index = 0;
        for(int col = 0; col < nums[0].length; col++) {
            for(int row = 0; row < nums.length; row++) {
                currentColumnSum += nums[row][col];
            }
            sumArray[index] = currentColumnSum;
            index++;
            currentColumnSum = 0;
        }
        return sumArray;
    }
    
    public static int[][] squareArray(int[][] nums) {
        int[][] newArray = new int[nums.length][nums[0].length];
        for (int row = 0; row < nums.length; row++) {
            for(int col = 0; col < nums[0].length; col++) {
                newArray[row][col] = (int)Math.pow(nums[row][col], 2);
            }
        }
        return newArray;
    }
}
