package com.DSA.File;

import java.io.File;

public class createDir {
	public static void main(String[] args) {
		
		
		String folderlocation="D:/Amol/Amol1";
		
		File f=new File(folderlocation);
		
		f.mkdir();
	}

}
