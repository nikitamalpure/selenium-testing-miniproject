package newproject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class PG1 {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
		//String baseUrl = "http://google.com";
        String baseUrl = "https://www.snapdeal.com";
        String baseUrl1 = "https://www.snapdeal.com/products/digital-entertainment?sort=plrty";
        String baseUrl2 = "https://sellers.snapdeal.com/";
        String baseUrl3 = "https://sellers.snapdeal.com/ForgotPassword#/forgetPassword";
        String baseUrl4 = "https://www.snapdeal.com/products/digital-entertainment?sort=plrty";
        String baseUrl5 = "https://www.snapdeal.com/products/digital-entertainment?sort=plth";
        String baseUrl6 = "https://www.snapdeal.com/search?keyword=story%20books&santizedKeyword=school+bag&catId=0&categoryId=0&suggested=false&vertical=p&noOfResults=20&searchState=&clickSrc=go_header&lastKeyword=&prodCatId=&changeBackToAll=false&foundInAll=false&categoryIdSearched=&cityPageUrl=&categoryUrl=&url=&utmContent=&dealDetail=&sort=rlvncy";
        String baseUrl7 = "https://www.snapdeal.com/help";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        driver.get(baseUrl1);
        driver.get(baseUrl2);
        driver.get(baseUrl3);
        driver.get(baseUrl4);
        driver.get(baseUrl5);
        driver.get(baseUrl6);
        driver.get(baseUrl7);
        

        // get the actual value of the title
        actualTitle = driver.getTitle();
        
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Failed!");
        } else {
            System.out.println("Test Passed");
        }
       
        //close Fire fox
        driver.close();
       
    }

}