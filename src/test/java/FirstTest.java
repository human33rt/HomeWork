import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {




    public static class OpenBrowser {

        public static void main(String[] args) throws Exception {
            System.setProperty("webdriver.chrome.driver","C:/Users/Andrey/.IdeaIC2019.3/DriversForChrome/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://mishpahug.co.il/");
            Thread.sleep(5000);
            System.out.println("Hello World!");
            driver.close();
        }
    }




}
