package com.handingfei.common.utils;

public class FileUtil {

	/**
	 * 获取文件
	 * @param fileName
	 * @return
	 */
	public static String getExtendName(String fileName){
		
		if (fileName == null || "".equals(fileName)) {
			return null;
		}
		
		return fileName.substring(fileName.lastIndexOf(".")+1);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("."+FileUtil.getExtendName("www.jpg"));
	}

}
