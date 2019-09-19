package org.base.snap;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebElement;

public class Snapdeal extends Base {
	public static void main(String[] args) throws IOException, InterruptedException {
		wedrivercalling();
	webpage("https://www.snapdeal.com/");
	td(2000);
	scrsht("C:\\Users\\Rajasekar\\Desktop\\number programs\\Snapdealpayment\\screenshot pictures\\p1.png");
	WebElement lp = lxpath("//input[@id='inputValEnter']");
	
	btnclick(lp);
	lp.sendKeys(getdata(0, 0));
	td(2000);
	scrsht("C:\\Users\\Rajasekar\\Desktop\\number programs\\Snapdealpayment\\screenshot pictures\\p2.png");
	
	WebElement lp1 = lxpath("//button[@class='searchformButton col-xs-4 rippleGrey']");
	btnclick(lp1);
	WebElement lp2 = lxpath("//p[@class='product-title ']");
	td(1000);
	scrsht("C:\\Users\\Rajasekar\\Desktop\\number programs\\Snapdealpayment\\screenshot pictures\\p3.png");
	btnclick(lp2);
	String pwind = pwind();
	Set<String> allwind = allwind();
	for (String x : allwind) {
		if (!pwind.equals(x)) {
			driver.switchTo().window(x);
		}}
	WebElement lp3 = lxpath("//div[@class='col-xs-6 marR15 btn btn-xl btn-theme-secondary rippleWhite buyLink']");
	td(2000);
	scrsht("C:\\Users\\Rajasekar\\Desktop\\number programs\\Snapdealpayment\\screenshot pictures\\p4.png");
	btnclick(lp3);
	WebElement lp4 = lxpath("//div[@class='cartInner']");
	btnclick(lp4);
	td(2000);
	scrsht("C:\\Users\\Rajasekar\\Desktop\\number programs\\Snapdealpayment\\screenshot pictures\\p5.png");
	WebElement lp5 = lxpath("//div[@class='styledSelect sd-icon-expand-arrow item-quantity customized']");
	btnclick(lp5);
	Thread.sleep(2000);
	WebElement lp6 = lxpath("(//li[@class='undefined'])[1]");
	btnclick(lp6);
	td(1000);
	scrsht("C:\\Users\\Rajasekar\\Desktop\\number programs\\Snapdealpayment\\screenshot pictures\\p6.png");
	q();
	
	
	}

	

}
