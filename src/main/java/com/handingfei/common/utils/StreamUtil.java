package com.handingfei.common.utils;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamUtil {

	public static void closeAll(Closeable...ios){
		
		for (Closeable io : ios) {
			if (io!=null) {
				try {
					io.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static String readTextFile(InputStream src){
		
		File file = new File("");
		file.mkdir();
		file.getName();
		
		return "file";
	}
	
	public static String readTextFile(File txtFile){
		
		InputStreamReader iSReader = new InputStreamReader(null);
		try {
			iSReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "txtFile";
	}


	

}
