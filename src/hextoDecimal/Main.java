package hextoDecimal;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		String in;
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(args[0]));
			while ((in = br.readLine()) != null) {
				char[] nums = in.toCharArray();
				int value = 0;
				double placeValue = Math.pow(16.0, (double) nums.length);
				for (int i = 0; i < nums.length; i++) {
					placeValue = placeValue / 16.0;
					switch (nums[i]) {
					case '0':
						break;
					case '1':
						value += 1 * placeValue;
						break;
					case '2':
						value += 2 * placeValue;
						break;
					case '3':
						value += 3 * placeValue;
						break;
					case '4':
						value += 4 * placeValue;
						break;
					case '5':
						value += 5 * placeValue;
						break;
					case '6':
						value += 6 * placeValue;
						break;
					case '7':
						value += 7 * placeValue;
						break;
					case '8':
						value += 8 * placeValue;
						break;
					case '9':
						value += 9 * placeValue;
						break;
					case 'a':
						value += 10 * placeValue;
						break;
					case 'b':
						value += 11 * placeValue;
						break;
					case 'c':
						value += 12 * placeValue;
						break;
					case 'd':
						value += 13 * placeValue;
						break;
					case 'e':
						value += 14 * placeValue;
						break;
					case 'f':
						value += 15 * placeValue;
						break;
					}
				}
				System.out.println(value);
			}
		} catch (Exception e) {
		}

	}

}
