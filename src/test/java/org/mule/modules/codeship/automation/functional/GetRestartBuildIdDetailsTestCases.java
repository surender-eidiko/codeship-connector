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
import org.mule.modules.codeship.bean.BuildIdGetResponse;
import org.mule.modules.codeship.bean.Builds;
import org.mule.modules.codeship.bean.ListOfProjectsGetResponse;
import org.mule.modules.codeship.bean.Projects;

public class GetRestartBuildIdDetailsTestCases extends
		CodeshipAbstractTestCases {

	public GetRestartBuildIdDetailsTestCases() {
		super(CodeshipConnector.class);
	}

	@Test
	@Category({ FunctionalTestSuite.class })
	public void testRestartBuildIdDetails() {
		// String buildId = "14559005";
		ListOfProjectsGetResponse listOfProjects = getProjectList();
		if (listOfProjects.getProjects().length > 0) {
			Projects projects = listOfProjects.getProjects()[0];
			Builds[] builds = projects.getBuilds();
			if (builds.length > 0) {
				String buildId = builds[0].getId();
				BuildIdGetResponse buildData = getConnector().restartBuildById(
						buildId);
				assertNotNull(buildData);
				assertEquals("200", buildData.getStatusCode());
			}
		}

	}
}
