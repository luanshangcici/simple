package com.road.selenium.ex;

import java.io.File;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 * 1).打开登录页面检查登录框是否展示（5分）
 * 2).打开的页面是二维码登录时，切换回密码登录（5分）
 * 3).iframe切换（5分）
 * 4).输入账号密码，点击登录按钮操作（10分）
 * 5).登录方法封装（5分）
 * 6).登录成功断言（5分）
 * 7).使用junit / testing（5分）
 */
public class Ex2 {

	
	static WebDriver driver;
	public static final String URL = "http://mail.qq.com";
	
	@BeforeClass
	public static void init() {
		File file = new File("drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws Exception {
		// 打开登录页面检查登录框是否展示
		driver.get(URL);
		// 登录
		login("2591337862", "zl123456");
		Thread.sleep(1000);
		boolean flag = isExist(By.xpath("//a[text()='退出']"));
		// 登录成功断言
		Assert.assertTrue("登录未成功", flag);
	}

	@AfterClass
	public static void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}
	
	public boolean isExist(By by){
		try {
			driver.findElement(by);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void login(String userName, String passwd) throws Exception {
		// iframe切换
		driver.switchTo().frame("login_frame");
		Thread.sleep(1000);
		// 打开的页面是二维码登录时，切换回密码登录
		if (!driver.findElement(By.xpath("//input[@id='u']")).isDisplayed() 
				&& isExist(By.xpath("//span[@class='qrlogin_img_out']"))
				&& driver.findElement(By.xpath("//span[@class='qrlogin_img_out']")).isDisplayed()) {
			driver.findElement(By.xpath("//a[@id='switcher_plogin']")).click();
		}

		//输入账号密码，点击登录按钮操作
		driver.findElement(By.xpath("//input[@id='u']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='p']")).sendKeys(passwd);
		driver.findElement(By.xpath("//input[@value='登 录']")).click();
		
		driver.switchTo().defaultContent();
	}

}
