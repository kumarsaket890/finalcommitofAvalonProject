package avalon.com.sak;

import java.util.concurrent.TimeUnit;
import org.openqa. selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

public class Testnew {
	public static void main(String[] args) throws InterruptedException 
	{
		//for user1
		System.setProperty("webdriver.chrome.driver","chromedriver 2");//opening browser for user1
		ChromeDriver c=new ChromeDriver();
		c.manage().window().maximize();//maximizing the browser size for user1
		c.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		
		c.get("https://chapp1.herokuapp.com/");//navigating to the webpage for user1
		Thread.sleep(1000);
		WebElement myact1=c.findElement(By.name("name"));
		myact1.sendKeys("user1");//giving the user name for user1
		Thread.sleep(1000);
		WebElement myact2=c.findElement(By.name("room"));
		myact2.sendKeys("scenes");//giving the room name for user1
		Thread.sleep(1000);
		WebElement myact3=c.findElement(By.xpath("//button[text ()='Join']"));
		myact3.click();//logging in as user1
	
		
//		2nd user
		System.setProperty("webdriver.chrome.driver","chromedriver 2");//opening browser for user2
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();//maximize the browser size for user2
		d.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		
		d.get("https://chapp1.herokuapp.com/");//navigating to the webpage for user2
		Thread.sleep(1000);
		WebElement myac1=d.findElement(By.name("name"));
		myac1.sendKeys("user2");//giving the user name for user1
		Thread.sleep(1000);
		WebElement myac2=d.findElement(By.name("room"));
		myac2.sendKeys("scenes");//giving the room name for user2
		Thread.sleep(1000);
		WebElement myac3=d.findElement(By.xpath("//button[text ()='Join']"));
		myac3.click();//logging in as user2
		Thread.sleep(1000);
		
//		1st user
		WebElement myact4=c.findElement(By.id("message-box"));
		myact4.sendKeys("hi user1 here!!");//typing message as user1
		Thread.sleep(1000);
		WebElement myact5=c.findElement(By.id("send-message"));
		myact5.click();//sending message as user2
		Thread.sleep(1000);
		
//		2nd user
		WebElement myac4=d.findElement(By.id("message-box"));
		myac4.sendKeys("hi user2 here!!");//typing message as user2
		Thread.sleep(1000);
		WebElement myac5=d.findElement(By.id("send-message"));
		myac5.click();//sending message as user2
		Thread.sleep(1000);
		
//		1st user
		WebElement myact6=c.findElement(By.id("message-box"));
		myact6.sendKeys("this is user1 test project");//typing message as user1
		Thread.sleep(1000);
		WebElement myact7=c.findElement(By.id("send-message"));
		myact7.click();//sending message as user1
		Thread.sleep(1000);
		
//		2nd user
		WebElement myac6=d.findElement(By.id("message-box"));
		myac6.sendKeys("this is user2 test project");//typing message as user2
		Thread.sleep(1000);
		WebElement myac7=d.findElement(By.id("send-message"));
		myac7.click();//sending message as user2
		Thread.sleep(1000);
		
//		c.quit();  //for closing browser of user1 remove comment before c.quit() if you want to use this function
//		d.quit();  // for closing browser of user2 remove comment before d.quit() if you want to use this function
			
		
	}

}
