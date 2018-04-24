
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		String str = "Hello World!";
		File outputFile = new File("C:\\Users\\Joshua\\Desktop\\File.bin");
		FileOutputStream outputStream = new FileOutputStream(outputFile);
		outputStream.write(str.getBytes());
		outputStream.close();
	}
	
}