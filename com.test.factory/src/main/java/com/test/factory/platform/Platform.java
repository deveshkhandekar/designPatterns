package com.test.factory.platform;

import com.test.factory.factory.UIComponentFactory;
import com.test.factory.factory.UIFactory;

public class Platform {

	private String p;
	
	public Platform() {
	}
	
	public Platform(String p) {
		super();
		this.p = p;
	}

	public void setTheme() {
		System.out.println("Theme is set");
	}
	
	public void setRefreshRate() {
		System.out.println("Refresh rate is set");
	}
	
	public UIComponentFactory createUIComponentFactory() {
		return null;
	}
	
	//You dont have to add it here we can segregate if-else in a diff class
	public UIComponentFactory createFactory() {
//		if(this.p.equals("Android")) {
//			return new AndroidUIComponentFactory();
//		}
//		else if(this.p.equals("IOS")){
//			return new IOSUIComponentFactory();
//		}
		return UIFactory.createComponentFactoryByPlatform(this.p);
	}
}
