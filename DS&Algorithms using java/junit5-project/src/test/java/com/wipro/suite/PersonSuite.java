package com.wipro.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
//@SelectPackages("com.wipro.model")
@SelectClasses({com.wipro.model.PersonTest.class,com.wipro.app.AppTest.class})
public class PersonSuite {
	
}
