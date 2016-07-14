/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.codeship.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.codeship.CodeshipConnector;
import org.mule.modules.codeship.automation.runner.FunctionalTestSuite;
import org.mule.modules.codeship.bean.ListOfProjectsGetResponse;
import org.mule.modules.codeship.bean.Projects;

public class GetProjectByIdTestCases extends CodeshipAbstractTestCases {

	public GetProjectByIdTestCases() {
	  super(CodeshipConnector.class);
	}

	@Test
	@Category({FunctionalTestSuite.class})
	public void testGetProjectById() {
		//String projectId = "150773";
		ListOfProjectsGetResponse listOfProjects = getProjectList();
		if(listOfProjects.getProjects().length >0 ){
		  Projects projects = listOfProjects.getProjects()[0];
		  String projectId =  projects.getId();
		  Projects project = getConnector().getProjectById(projectId,null);
		  assertNotNull(project);
		  assertEquals("200", project.getStatusCode() );
		}
		 

	}
}
