package multiplicationTables;

public class Main {
	public static void main(String[] args) throws Exception {
		int multi = 1;
		while (multi < 13) {
			System.out.print(multi);
			for (int i = 2 * multi; i < multi * 13; i += multi) {
				if (i < 10) {
					System.out.print("   " + i);
				} else if (i < 100) {
					System.out.print("  " + i);
				} else {
					System.out.print(" " + i);
				}
			}
			System.out.println();
			multi++;
		}
	}
}