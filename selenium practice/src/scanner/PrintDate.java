package scanner;

import java.util.Date;

public class PrintDate {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);
		String d1=d.toString();
		System.out.println(d1);
		String date=d1.replaceAll(":","-");
		System.out.println(date);
		
		

	}

}
