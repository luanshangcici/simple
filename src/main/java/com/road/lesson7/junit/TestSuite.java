package com.road.lesson7.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestJunit.class,
	TestJunit2.class
})
public class TestSuite {

}
