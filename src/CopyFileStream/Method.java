package CopyFileStream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Method {
	public static void main(String args[]) throws IOException {
		
		String source = "E:/Stream.txt";  //Source File
		String target = "E:/Videos/CopyFile.txt"; //Destination File

		File sourceFile = new File(source); 
		String name = sourceFile.getName();  
		
		File targetFile = new File(target + name);
		Files.copy(sourceFile.toPath(), targetFile.toPath()); /** File.Copy Method () to copy a string
		                                                        from source to destination file
                                                              **/ 
		System.out.println("Copying through Files.copy()method");
	}
}