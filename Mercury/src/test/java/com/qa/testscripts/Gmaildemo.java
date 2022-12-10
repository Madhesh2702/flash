package com.qa.testscripts;

import org.testng.annotations.Test;

import com.qa.pages.MercuryPages;

public class Gmaildemo extends Testbase {
	
MercuryPages mtest;
@Test
public void login() {
	mtest=new MercuryPages(Driver);
	System.out.print(Driver.getTitle());
}
}
