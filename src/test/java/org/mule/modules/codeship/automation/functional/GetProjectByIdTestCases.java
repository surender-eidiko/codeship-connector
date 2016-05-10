package org.mule.modules.codeship.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.codeship.CodeshipConnector;
import org.mule.modules.codeship.automation.runner.FunctionalTestSuite;
import org.mule.modules.codeship.bean.ProjectIdGetResponse;

public class GetProjectByIdTestCases extends CodeShipAbstractTestCases {

	public GetProjectByIdTestCases(Class<CodeshipConnector> connector) {
		super(connector);
	}

	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetProjectById() {
		String projectId = "150773";
		ProjectIdGetResponse project = getConnector().getProjectById(
				projectId);
		assertNotNull(project);
		 assertEquals("200", project.getStatusCode() );
		 

	}
}
