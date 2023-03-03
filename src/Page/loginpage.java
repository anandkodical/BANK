package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class loginpage {
	public WebDriver driver;
	public loginpage (WebDriver driver) 
	{
		this.driver=driver;
	}
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/div[1]/button[@class=\"btn btn-primary btn-lg\"]") WebElement cust;
	@FindBy(id="userSelect") WebElement user;
	@FindBy(xpath="/html/body/div/div/div[2]/div/form/button[@type=\"submit\"]") WebElement login;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[3]/button[2][@class=\"btn btn-lg tab\"]") WebElement dep;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[4]/div/form/div/input[@class=\"form-control ng-pristine ng-untouched ng-invalid ng-invalid-required\"]") WebElement depamt;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[4]/div/form/button[@type=\"submit\"]") WebElement deposite;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[3]/button[1][@class=\"btn btn-lg tab\"]") WebElement trans;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/button[2][@ng-show=\"showDate\"]") WebElement reset;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/button[1][@class=\"btn\"]") WebElement back;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[3]/button[3][@ng-class=\"btnClass3\"]") WebElement withdrawbtn;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[4]/div/form/div/input[@ng-model=\"amount\"]") WebElement withdrawamt;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[4]/div/form/button[@type=\"submit\"]") WebElement withdrawconfirm;
	@FindBy(id="accountSelect") WebElement accselect;
	@FindBy(xpath="/html/body/div/div/div[1]/button[2][@class=\"btn logout\"]") WebElement logout;
	@FindBy(xpath="/html/body/div/div/div[1]/button[1][@ng-click=\"home()\"]") WebElement home;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/div[2]/button[@ng-click=\"manager()\"]") WebElement bankmngr;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/button[1][@class=\"btn btn-lg tab\"]") WebElement addcust_btn;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div/div/form/button[@class=\"btn btn-default\"]") WebElement add_cust_btn;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input[@ng-model=\"fName\"]") WebElement fn;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input[@ng-model=\"lName\"]") WebElement ln;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input[@ng-model=\"postCd\"]") WebElement pc;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/button[2][@ng-click=\"openAccount()\"]") WebElement openac;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/select[@id=\"userSelect\"]") WebElement cust_name;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/select[@id=\"currency\"]") WebElement currency;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div/div/form/button[@type=\"submit\"]") WebElement process;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/button[3][@ng-click=\"showCust()\"]") WebElement custpage;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div[@class=\"marTop ng-scope\"]") WebElement scrol;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input[@ng-model=\"searchCustomer\"]") WebElement searchtab;
	//@FindBy(className="form-control ng-valid ng-touched ng-dirty ng-valid-parse") WebElement searchtab;
	//@FindBy(css="input.form-control ng-valid ng-touched ng-dirty ng-valid-parse") WebElement ss1;
	
	
	public void cust() {
		Actions s1_cust=new Actions(driver);
		s1_cust.click(cust).build().perform();
		System.out.println("Browser opened");
		
	}
	public void user(int x) {
		Select s2=new Select(user);
		s2.selectByIndex(x);
		System.out.println("User selected");
	}
	public void login() {
		Actions s3=new Actions(driver);
		s3.click(login).build().perform();
	}
	public void transaction() {
		Actions t1=new Actions(driver);
		t1.click(trans).build().perform();
		System.out.println("Transaction page opened");
		}
	public void reset() {
		Actions t2=new Actions(driver);
		t2.click(reset).build().perform();
		System.out.println("Clicked reset button in Transaction page");
	}
	public void back() {
		Actions r1=new Actions(driver);
		r1.click(back).build().perform();
		System.out.println("Returned back to main page");
	}
	
	public void dep() {
		Actions s4=new Actions(driver);
		s4.click(dep).build().perform();
		System.out.println("Clicked on Deposite tab");
	}
	public void depamt() {
		depamt.sendKeys("4578");
		System.out.println("Entered deposite amount for default account");
		Actions deposite1=new Actions(driver);
		deposite1.click(deposite).build().perform();
	}
	public void depamt2() {
		depamt.sendKeys("4589");
		System.out.println("Entered deposite amount second account");
		Actions deposite1=new Actions(driver);
		deposite1.click(deposite).build().perform();
	}
	public void depamt3() {
		depamt.sendKeys("1458");
		System.out.println("Entered deposite amount for third account");
		Actions deposite1=new Actions(driver);
		deposite1.click(deposite).build().perform();
	}
	public void trans() {
		Actions trans1=new Actions(driver);
		trans1.click(trans).build().perform();
		System.out.println("Transaction page updated.");
	}
	public void back1() {
		Actions r1=new Actions(driver);
		r1.click(back).build().perform();
		System.out.println("Back to main window");
	}
	public void withdraw() {
		Actions w1=new Actions(driver);
		w1.click(withdrawbtn).build().perform();
		System.out.println("Clicked on withdrawal tab");
	}
	public void withdrawamount() {
		withdrawamt.sendKeys("452");
		System.out.println("Entered withdrawal amount for default account");
		Actions w3=new Actions(driver);
		w3.click(withdrawconfirm).build().perform();
	}
	public void withdrawamount2() {
		withdrawamt.sendKeys("1489");
		System.out.println("Entered withdrawal amount for second account");
		Actions w3=new Actions(driver);
		w3.click(withdrawconfirm).build().perform();
	}
	public void withdrawamount3() {
		withdrawamt.sendKeys("4584");
		System.out.println("Entered withdrawal amount for third account");
		Actions w3=new Actions(driver);
		w3.click(withdrawconfirm).build().perform();
	}
	public void accselect(int x) {
		//x=1;
		Select accno=new Select(accselect);
		accno.selectByIndex(x);
		System.out.println("Second account selected");
	}
	public void logout() {
		Actions l1=new Actions(driver);
		l1.click(logout).build().perform();
		System.out.println("customer testing completed");
	}
	
	//manager login page
	public void home() {
		Actions h1=new Actions(driver);
		h1.click(home).build().perform();
		System.out.println("Redirected to Bank Manager Login page");
	}	
	public void bankmngr() {
		Actions b1=new Actions(driver);
		b1.click(bankmngr).build().perform();
		System.out.println("Clicked Bank Manager Login button");
	}	
	public void addcust_btn() {
		Actions b1=new Actions(driver);
		b1.click(addcust_btn).build().perform();
		System.out.println("Add customer tab clicked");
	}
	public void fname() {
		Actions fn1=new Actions(driver);
		fn1.click(fn).sendKeys("Ananda").build().perform();	
	}
	public void lname() {
		Actions ln1=new Actions(driver);
		ln1.click(ln).sendKeys("K").build().perform();
	}
	public void pcode() {
		Actions pc1=new Actions(driver);
		pc1.click(pc).sendKeys("575001").build().perform();
		
	}
	public void addbtn() throws Exception {
		Actions add=new Actions(driver);
		add.click(add_cust_btn).build().perform();
		Thread.sleep(1500);
		driver.switchTo().alert().accept();
		Thread.sleep(1500);
		System.out.println("Customer added successfully");
	}
	public void openaccount() {
		Actions open1=new Actions(driver);
		open1.click(openac).build().perform();
		System.out.println("Clicked on Open Account tab");
		
	}
	public void addcust() {
		Select name=new Select(cust_name);
		name.selectByIndex(6);
		System.out.println("Customer selected from dropdown successfully");
	}
	public void currency(int x) throws Exception {
		Select curr=new Select(currency);
		curr.selectByIndex(x);
		process.submit();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("Selected currency and accepted the alert message");
	}
	public void custpagescroll() throws Exception {
		Actions c1=new Actions(driver);
		c1.click(custpage).build().perform();
		System.out.println("Customer tab clicked");
		Thread.sleep(1000);
		//JavascriptExecutor js=((JavascriptExecutor)driver);
		//js.executeScript("scrollBy(0,1200)");
		//Thread.sleep(1000);
		//System.out.println("scrolled down");
	}
	public void search() throws Exception {
		Actions tab=new Actions(driver);
		tab.click(searchtab).build().perform();
		Thread.sleep(1000);
		tab.sendKeys("Anan");
		System.out.println("Customer searched successfully");
	}
	
}
