package com.mt.sample;

/**
 * Hello world!
 *
 */
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Engineers, Welcome to Ibrobay Consulting Services. You are sudying Maven Build Tool. !! Today Date is:  " + getLocalCurrentDate());

	}

	private static Date getLocalCurrentDate() {
		String m = "Ibrobay Consulting";
		return new Date();

	}

}
