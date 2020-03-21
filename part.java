/* Name-Hrithik Sharma
 Section-D
Class Rollno-17
University Rollno-2012757
Father Name- Raju Sharma
Subject Code-TCS651
Subject Name-DevOps
Enrollment NO-GE-172012757*/ 
package open_website;
import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.By;
    import org.openqa.selenium.chrome.ChromeDriver;
 public class Open_website_1
       {
public static void main(String[] args) {  //Login
// TODO Auto-generated method stub
String expath = "D:\\Eclipse\\chromedriver_win32\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http:\\www.facebook.com");
WebElement element1 = driver.findElement(By.id("email"));
element1.sendKeys("Hrithiksharma2312@gmail.com");
WebElement element2 = driver.findElement(By.id("pass"));
element2.sendKeys("pa$$word123");
WebElement element3 = driver.findElement(By.id("u_0_q"));
element3.click();
System.out.println("Login");}}