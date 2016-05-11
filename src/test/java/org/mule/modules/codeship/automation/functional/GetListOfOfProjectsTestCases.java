/**
 *
 */
package org.mule.modules.codeship.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.codeship.CodeshipConnector;
import org.mule.modules.codeship.automation.runner.FunctionalTestSuite;
import org.mule.modules.codeship.bean.ListOfProjectsGetResponse;

public class GetListOfOfProjectsTestCases extends CodeShipAbstractTestCases{

	public GetListOfOfProjectsTestCases() {
		super(CodeshipConnector.class);
	}

	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetListOfProjects()
	{
		ListOfProjectsGetResponse listOfProjects = getProjectList();
		assertNotNull(listOfProjects);
	    assertEquals("200", listOfProjects.getStatusCode() );
	    
	   
	}
}
