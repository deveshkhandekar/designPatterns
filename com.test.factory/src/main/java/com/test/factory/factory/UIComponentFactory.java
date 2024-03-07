package com.test.factory.factory;

import com.test.factory.components.button.Button;
import com.test.factory.components.dropdown.Dropdown;
import com.test.factory.components.menu.Menu;

public interface UIComponentFactory {
	public Menu createMenu();
	
	public Dropdown createDropdown();
	
	public Button createButton();
}
