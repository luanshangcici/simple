package com.road.selenium.ex;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.imageio.ImageIO;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Ex1 {
	
	static WebDriver driver;
	public static final String URL = "file:///C:/Users/Administrator/workspace/all-2/selenium-test.html";
	
	@BeforeClass
	public static void init() {
		File file = new File("drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	/*
	 * 1、	通过谷歌浏览器，打开selenium-test.html
	 */
	@Test
	public void test1() throws Exception {
		driver.get(URL);
		Assert.assertEquals(driver.getCurrentUrl(), URL);
	}
	
	/*
	 * 2、	选中多选中的前三个
	 */
	@Test
	public void test2() throws Exception {
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='checkbox2']//input"));
		int i = 3;
		for (WebElement element : elements) {
			if (i > 0) {
				element.click();
				Assert.assertTrue(element + "未选中", element.isSelected());
				i--;
			} else {
				break;
			}
		}
	}
	
	/*
	 * 3、	等待10秒，取消第二步中选中的桃子(假设桃子不是第二个元素，位置一直在变化)
	 */
	@Test
	public void test3() throws Exception {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//label[contains(text(), '桃子')]/input"));
		Assert.assertTrue("桃子 is not selected", element.isSelected());
		element.click();
		Assert.assertFalse("桃子 is selected", element.isSelected());
	}
	
	/*
	 * 4、	选择[孤独求败]，单击，获取弹出框中的文字并打印，并在输入框中输入当前的时间戳，点击确定
	 */
	@Test
	public void test4() throws Exception {
		WebElement element = driver.findElement(By.xpath("//input[@value='独孤求败']"));
		element.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(1000);
		keyboardString(String.valueOf(System.currentTimeMillis()));
//		alert.sendKeys(String.valueOf(System.currentTimeMillis()));
		Thread.sleep(1000);
		alert.accept();
	}
	
	/*
	 * 5、	点击【屡战屡败】，进行截图，以当前日期(如20190411)创建文件夹，并将截图保存在该文件夹下
	 */
	@Test
	public void test5() throws Exception {
		String dir = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		File file = new File(dir);
		
		if (!file.exists()) {
			file.mkdirs();
		}

		WebElement element = driver.findElement(By.xpath("//input[@value='屡战屡败']"));
		element.click();
		Thread.sleep(1000);
		cutPic2(System.currentTimeMillis() + "", dir, "png");
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		
	}
	
	/*
	 * 6、	最下方的新闻中，有几条要闻，请获取要闻中所有加粗的新闻标题和新闻链接，
	 * 		并打印获取到的标题及链接(新闻标题不一定是下图中的数据)
	 */
	@Test
	public void test6() {
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='blk_yw_01']//div[@id='syncad_1']/h1//a"));
		for (WebElement element : elements) {
			System.out.println(element.getText() + "\t" + element.getAttribute("href"));
		}
		driver.switchTo().defaultContent();
	}
	
	/*
	 * 7、	在新闻的登录页面，输入一个错误的账号和密码，点击登陆，
	 * 		使用断言验证提示信息是否为“登录名或密码错误”，是则测试通过
	 */
	@Test
	public void test7() throws Exception {
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		
		WebElement element = driver.findElement(By.xpath("//div[@class='tn-title-login-custom']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		driver.findElement(By.xpath("//input[@name='loginname']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("username");
		try {
			driver.findElement(By.xpath("//input[@name='door']")).sendKeys("1234");
		} catch (Exception e) {}
		driver.findElement(By.xpath("//a[@class='login_btn']")).click();
		Thread.sleep(1000);
		String notifyStr = driver.findElement(By.xpath("//div[@node-type='titletips']/../p[@class='login_error_tips']")).getText();
		
		Assert.assertEquals("登录结果与预期不符", "登录名或密码错误", notifyStr);
		
	}

	@AfterClass
	public static void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}

	public void keyboardString(final String text) {
	    if (text != null) {
	        try {
	            final Robot robot = new Robot();
	            for (int i = 0; i < text.length(); i++) {
	                final char ch = text.charAt(i);
	                final boolean upperCase = Character.isUpperCase(ch);
	                final int keyCode = KeyEvent.getExtendedKeyCodeForChar(ch);
	                robot.delay(10);
	                if (upperCase) {
	                    robot.keyPress(KeyEvent.VK_SHIFT);
	                }
	                robot.keyPress(keyCode);
	                robot.keyRelease(keyCode);
	                if (upperCase) {
	                    robot.keyRelease(KeyEvent.VK_SHIFT);
	                }
	            }
	} catch (final Exception e) {
	            System.out.println(e);
	        }
	    }
	}
	
	public void cutPic(String imgName, String path, String type){
		File screenshot = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(screenshot, new File(path + "/" + imgName + "." + type));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void cutPic2(String imgName, String path, String type) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screenSize);
		try {
			Robot robot = new Robot();
			BufferedImage image = robot.createScreenCapture(rectangle);
			ImageIO.write(image, type, new File(path + "/" + imgName + "." + type));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
