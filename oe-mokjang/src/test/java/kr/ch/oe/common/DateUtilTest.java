package kr.ch.oe.common;



public class DateUtilTest {
	public static void main(String[] args) {
	   System.out.println(DateUtil.getWeeksOfYear(2015, 1, 10));
	   System.out.println(DateUtil.getStartDateWeeks(2015, 1, 16));
		int weeks = DateUtil.getWeeksOfYear(Integer.parseInt(DateUtil.getYearString()), Integer.parseInt(DateUtil.getMonthString()), Integer.parseInt(DateUtil.getDayString()));
		System.out.println("weeks : " + weeks);
	  }
	
	
}
