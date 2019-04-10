package PageObjectModel;

import org.openqa.selenium.By;

public class Gmailpage {
	
	
     public By username=By.id("identifierId");
     
     public By next=By.xpath("//span[contains(text(),'Next')]");
     
     public By password=By.name("password");
   //span[contains(text(),'Next')]
     public By signin=By.xpath("//span[contains(text(),'Next')]");
   //div[contains(text(),'Compose')]
     public By compose=By.xpath("//div[contains(text(),'Compose')]");
   //textarea[@aria-label='To']
     public By to=By.xpath("//textarea[@aria-label='To']");
   //input[@name='subjectbox']
     public By subject=By.xpath("//input[@name='subjectbox']");
   //div[contains(text(),'Send')]
     public By send=By.xpath("//div[contains(text(),'Send')]");
   //span[@aria-hidden='true']
     
     public By account=By.xpath("//span[@aria-hidden='true']");
     
     public By signout=By.linkText("Sign out");
     
}
