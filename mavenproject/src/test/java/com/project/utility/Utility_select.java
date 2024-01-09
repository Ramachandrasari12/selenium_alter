package com.project.utility;

import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_select {
	public static void select_option(WebElement element,Object data) {
		Select selec=utility_object.select_object(element);
		if(data instanceof Integer) 
		{
			selec.selectByIndex(Integerdata);
		}
		else if (data Instanceof String)data){
			try {
				selec.selectByVisibleText((String)data);
			}
		}	
		}
		}
	}

}
