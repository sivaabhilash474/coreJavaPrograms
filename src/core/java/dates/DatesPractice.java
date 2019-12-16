package core.java.dates;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesPractice {

	public static void main(String[] args) throws ParseException {
		
		String currentTime = "22:00:00"; //Giving time as String
		String executionTime = "22:01:00";
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");	//Defining the required format we need in HH:mm
		Date d1 = sdf.parse(currentTime);	// Converting STring time to Date Object
		Date d2 = sdf.parse(executionTime);
		long diff = d2.getTime() - d1.getTime();
		System.out.println("Difference between times in minutes: "+diff/(60 * 1000)%60);
		
		if(diff/(60 * 1000)%60 == 1) {
			System.out.println("Time difference is 1 minute");
		}
		
		String formatted = sdf.format(d1); // converting Date Object to String
		System.out.println("Time before subtraction: "+formatted);
		
		//To subtract the time create an object of DateTimeFormatter Class
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm"); //Defining the required format we need
		
		LocalTime datetime = LocalTime.parse(formatted,formatter);	//Converting String time to Date Object by passing Date String and the format we need
		
		datetime = datetime.minusMinutes(-30);
		
		/*
		 * String timeAfterSubtraction = datetime.format(formatter);
		 * System.out.println("After 30 minutes subtraction from date: "
		 * +timeAfterSubtraction);
		 */
		
//		datetime = datetime.minusMinutes(-60);
		System.out.println("Time after adding 30 minutes: "+datetime);
		
		
		
		
		
		
		
	}
	
	
	
}
