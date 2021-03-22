package Lab10_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class NewFileIO {

	private static final Logger LOG = Logger.getLogger(NewFileIO.class.getName());
	public final static String FILE_LOCATION = "src/Lab10_02/newOutput.txt";
	public final static String TO_PRINT = "This is the new string to print to file.";

	void writeText(String filename, String text) {

		File f = new File(filename);
		try (FileWriter fw = new FileWriter(f); PrintWriter writer = new PrintWriter(fw);) {
			writer.print(text);
		} catch (IOException e) {
			LOG.warning("IOException: " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		OldFileIO old = new OldFileIO();
		old.writeText(FILE_LOCATION, TO_PRINT);
	}

}
