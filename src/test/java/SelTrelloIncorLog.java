import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTrelloIncorLog {
    //public static class OpenBrowser {

public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:/Users/Andrey/.IdeaIC2019.3/DriversForChrome/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://trello.com/");
driver.manage().window().fullscreen();
Thread.sleep(5000);
//Login
WebElement loginIcon = driver.findElement(By.xpath("//a[@class='btn btn-sm btn-link text-white']"));
Thread.sleep(5000);
loginIcon.click();
WebElement userField = driver.findElement(By.id("user"));
userField.click();
userField.clear();
userField.sendKeys("okadr721@yandex.ru");
driver.findElement(By.id("login")).click();
Thread.sleep(5000);
driver.findElement(By.id("login-submit")).click();
Thread.sleep(3000);
driver.findElement(By.id("password")).sendKeys("TRACK61");
driver.findElement(By.id("login-submit")).click();
Thread.sleep(30000);
driver.quit();
}
}
