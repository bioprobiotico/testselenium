package voiceselenium;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class voicetest {
    public WebDriver driver;
    static By acceptCookiesLocator = By.id("onetrust-accept-btn-handler");
    static By mainPageLocator = By.xpath("/html/body/div[1]/div/div/div[1]/a");
    static By voiceModForPCLocator = By.cssSelector("a[href='https://www.voicemod.net/free-voice-changer-software/']");
    static By voiceModSoundboardLocator = By.cssSelector("a[href='https://www.voicemod.net/soundboard/']");
    static By voiceModVoicelabLocator = By.cssSelector("a[href='https://www.voicemod.net/voicelab/']");
    static By voiceModFAQLocator = By.cssSelector("a[href='https://support.voicemod.net/hc/en-us']");
    static By voiceModForMacLocator = By.cssSelector("a[href='https://www.voicemod.net/voice-changer-for-mac/']");
    static By accountPageLocator = By.cssSelector("a[href='https://account.voicemod.net/#/?action=account']");
    //   static By accountPageLocator = By.xpath("/html/body/div[1]/div/div/div[2]/ul/li[5]/a");

    @Before
    public void startBrowser() throws InterruptedException{
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.voicemod.net/");
        Thread.sleep(9000);
        driver.findElement(acceptCookiesLocator).click();
    }

        @Test
        public void voicemodForMacOrPc() throws InterruptedException {
            //voicemod for mac and pc
            driver = new FirefoxDriver();
            driver.get("https://www.voicemod.net/");
            Thread.sleep(9000);
            driver.findElement(acceptCookiesLocator).click();
            Thread.sleep(4000);
            driver.findElement(voiceModForPCLocator).click();
            driver.navigate().back();
            driver.findElement(voiceModForMacLocator).click();
        }
         @Test
        public void headerNavigationAccount() throws InterruptedException{
        // header navigation - for pc is not located because we covered in the previous step
             driver = new FirefoxDriver();
             driver.get("https://www.voicemod.net/");
             Thread.sleep(9000);
             driver.findElement(acceptCookiesLocator).click();
             Thread.sleep(4000);
             driver.findElement(accountPageLocator).click();
                 for(String winHandle : driver.getWindowHandles()){
                 driver.switchTo().window(winHandle);
                 }
            Thread.sleep(3000);
            String actualAccountUrl = driver.getCurrentUrl();
            String expectedAccountUrl = "https://account.voicemod.net/#/?action=account";
            Assert.assertEquals(expectedAccountUrl, actualAccountUrl);
            System.out.println("account page check passed");
            driver.close();
            driver.quit();
             }
         //Soundboard
    @Test
    public void headerNavigationSoundboard() throws InterruptedException{
        driver = new FirefoxDriver();
        driver.get("https://www.voicemod.net/");
        Thread.sleep(9000);
        driver.findElement(acceptCookiesLocator).click();
        Thread.sleep(4000);
        driver.findElement(voiceModSoundboardLocator).click();
        String actualSoundboardUrl = driver.getCurrentUrl();
        String expectedSoundboardUrl = "https://www.voicemod.net/soundboard/";
        Assert.assertEquals(expectedSoundboardUrl, actualSoundboardUrl);
        System.out.println("soundboard page check passed");
        driver.quit();
    }
    //Voicemod
    @Test
    public void headerNavigationVoicemod() throws InterruptedException{
        driver = new FirefoxDriver();
        driver.get("https://www.voicemod.net/");
        Thread.sleep(9000);
        driver.findElement(acceptCookiesLocator).click();
        Thread.sleep(4000);
        driver.findElement(voiceModVoicelabLocator).click();
        String actualVoiceLabUrl = driver.getCurrentUrl();
        String expectedVoiceLabUrl = "https://www.voicemod.net/voicelab/";
        Assert.assertEquals(expectedVoiceLabUrl, actualVoiceLabUrl);
        System.out.println("voicelab page check passed");
        driver.quit();
    }
        //FAQ
        @Test
        public void headerNavigationFAQ() throws InterruptedException{
            // header navigation - for pc is not located because we covered in the previous step
            driver = new FirefoxDriver();
            driver.get("https://www.voicemod.net/");
            Thread.sleep(9000);
            driver.findElement(acceptCookiesLocator).click();
            Thread.sleep(4000);
             driver.findElement(voiceModFAQLocator).click();
                for(String winHandle : driver.getWindowHandles()){
                    driver.switchTo().window(winHandle);
                }
            Thread.sleep(3000);
            String actualFAQUrl = driver.getCurrentUrl();
            String expectedFAQUrl = "https://support.voicemod.net/hc/en-us";
            Assert.assertEquals(expectedFAQUrl, actualFAQUrl);
            System.out.println("support page check passed");
            driver.close();
            driver.quit();
    }
}


