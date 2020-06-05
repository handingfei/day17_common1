package com.handingfei.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	/**
	 * 获取日期
	 * @param src
	 * @return
	 */
	public static String getDateByInitMonth(Date src){
		//TODO 实现代码
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(src);
		
		int month = calendar.get(Calendar.MONTH)+1;
		if (month<10) {
			return "0"+month;
		}else {
			return String.valueOf(month);
		}
		
	}
	
	/**
	 * 最后日
	 * @return
	 */
	public static String getDateByFullMonth() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	
		return sdf.format(cal.getTime());
	}
	
	
	public static void main(String[] args) {
		
		String src = "1917-02-10";
		
	}

}
