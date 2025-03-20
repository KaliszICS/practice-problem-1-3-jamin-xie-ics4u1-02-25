import java.text.FieldPosition;
import java.io.*;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String readFile(String filename) {
		String word = "";
		BufferedReader inputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader(filename));
			String line;

			while ((line = inputStream.readLine()) != null) {
				if (!word.isEmpty()) {
					word += "\n";
				}
				word += line;
			}
		} catch (IOException e) {
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
			}
		}
		word = word + "\n";
		return word;
	}

	public static String backwardsReadFile(String filename) {
		String word = "";
		BufferedReader inputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader(filename));
			int c;

			while ((c = inputStream.read()) != -1) {
				word = (char)c + word;
			}
		} catch (IOException e) {
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
			}
		}
		return word;
	}
}
