package com.test.factory.platform;

import com.test.factory.factory.IOSUIComponentFactory;
import com.test.factory.factory.UIComponentFactory;

public class IOS extends Platform {

	public IOS(String p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	public IOS() {
		
	}

	@Override
	public UIComponentFactory createUIComponentFactory() {
		// TODO Auto-generated method stub
		return new IOSUIComponentFactory();
	}

}
