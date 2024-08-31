package coreJavaForAT;

import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.Date;

public class Caleanddate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		System.out.println(d.toString()); //Inbuilt date format (converting object to String)
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy"); //Converting inbuilt to customized format 
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sd.format(d));
		
		//Calendar cal = new Calendar.getInstance();
		//SimpleDateFormat sde = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		//System.out.println(sde.format(cal.getTime()));
		
	}

}
