package WK_VI_HW;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

//https://leetcode.com/problems/day-of-the-year/

/*
 * PSUEDO CODE
 * input String
 * output totaldays
 * 
 * Test Data 
 * Input: date = "2019-01-09"   |Output: 9
 *  Input: date = "2019-02-10"  |Output: 41
 *  
 *  
 *  Logic 
 *  
 *  1. Declare var int yr , dt , mon ,totaldays =0
 *  2. from the string get the value of year ,month a ddate in respective var 
 *  [ use String split function , yr = Integer.valueOf(res[0]) , mon =Integer.valueOf(res[1])
 *   dt = Integer.valueOf(res[2])
 *  3. check the month and add totaldays to totaldays +dt+totaldays in month till given month -1
 *  4. Check if the year is leap year [ yr %4 ==0 ] ,then  totaldays=totaldays+1;
 *  5. return totaldays
 *  
 * 
 */

import org.junit.Test;

public class day_of_the_year {
	
	public enum Month
	{
	  JAN(31),FEB(28),MAR(31),APR(30),MAY(31),JUNE(30),JULY(31),AUG(31),SEP(30),
	  OCT(31),NOV(30),DEC(31);	  
		
	  final int days;
	  
	  Month(int days)
	  {
		  this.days =days;
	  }	  
	 
	}
	
	public int dayOfyear(String input)
	{
		
		int yr , dt , mon ,totaldays=0 ,daysInMonth=0;
		
		String[] split = input.split("-");
		
		yr =  Integer.valueOf(split[0]);
		mon =  Integer.valueOf(split[1]);
		dt =  Integer.valueOf(split[2]);	
			
		switch(mon)
		{
		case 01:
			totaldays= dt;
			break;
		case 02:
			totaldays= Month.JAN.days+dt;
			break;
		case 03:
			totaldays= Month.JAN.days+Month.FEB.days+dt;
			break;
		case 04:
			totaldays= Month.JAN.days+Month.FEB.days+Month.MAR.days+dt;
			break;
		case 05:
			totaldays= Month.JAN.days+Month.FEB.days+Month.MAR.days+Month.APR.days+dt;
			break;
		case 06:
			totaldays= Month.JAN.days+Month.FEB.days+Month.MAR.days+Month.APR.days+
					   Month.MAY.days+dt;
			break;
		case 07:
			totaldays= Month.JAN.days+Month.FEB.days+Month.MAR.days+Month.APR.days+
					   Month.MAY.days+Month.JUNE.days+dt;
			break;
		case 8:
			totaldays= Month.JAN.days+Month.FEB.days+Month.MAR.days+Month.APR.days+
					   Month.MAY.days+Month.JUNE.days+Month.JULY.days+dt;
			break;
		case 9:
			totaldays= Month.JAN.days+Month.FEB.days+Month.MAR.days+Month.APR.days+
					   Month.MAY.days+Month.JUNE.days+Month.JULY.days+Month.AUG.days+dt;
			break;
		case 10:
			totaldays= Month.JAN.days+Month.FEB.days+Month.MAR.days+Month.APR.days+
					   Month.MAY.days+Month.JUNE.days+Month.JULY.days+Month.AUG.days+
					   Month.SEP.days+dt;
			break;
		case 11:
			totaldays= Month.JAN.days+Month.FEB.days+Month.MAR.days+Month.APR.days+
					   Month.MAY.days+Month.JUNE.days+Month.JULY.days+Month.AUG.days+
					   Month.SEP.days+Month.OCT.days+dt;
			break;
		case 12:
			totaldays= Month.JAN.days+Month.FEB.days+Month.MAR.days+Month.APR.days+
					   Month.MAY.days+Month.JUNE.days+Month.JULY.days+Month.AUG.days+
					   Month.SEP.days+Month.OCT.days+Month.NOV.days+dt;
			break;
		}
		
		if (yr %4 == 0 ) {totaldays = totaldays+1 ;}
		
		return totaldays;
		
	}
	
	@Test
	public void test1()
	{
		String input ="2019-01-09";		
		Assert.assertEquals(dayOfyear( input) ,9);	
	}
	
	@Test
	public void test2()
	{
		String input ="2019-02-10";		
		Assert.assertEquals(dayOfyear( input) ,41);	
	}

}
