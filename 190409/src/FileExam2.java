import java.io.*;

public class FileExam2 {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("test.java");
		}catch(FileNotFoundException fe) {
			System.out.println("fe.toString() : "+fe.toString());
		}
	}
}
