import java.util.Arrays;

/**
 * 2018-05-17.
 * Program takes an array of ints on input
 * returns that array after removing duplicates.
 */
public class main {
    public static void main(String[] args) {
        int[] input = new int[]{100, 1000, 3, 4, 5, 2, 3, 4, 5, 1, 2, 1000, 1, 1, 2, 7, 5};

        if (input.length > 0) //check if input array is not empty
            solution(input);
        else System.out.println("An input array is empty");
    }

    public static void solution(int[] input) {
        int count_duplicates = 1; //variable to count every element once
        int N = input.length;
        Arrays.sort(input);

        //if there is more than one element in an input array
        //count all elements without duplicates
        if (N > 1) {
            for (int i = 1; i < N; i++) {
                if (input[i] != input[i - 1]) count_duplicates++;
            }
        }

        int[] output = new int[count_duplicates];
        output[0] = input[0];
        int j = 1;

        //rewrite the input array into output array without duplicated elements
        if (N > 1) {
            for (int i = 1; i < N; i++) {
                if (input[i] != input[i - 1]) {
                    output[j] = input[i];
                    j++;
                }
            }
        }

        System.out.println(Arrays.toString(output));
    }
}