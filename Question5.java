import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

        Scanner in = new Scanner(System.in);
        
        System.out.print("");
        int num = in.nextInt();
        int[] list = new int[num]; // Array to store the input numbers
        
        // Prompt the user for each integer and populate the list array
        for(int i = 0; i < num; i++) {
            System.out.print("");
            list[i] = in.nextInt();
        }
        
        int[] frequency = new int[101]; // Array to store the frequency of each number (assuming numbers are in the range 0-100)
        
        // Count the frequency of each number
        for(int i = 0; i < num; i++) {
            frequency[list[i]]++;
        }
        
        // Find the mode (number with highest occurrence)
        int mode = 0;
        int maxFrequency = 0;
        for(int i = 0; i < frequency.length; i++) {
            if(frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mode = i;
            }
        }
        
        System.out.println(mode);
    
  }
}
