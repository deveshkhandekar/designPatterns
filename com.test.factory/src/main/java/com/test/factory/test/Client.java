package com.test.factory.test;

import com.test.factory.components.button.Button;
import com.test.factory.components.dropdown.Dropdown;
import com.test.factory.components.menu.Menu;
import com.test.factory.factory.UIComponentFactory;
import com.test.factory.platform.Android;
import com.test.factory.platform.Platform;

public class Client {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//IMPL-1
		//Direct Classes were given so we were able to use runtime polymorphism
		Platform p = new Android(); 
		UIComponentFactory uiComponentFactory = p.createUIComponentFactory();
		Button button2 = uiComponentFactory.createButton();
		Dropdown dropdown2 = uiComponentFactory.createDropdown();
		Menu menu2 = uiComponentFactory.createMenu();
		// As we can see there is no need of if-else directly call the method gives
		// Android or IOS components
		
		
		//IMPL-2
		Platform p1 = new Platform("Android"); // This is when you dont have Android & IOS class created
		UIComponentFactory uiComponentFactory2 = p1.createUIComponentFactory();
		Button button = uiComponentFactory2.createButton();
		Dropdown dropdown = uiComponentFactory2.createDropdown();
		Menu menu = uiComponentFactory2.createMenu();

	}
}
