package com.DSA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		
		String filepath="D:/File.txt";
		
		FileInputStream fos=new FileInputStream(filepath);
		InputStreamReader io=new InputStreamReader(fos);
		BufferedReader br=new BufferedReader(io);
		File file =new File(filepath);
		
	System.out.println("path:"+file.getPath());	
	System.out.println("Name:"+file.getName());
	System.out.println("Parent file:"+file.getParentFile());
		
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		br.close();
		
	}
	

}
