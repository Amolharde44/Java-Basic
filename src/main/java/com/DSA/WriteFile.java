package com.DSA;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String content="Hello from java";
		String  path="D:/File1.txt";
		try {
			FileOutputStream fos=new FileOutputStream(path);
			byte [] bytecontent=content.getBytes();
			
			fos.write(bytecontent);
			System.out.println("Content write in file Sucessfully...........");
			fos.close();
		}
		
		catch(IOException e)
		{
			System.out.println("Error Occure during write file...");
		}
		

	}

}
