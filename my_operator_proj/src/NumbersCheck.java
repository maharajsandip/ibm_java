public class NumbersCheck {
	public static void main(String s[]) {
		int intArr[] = {12, 17, 3, 165, 87, 15, 15, 123, 98, 23};

        // Apply the mathematical operator on each number pairs such as:
        // addition elements at index 0,1
        // subtraction elements at index 2,3
        // multiplication elements at index 4,5
        // division elements at index 6,7
        // modulus elements at index 8,9

		for (int i = 0; i < intArr.length - 1; i++) {
			String output = intArr[i] <= intArr[i+1] ? (intArr[i] < intArr[i+1] ? " less than " : " equal to ") : " more than ";
			System.out.println(intArr[i] + output+intArr[i + 1]);
		}
	}
}
