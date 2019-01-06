package main.Runners;

import io.testproject.java.classes.DriverSettings;
import io.testproject.java.enums.DriverType;
import io.testproject.java.sdk.v2.Runner;
import io.testproject.java.sdk.v2.drivers.WebDriver;
import main.TestCases.LoginTestCase;

public class LoginTestCaseRunner {

    private final static String devToken = "kNfpUCmY_3Gg_reU2mfsBgRTAq3XizjJDpiQReY813E1";
    private final static String URL = "http://eaapp.somee.com/";

    public static void main(String[] args) throws Exception {

        DriverSettings driverSettings = new DriverSettings(DriverType.Chrome);
        try (Runner runner = new Runner(devToken, driverSettings)) {

            LoginTestCase loginTestCase = new LoginTestCase();
            WebDriver driver = runner.getDriver(loginTestCase);
            LoginPage loginPage = new LoginPage(driver);

            // Call actual actions
            driver.navigate().to(URL);


            // Click login link
            loginPage.ClickLoginlink();

            // Enter login details
            loginPage.EnterLoginDetails("admin", "password");

            // Click login button
            loginPage.ClickLoginButton();

        } catch(Throwable e) {
            e.printStackTrace();
        }
    }

}
