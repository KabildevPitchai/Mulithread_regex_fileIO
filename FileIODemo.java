package FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIODemo {

	public static void main(String[] args) throws IOException  {
	 	File note=new File("/home/kabil/Documents/FileIO/kabil.txt");//file
			
		note.createNewFile();//Handle without throws it shows error so Handled by line 8
		System.out.println(note.canWrite());//is it possible to write in program its shows true or false
		System.out.println(note.canRead());//is it possible to read this note means it shows true or false
		System.out.println(note.getName());//its shows the filename of user created ..
		System.out.println(note.isFile());//its shows u r giving a file its shows true or else it is false
		System.out.println(note.isDirectory());//its shows the folder or u give a folder it shows true or else false
		System.out.println(note.getPath());
		
		//System.out.println(note.delete());//delete the given file is deleted & shows TRUE ....
		//we create new file then give DELETE method to remove the file & delete method shows FALSE...
		//if we unread the Delete file it gives the new file in that folder.
		
		//FILE WRITING TECHNIQUE
		FileWriter pen=new FileWriter(note);//it is used to include a single character only so its basically not in use
		//so now we are using BUFFERED METHOD
		
		BufferedWriter bw=new BufferedWriter(pen);//fileWriter obj(pen) given to BUFFERED OBJECT I/P
		// but Buffered Writer is used to do the STRING CHARACTERS are assumed in the method
//		BufferedWriter is depends on the FileWriter...
		
		bw.write("kabil");
		bw.write("asha");
		bw.write("indu");
		bw.write("dev");
		bw.flush();
		bw.close();
		
		/*pen.write('k');
		pen.write('a');
		pen.write('b');
		pen.write('i');
		pen.write('l');
		pen.write('d');
		pen.write('e');
		pen.write('v');//its all shown in given folder this one is in FileIO (Kabil.txt)
		pen.flush();//its used to flush the object(pen) but the created folders are not flushed only used object is cleaned.
		pen.close();//close the object to use it */
		
		
		
		FileReader reader=new FileReader(note);
	 	BufferedReader br=new BufferedReader(reader); 
		int ch=reader.read();//read method used to reading the Object(reader) then gives u to ASCIHKEY value 
		while(ch!=-1) {
			System.out.println((char)ch);//ch is a int in line 40 then its TYPECASTING used to INT INTO CHAR (CH)
			ch =reader.read();//(or)ch++; same both are same
		}
	}
		
		
		
	}


