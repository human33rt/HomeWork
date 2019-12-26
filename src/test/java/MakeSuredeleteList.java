import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeSuredeleteList {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","C:/Users/Andrey/.IdeaIC2019.3/DriversForChrome/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://trello.com/");
            driver.manage().window().fullscreen();
            Thread.sleep(5000);

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
            driver.findElement(By.id("password")).sendKeys("TRACK611");
            driver.findElement(By.id("login-submit")).click();
            Thread.sleep(30000);
            driver.findElement(By.xpath("//body/div[@id='trello-root']/div[@id='chrome-container']/div[@class='BfrybzRYI4wt4w']/div[@id='surface']/main[@id='content-boundary']/div[@id='content']/div[@class='member-boards-view']/div[@class='js-boards-page']/div[@class='js-react-root']/div/div[@class='home-container']/div[@class='home-sticky-container']/div[@class='all-boards']/div/div[@class='content-all-boards']/div[@class='boards-page-board-section mod-no-sidebar']/ul[@class='boards-page-board-section-list']/li[1]/a[1]/div[1]/div[1]/div[1]")).click();
            Thread.sleep(5000);
            driver.findElement(By.cssSelector(".placeholder")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector(".list-name-input")).sendKeys("New List");
            driver.findElement(By.xpath("//input[@type='submit']")).click();
            Thread.sleep(5000);







            driver.quit();
        }
    }


