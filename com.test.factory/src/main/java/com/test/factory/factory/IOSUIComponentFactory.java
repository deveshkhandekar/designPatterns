package com.test.factory.factory;

import com.test.factory.components.button.Button;
import com.test.factory.components.button.IOSButton;
import com.test.factory.components.dropdown.Dropdown;
import com.test.factory.components.dropdown.IOSDropdown;
import com.test.factory.components.menu.IOSMenu;
import com.test.factory.components.menu.Menu;

public class IOSUIComponentFactory implements UIComponentFactory{

	@Override
	public Menu createMenu() {
		// TODO Auto-generated method stub
		return new IOSMenu();
	}

	@Override
	public Dropdown createDropdown() {
		// TODO Auto-generated method stub
		return new IOSDropdown();
	}

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new IOSButton();
	}

}
