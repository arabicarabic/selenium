package org.poj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static void main(String[] args) {

	}

	public static WebDriver driver;

	public static void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchurl(String url) {
		driver.get(url);
	}

	public static void windowsmaximize() {
		driver.manage().window().maximize();
	}

	public static void pagetitle() {
		driver.getTitle();

	}

	public static void passtext(String txt, WebElement ele) {
		ele.sendKeys(txt);
	}

	public static void closeentirebrowser() {
		driver.quit();
	}

	public static void geturl() {
		driver.getCurrentUrl();

	}

	public static void clickbutton(WebElement w) {
		w.click();
	}

	public static void closewebpage() {
		driver.close();
	}

	public static void screenshot(String imgname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location + image.jpj");
		FileUtils.copyFile(image, f);
	}

	public static Actions a;

	public static void moveTheCursor(WebElement targetelement) {
		a = new Actions(driver);
		a.moveToElement(targetelement).perform();
	}

	public static void dragdrop(WebElement dragelement, WebElement dropelement) {
		a = new Actions(driver);
		a.dragAndDrop(dragelement, dropelement).perform();
	}

	public static void doubleclick(WebElement target) {
		a = new Actions(driver);
		a.doubleClick(target).perform();
	}

	public static void contextclick(WebElement target) {
		a = new Actions(driver);
		a.contextClick(target);
	}

	public static void keyup(CharSequence key) {
		a = new Actions(driver);
		a.keyUp(key);
	}

	public static void keydown(CharSequence key) {
		a = new Actions(driver);
		a.keyDown(key);
	}

	public static void thread(int i) throws InterruptedException {
		Thread.sleep(i);
	}

	public static Robot r;

	public static void robotenterpress() throws AWTException

	{
		r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
	}

	public static void robotenterrelease(int enterrelease) throws AWTException {
		r = new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void robotdownpress(int downpress) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
	}

	public static void robotdownrelease(int downrelease) throws AWTException {
		r = new Robot();
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void robotctrlpress(int ctrlpress) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
	}

	public static void robotctrlrelease(int ctrlrelease) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
	}

	public static void robotcpress(int cpress) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_C);
	}

	public static void robotcrelease(int crelease) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_C);
	}

	public static void robotvpress(int vpress) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_V);
	}

	public static void robotvrelease(int vrelease) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_V);
	}

	public static void robotshiftpress(int shiftptess) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
	}

	public static void robotshiftrelease(int shiftrelease) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
	}

	public static void robotapress(int apress) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_A);
	}

	public static void robotarelease(int arelease) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_A);
	}

	public static void robottabpress(int tabpress) throws AWTException {
		r = new Robot();
		;
		r.keyPress(KeyEvent.VK_TAB);
	}

	public static void robottabrelease(int tabrelease) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
	}

	public static Alert a1;

	public static void switchtoalert() {
		a1 = driver.switchTo().alert();
	}

	public static void acceptbtn(WebElement ok) {
		a1 = driver.switchTo().alert();
		a1.accept();
	}

	public static void dissmissbtn(WebElement dismiss) {
		a1 = driver.switchTo().alert();
		a1.dismiss();
	}

	public static void gettext(WebElement accept) {
		accept.getText();
	}

	public static JavascriptExecutor js;

	public static void javascriptexecutorinsert(WebElement ref) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','s')", ref);

	}

	public static void javascriptexecutorclick(WebElement ref) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments{0].click()", ref);

	}

	public static void javascriptexecutorretrivethetext(WebElement ref) {

		js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].getAttribute('value')", ref);

	}

	public static void javascriptexecutorscrolldown(WebElement ref) {

		js = (JavascriptExecutor) driver;
		js.executeScript(" arguments[0].scrollIntoView(true)", ref);

	}

	public static void javascriptexecutorscrollup(WebElement ref) {

		js = (JavascriptExecutor) driver;
		js.executeScript(" arguments[0].scrollIntoView(false)", ref);
	}

	// frame
	public static void switchstringid(String id) {

		driver.switchTo().frame(id);
	}

	public static void switchstringname(String name) {

		driver.switchTo().frame(name);
	}

	public static void switchstringwebelement(WebElement e) {
		driver.switchTo().frame(e);
	}

	public static void switchtowindowstringurl(String url) {

		driver.get("url");

		driver.switchTo().window(url);
	}

	public static void switchwtoindowstringtitle(String title) {
		driver.get("url");

		driver.switchTo().window(title);
	}

	public static void switchwtoindowstringwindowsid(String windowsid) {
		driver.get("url");

		driver.switchTo().window(windowsid);
	}

	public static void datadriven(String s, int rownum, int cellnum) throws IOException {
		File f = new File("Excel location.xlxs");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet(s);
		Row r = sheet.getRow(rownum);
		Cell c = r.getCell(cellnum);
		int celltype = c.getCellType();
		String value = "";
		if (celltype == 1) {
			String value2 = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			java.util.Date dd = c.getDateCellValue();
			SimpleDateFormat sdf = new SimpleDateFormat(value);
			String value1 = sdf.format(dd);
		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			String valueof = String.valueOf(l);
		}
	}

	public static void createnewexcelfile(int rownum, int cellnum, String writedata) throws IOException {
		File f = new File("F:\\Base_Class\\excel\\createexcel.xlxs");

		Workbook wb = new XSSFWorkbook();
		Sheet s = wb.createSheet("details");
		Row r = s.createRow(rownum);
		Cell c = r.createCell(cellnum);

		c.setCellValue(writedata);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	public static void createnewrow(int crtrow, int crtcell, String newdata) throws IOException {
		File f = new File("F:\\Base_Class\\excel\\createrow.xlxs");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("data");
		Row r = s.createRow(crtrow);
		Cell c = r.createCell(crtcell);
		c.setCellValue(newdata);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	public static void createnewcell(int rowmum, int createcell, String newdata) throws IOException {
		File f = new File("F:\\Base_Class\\excel\\createcell.xlxs");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook();
		Sheet s = wb.getSheet("data");
		Row r = s.getRow(rowmum);
		Cell c = r.createCell(createcell);
		c.setCellValue(newdata);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	public static void updateparticularcellvalue(int gettherow, int getthecell, String writenewdata,
			String existingdata) throws IOException {
		File f = new File("F:\\Base_Class\\excel\\update.xlxs");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("data");
		Row r = s.getRow(gettherow);
		Cell c = r.getCell(getthecell);
		String str = c.getStringCellValue();
		if (str.equals(existingdata)) {
			c.setCellValue(writenewdata);
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

}
