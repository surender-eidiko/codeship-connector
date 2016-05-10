/**
 *
 */
package org.mule.modules.codeship.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.codeship.CodeshipConnector;
import org.mule.modules.codeship.automation.functional.GetListOfOfProjectsTestCases;
import org.mule.modules.codeship.automation.functional.GetProjectByIdTestCases;
import org.mule.modules.codeship.automation.functional.GetRestartBuildIdDetailsTestCases;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

/*@RunWith(Categories.class)
 @IncludeCategory(FunctionalTestSuite.class)*/
@RunWith(Suite.class)
@SuiteClasses({

		GetProjectByIdTestCases.class,
		GetListOfOfProjectsTestCases.class, GetRestartBuildIdDetailsTestCases.class
})
public class FunctionalTestSuite {

	@BeforeClass
	public static void initialiseSuite() {

		ConnectorTestContext.initialize(CodeshipConnector.class);

	}

	@AfterClass
	public static void shutdownSuite() {

		ConnectorTestContext.shutDown();

	}

}
