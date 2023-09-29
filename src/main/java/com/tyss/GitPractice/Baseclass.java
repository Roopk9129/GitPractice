package com.tyss.GitPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	@BeforeSuite
	public void BS() {
		System.out.println("Before Suite has been Executed");
	}
	@BeforeTest
	public void BT() {
		System.out.println("Before Test has been Executed");
	}
	@BeforeClass
	public void BC(){
		System.out.println("Before Class has been Executed");
		
	}
	@BeforeMethod
	public void BM() {
		System.out.println("Before Method 1 has been Executed");
	}
	@BeforeMethod
	public void BM1() {
		System.out.println("Before Method 2 has been Executed");
	}
	@AfterMethod
	public void AM() {
		System.out.println("After Method 1 has been Executed");
	}
	@BeforeMethod
	public void BM2() {
		System.out.println("Before Method 3 has been Executed");
	}
	@AfterMethod
	public void AM1() {
		System.out.println("After Method 2 has been Executed");
	}
	@AfterClass
	public void AC() {
		System.out.println("After Class has been Executed");
		
	}
	@AfterTest
	public void AT() {
		System.out.println("After Test has been Excecuted");
	}
	@AfterSuite
	public static void AS() {
		System.out.println("After Suite has been Executed");
	}

}
