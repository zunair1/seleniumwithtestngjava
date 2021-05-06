package MicroAccountingAutomation.Test;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;

import org.testng.TestNG;

public class acconutingmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		TestNG runner=new TestNG();

		// Create a list of String 
		List<String> suitefiles=new ArrayList<String>();

		// Add xml file which you have to execute
		suitefiles.add("C:\\Micro-Accounting\\SmokeTestNG.xml");

		// now set xml file for execution
		runner.setTestSuites(suitefiles);

		// finally execute the runner using run method
		runner.run();

}}
