package com.oneDayCart.testScript;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
public class Demo extends Base {
	@Test
	public void demo() {
		Assert.assertTrue(false);
	}
}
