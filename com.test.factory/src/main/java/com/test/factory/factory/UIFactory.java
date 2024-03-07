package com.test.factory.factory;

public class UIFactory {
	public static UIComponentFactory createComponentFactoryByPlatform(String platform) {
		if(platform.equals("Android")) {
			return new AndroidUIComponentFactory();
		}
		else if(platform.equals("IOS")){
			return new IOSUIComponentFactory();
		}
		return null;
	}

}
