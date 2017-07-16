package filestreamdemo;
/*
 * The following program copies the contest of a given file to another given file.
 * if the destination file does not exist the program will create a file at given location
 * */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream instream = null;
		FileOutputStream outstream = null;
	 
	    	try{
	    		//defining path of the input and destination files
	    	    File infile =new File("C:\\Users\\Harshada Chavan\\copy\\InputFile.txt");
	    	    File outfile =new File("C:\\Users\\Harshada Chavan\\copy\\OutputFile.txt");
	    	    
	    	    //first we read the file using FileInputStream
	    	    instream = new FileInputStream(infile);
	    	   //Then we write the read content to the output file using FileOutputStream.
	    	    outstream = new FileOutputStream(outfile);
	 
	    	    byte[] buffer = new byte[1024];
	 
	    	    int length;
	    	    /*copying the contents from input stream to
	    	     * output stream using read and write methods
	    	     */
	    	    while ((length = instream.read(buffer)) > 0){
	    	    	outstream.write(buffer, 0, length);
	    	    }

	    	    //Closing the input/output file streams
	    	    instream.close();
	    	    outstream.close();

	    	    System.out.println("File copied successfully!!");
	 
	    	}catch(IOException ioe){
	    		//catch exceptions if any.
	    		ioe.printStackTrace();
	    	 }

	}

}
