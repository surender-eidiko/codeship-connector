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
import org.mule.modules.codeship.bean.ListOfProgectsGetResponse;
import org.mule.modules.codeship.bean.ProjectIdGetResponse;
import org.mule.modules.codeship.bean.Projects;

public class GetProjectByIdTestCases extends CodeShipAbstractTestCases {

	public GetProjectByIdTestCases() {
	  super(CodeshipConnector.class);
	}

	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetProjectById() {
		//String projectId = "150773";
		ListOfProgectsGetResponse listOfProjects = getProjectList();
		if(listOfProjects.getProjects().length >0 ){
		  Projects projects = listOfProjects.getProjects()[0];
		  String projectId =  projects.getId();
		ProjectIdGetResponse project = getConnector().getProjectById(
				projectId);
		assertNotNull(project);
		 assertEquals("200", project.getStatusCode() );
		}
		 

	}
}
