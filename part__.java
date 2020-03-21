/* Name-Hrithik Sharma
 Section-D
Class Rollno-17
University Rollno-2012757
Father Name- Raju Sharma
Subject Code-TCS651
Subject Name-DevOps
Enrollment NO-GE-172012757*/ 
public class Facebookuo {     //Driver For Facebook Signup
public ChromeDriver driver;
@BeforeMethod
public void Start(){

System.setProperty("webdriver.chrome.driver", "//home//craterzone//chromedriver");
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
}
@AfterMethod
public void Close(){
driver.quit();
}
@Test
public void FbLgSu() throws InterruptedException{
//driver.findElementById("email").clear();
driver.findElementById("email").sendKeys("Hrithik@gmail.com");
driver.findElementById("pass").sendKeys("Hrithik@geu");
driver.findElementById("u_0_v").click();
driver.findElementByXPath(".//*[@id='register_link']/strong/a").click();
driver.findElementByXPath(".//*[@id='u_0_0']").sendKeys("Hrithik");
driver.findElementByXPath(".//*[@id='u_0_1']").sendKeys("Sharma");
driver.findElementByXPath(".//*[@id='u_0_2']").sendKeys("8888885785");
driver.findElementByXPath(".//*[@id='u_0_4']").sendKeys("9654549658");
driver.findElementByXPath(".//*[@id='u_0_5']").sendKeys("Hrithik");
Select Days =new Select(driver.findElementById("day"));
Days.selectByValue("16");
Thread.sleep(1000);
Select Month =new Select(driver.findElementById("month"));
Month.selectByValue("8");
Thread.sleep(1000);
Select Year =new Select(driver.findElementById("year"));
Year.selectByValue("1998");
//driver.findElementByXPath(".//*[@id='u_0_b']/div[2]/a").click();
driver.findElementByXPath(".//*[@id='u_0_6']").click();
driver.findElementByXPath(".//*[@id='u_0_8']/p/a[1]").click();
driver.findElementByXPath(".//*[@id='u_0_8']/p/a[2]").click();
driver.findElementByXPath(".//*[@id='u_0_8']/p/a[3]").click();
driver.findElementByXPath(".//*[@id='u_0_9']").click();
}
