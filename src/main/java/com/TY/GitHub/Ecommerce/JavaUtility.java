package com.TY.GitHub.Ecommerce;

import java.util.Random;
/**
 * 
 * @author Praveen
 *
 */

public class JavaUtility 
{
	/**
	 * To generate the random integers
	 * @return
	 */
	public static int getRandomNumb()
	{
		Random ran=new Random();
		int num=ran.nextInt(2000);
		return num;
		
	}

}
