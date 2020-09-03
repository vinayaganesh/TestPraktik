import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Matfröjd1 {
    static WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void startBrowser(){
        System.out.println("Before Class -- Starting the browser");
    }

    @Before
    public void home(){
        System.out.println("Before-- Going Home");
        // homeButton.click();
        driver.get("https://www.matfrojd.com/?dev");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actual=driver.getTitle();
        String expected= "Matfröjd";
        Assert.assertEquals(actual,expected);
        System.out.println("Assert Passed");
    }

    @Test
    /*public void userStory1(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(text(),'Recept')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'sängkantsmeny')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }*/
    public void userStory1() throws InterruptedException {
        System.out.println("As a foodie I want to Select desired recipe in the Recipe and select Variera & Laga Mat to get the full details about the recipe");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[contains(text(),'Recept')]")).click();
        driver.findElement(By.xpath("//div[@class='rn-1awozwy rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-ifefl9 rn-bcqeeo rn-wk8lta rn-9aemit rn-gy4na3 rn-k8qxaj rn-bnwqim rn-1lgpqti']//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//img[1]")).click();
        driver.findElement(By.xpath("//div[@class='rn-1awozwy rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-ifefl9 rn-bcqeeo rn-wk8lta rn-9aemit rn-gy4na3 rn-k8qxaj rn-bnwqim rn-1lgpqti']//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//img[1]")).click();
        driver.findElement(By.xpath("//div[@class='rn-1awozwy rn-128x6j9 rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-1loqt21 rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-uvuy5l rn-1777fci rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-r2y082 rn-ifefl9 rn-1dfn399 rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bnwqim rn-1otgn73 rn-lrvibr rn-1lgpqti']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Klar')]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='rn-1awozwy rn-4xf99a rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-1loqt21 rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-uvuy5l rn-1777fci rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-r2y082 rn-ifefl9 rn-1dfn399 rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bnwqim rn-1otgn73 rn-lrvibr rn-1lgpqti']")).click();
        driver.findElement(By.xpath("//div[@class='rn-1oszu61 rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-61z16t rn-p1pxzi rn-11wrixw rn-156q2ks rn-ifefl9 rn-bcqeeo rn-1qxgc49 rn-ry3cjt rn-19yat4t rn-1yt7n81 rn-bnwqim rn-1lgpqti']//div[1]//div[1]//div[1]//div[1]//div[1]//img[1]")).click();


        driver.findElement(By.xpath("//body//div[@class='rn-1oszu61 rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-ifefl9 rn-bcqeeo rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bnwqim rn-1lgpqti']//div[@class='rn-1oszu61 rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-6koalj rn-1qe8dj5 rn-1mlwlqe rn-eqz5dr rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-ifefl9 rn-bcqeeo rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bnwqim rn-1lgpqti']//div[2]//div[1]//div[1]//div[1]//div[1]//img[1]")).click();
        driver.findElement(By.xpath("//div[@class='rn-1oszu61 rn-1efd50x rn-14skgim rn-rull8r rn-mm0ijv rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-6koalj rn-16y2uox rn-1wbh5a2 rn-1ro0kt6 rn-eqz5dr rn-61z16t rn-p1pxzi rn-11wrixw rn-1lxl8vk rn-ifefl9 rn-bcqeeo rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bnwqim rn-1lgpqti']//div[3]//div[1]//div[1]//div[1]//div[1]//img[1]")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-jwli3a rn-1471scf rn-14xgk7a rn-h1js2l rn-o11vmf rn-ebii48 rn-gul640 rn-t9a87b rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bauka4 rn-q42fyq rn-qvutc0']")).click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
}
