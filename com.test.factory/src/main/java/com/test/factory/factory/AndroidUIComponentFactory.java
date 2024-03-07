package com.test.factory.factory;

import com.test.factory.components.button.AndriodButton;
import com.test.factory.components.button.Button;
import com.test.factory.components.dropdown.AndroidDropdown;
import com.test.factory.components.dropdown.Dropdown;
import com.test.factory.components.menu.AndroidMenu;
import com.test.factory.components.menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory{

	@Override
	public Menu createMenu() {
		// TODO Auto-generated method stub
		return new AndroidMenu();
	}

	@Override
	public Dropdown createDropdown() {
		// TODO Auto-generated method stub
		return new AndroidDropdown();
	}

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new AndriodButton();
	}

}
