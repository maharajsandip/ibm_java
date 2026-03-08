public class ArrayAccess {
    public static void main(String s[]) {
        // Array creation and elements access
        // int years[] = {2020,2021,2022,2023,2024,2025};
        // System.out.println(years[0]);
        // System.out.println(years[1]);
		// System.out.println(years[2]);
		// System.out.println(years[3]);
		// System.out.println(years[4]);
		// System.out.println(years[5]);

        // Initialize and create the array
        // int years[] = new int[6];
        // years[1] = 2021;
        // years[3] = 2023;
        // System.out.println(years[0]);
		// System.out.println(years[1]);
		// System.out.println(years[2]);
		// System.out.println(years[3]);
		// System.out.println(years[4]);
		// System.out.println(years[5]);

        // Using 'for' loops to traverse through an array
        // int years[] = new int[6];
		// years[0] = 2020;
		// years[1] = 2021;
		// years[2] = 2022;
		// years[3] = 2023;
		// years[4] = 2024;
		// years[5] = 2025;

        // int count_years = years.length;
		// System.out.println("the length of the array is " + count_years);

        // for (int i = 0; i < count_years; i++) {
        //     System.out.println(years[i]);
        // }

        // Using 'for' loops to traverse through the command line arguments
        // int num_args = s.length;
        // System.out.println("The length of the array is " + num_args);
        // for (int i = 0; i < num_args; i++) {
        //     System.out.println(s[i]);
        // }

        // exercise 1
        // int numbers[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // System.out.println("printing one at a time");
        // System.out.println(numbers[0]);
        // System.out.println(numbers[1]);
        // System.out.println(numbers[2]);
        // System.out.println(numbers[3]);
        // System.out.println(numbers[4]);
        // System.out.println(numbers[5]);
        // System.out.println(numbers[6]);
        // System.out.println(numbers[7]);
        // System.out.println(numbers[8]);
        // System.out.println(numbers[9]);

        // System.out.println("\nprinting with for loop");
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }

        // exercise 2
        String myStr = "The quick brown fox jumped over the lazy dog";
        // char char_array[] = myStr.replaceAll("\\s", "").toCharArray();

        for (int i = 0; i < char_array.length; i++) {
            System.out.println(char_array[i]);
        }
    }
}