package Assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws IOException {
		 File file = new File("C:\\Users\\Mirketa\\Desktop\\RRD_BUG_30th_March");
		 file.createNewFile();
		 
		 FileWriter fw = new FileWriter("C:\\Users\\Mirketa\\Desktop\\RRD_BUG_30th_March.txt");
		 BufferedWriter bw = new BufferedWriter(fw);
		 
		 bw.write("Please write Inside the file");
		 bw.newLine();
		 bw.write("Hello!");
		 bw.flush();
		 
		 FileReader fr = new FileReader("C:\\Users\\Mirketa\\Desktop\\RRD_BUG_30th_March.txt");
		 BufferedReader br = new BufferedReader(fr);
		 
		 System.out.println(br.readLine());
		 System.out.println(br.readLine());
		 
		 
		 
		 
		 

	}

}
