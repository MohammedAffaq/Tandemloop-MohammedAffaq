// Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
//   (examples)
//   input: [1,2,8,9,12,46,76,82,15,20,30]
//   Output: 
//     {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}

public class Problem4 {
    public static void main(String[] args) {
        // Fixed input array
        int[] numbers = { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30 };

        // Array to store counts (index 1..9)
        int[] count = new int[10];

        // Count multiples
        for (int i = 1; i <= 9; i++) {
            for (int num : numbers) {
                if (num % i == 0) {
                    count[i]++;
                }
            }
        }

        // Print result in dictionary-like format
        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + count[i]);
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
