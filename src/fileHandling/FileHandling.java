package fileHandling;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class FileHandling {


public static void main (String[] args) throws IOException {
	System.out.println("main");
	
	
	//BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\tea_b\\Desktop\\testFile.txt"));
	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\tea_b\\Desktop\\examplecsv.csv"));
	
	try {
	    StringBuilder sb = new StringBuilder();
	    String line = br.readLine();

	    while (line != null) {
	    	System.out.println("the line is "+line);
	        sb.append(line);
	        sb.append(System.lineSeparator());
	        line = br.readLine();
	        //System.out.println("printing sb: "+sb);
	    }
	    String everything = sb.toString();
	    System.out.println(everything);
	} finally {
	    br.close();
}


}

}