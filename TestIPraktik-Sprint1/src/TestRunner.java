import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {
        Result result = JUnitCore.runClasses(Matfröjd1.class);
        System.out.println("Result Successful: " + result.wasSuccessful());

        /*for (
                Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }*/
    }
    }
