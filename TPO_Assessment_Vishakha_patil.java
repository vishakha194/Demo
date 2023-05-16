1. UI Automation 


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAAssessment {

public static void main(String[] args) 
{

WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();    //launching the chrome driver

String URL= "https://www.amazon.com/"; 
             
driver.get(URL);               // Launch URL
driver.manage().window().maximize(); 

Thread.sleep(2000);                     //waiting for the window to get maximize

WebElement ele = driver.findElement(By.id("twotabsearchtextbox").sendkeys("Iphone");                         //Entering "Iphone" in search bar

WebElement ele1 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();       // Clicking on the search button

Thread.sleep(2000);                                                                                         

WebElement first_result= driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")); //Verifying the first result                                             

String first_result_text=first_result.getText();                
                                                                      

if(first_result_text.contains("Apple iphone"))  //Verify the correct Product is displaying after search
{
System.out.println("Apple iphone appears in search and test case is passed");
}
else{
System.out.println("Apple iphone appears in search and test case is Failed");
}


driver.close();                                                        //Close the browser

}
}

##############################################################################################################

#API Automation
// Please find below Postman code collection for API 

POST : https://jsonplaceholder.typicode.com/posts
pm.test("Status test", function () {
    pm.response.to.have.status(201);
});

GET : https://jsonplaceholder.typicode.com
pm.test("Status test", function () {
    pm.response.to.have.status(200);
});

PUT : https://jsonplaceholder.typicode.com/posts/1
pm.test("Status test", function () {
    pm.response.to.have.status(200);
});

DELETE : https://jsonplaceholder.typicode.com/posts/1
pm.test("Status test", function () {
    pm.response.to.have.status(200);
});


//Please find API Automation code 

const axios = require('axios');

function assertSuccessfulResponse() {
  const url = 'https://jsonplaceholder.typicode.com/'; // Replace with your API endpoint

  axios.get(url)
    .then(response => {
      console.log('API response is successful!');
    })
    .catch(error => {
      if (error.response) {
        console.log(`API request failed with status code: ${error.response.status}`);
        console.log(`Error message: ${error.message}`);
      } else {
        console.log('An error occurred during the API request.');
        console.log(`Error message: ${error.message}`);
      }
    });
}

// Call the function to assert the successful response
assertSuccessfulResponse();