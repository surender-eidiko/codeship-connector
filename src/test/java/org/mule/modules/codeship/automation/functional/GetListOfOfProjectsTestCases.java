package org.mule.modules.codeship.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.codeship.CodeshipConnector;
import org.mule.modules.codeship.automation.runner.FunctionalTestSuite;
import org.mule.modules.codeship.bean.ListOfProgectsGetResponse;

public class GetListOfOfProjectsTestCases extends CodeShipAbstractTestCases{

	public GetListOfOfProjectsTestCases(Class<CodeshipConnector> connector) {
		super(connector);
	}

	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetListOfProjects()
	{
		ListOfProgectsGetResponse listOfProjects = getConnector().getListOfProjects();
		assertNotNull(listOfProjects);
	    assertEquals("200", listOfProjects.getStatusCode() );
	    
	   
	}
}
