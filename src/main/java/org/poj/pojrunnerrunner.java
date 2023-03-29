package org.poj;
import org.bas.BaseClass;

public class pojrunnerrunner extends BaseClass {
	public static void main(String[] args) {
		launchbrowser();
		windowsmaximize();
		launchurl("https://www.flipkart.com/");
		pojflip g=new pojflip();
		clickbutton(g.getX());
		clickbutton(g.getLogin());
		passtext("8754638244",g.getMno());
		clickbutton(g.getRotp());
	}

}
