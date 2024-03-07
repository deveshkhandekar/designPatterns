package com.test.factory.platform;

import com.test.factory.factory.AndroidUIComponentFactory;
import com.test.factory.factory.UIComponentFactory;

public class Android extends Platform {

	public Android(String p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	public Android() {
		
	}

	@Override
	public UIComponentFactory createUIComponentFactory() {
		// TODO Auto-generated method stub
		return new AndroidUIComponentFactory();
	}

}
