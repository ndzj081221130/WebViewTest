package com.woshipike.mywebview.test;

import com.fujitsu.fnsk.bb.BrowserBenchmark.CustomizedWebview;
import com.jayway.android.robotium.solo.By;
import com.jayway.android.robotium.solo.Solo;
import com.jayway.android.robotium.solo.WebElement;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class BrowserTest extends ActivityInstrumentationTestCase2<CustomizedWebview>{
	private Solo solo;
	public BrowserTest(){
		super(CustomizedWebview.class);
		
	}
	
	@Override
	public void setUp() throws Exception {
		//setUp() is run before a test case is started. 
		//This is where the solo object is created.
		solo = new Solo(getInstrumentation(), getActivity());
	}

	@Override
	public void tearDown() throws Exception {
		//tearDown() is run after a test case has finished. 
		//finishOpenedActivities() will finish all the activities that have been opened during the test execution.
//		solo.finishOpenedActivities();
	}
//	public void testGoogle()throws Exception{
//		solo.enterText(0, "www.google.com.hk");//solo.ge
//		solo.clickOnButton(0);//点击之后没反应啊？？？？www.baidu.com可以？
//		try {
//	         Thread.sleep(5000);
//	     } catch (InterruptedException e) {
//	     }
////		solo.enterText(1, "text");
////		solo.clickOnButton("百度一下");
////		solo.getw
//		solo.enterTextInWebElement(By.id("lst-ib"), "helloworld");
//		solo.clickOnWebElement(By.id("q"));
//		try {
//	         Thread.sleep(5000);
//	     } catch (InterruptedException e) {
//	     } 
//		
//		solo.clickOnButton(1);
//		try {
//	         Thread.sleep(5000);
//	     } catch (InterruptedException e) {
//	     }
//	}
	public void testBaidu()throws Exception{
		solo.enterText(0, "www.baidu.com");
		solo.clickOnButton(0);//点击之后没反应啊？？？？www.baidu.com可以？
//		
//		solo.enterText(1, "text");
//		solo.clickOnButton("百度一下");
		
		solo.enterTextInWebElement(By.name("word"), "helloworld");
		solo.clickOnWebElement(By.textContent("百度一下"));
		try {
	         Thread.sleep(5000);
	     } catch (InterruptedException e) {
	     }
		
		solo.clickOnButton(1);
		try {
	         Thread.sleep(5000);
	     } catch (InterruptedException e) {
	     }
	} 
}
