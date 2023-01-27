package com.linkedin.javacodechallenges;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class App 
{
    // Create function to calculate the date that's 
    // 100 days from now
    public static String hundredDaysAhead(){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE, 100);
        return c.getTime().toString();  
    }

    public static void main( String[] args )
    {
        System.out.println("100 days from now is... " 
            + hundredDaysAhead());
    }
}
