package org.mule.modules.codeship.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.codeship.CodeshipConnector;
import org.mule.modules.codeship.automation.runner.FunctionalTestSuite;
import org.mule.modules.codeship.bean.BuildIdGetResponse;
import org.mule.modules.codeship.bean.ProjectIdGetResponse;

public class GetRestartBuildIdDetailsTestCases extends
		CodeShipAbstractTestCases {

	public GetRestartBuildIdDetailsTestCases(Class<CodeshipConnector> connector) {
		super(connector);
	}

	@Test
	@Category({FunctionalTestSuite.class})
	public void testRestartBuildIdDetails() {
		String buildId = "14559005";
		BuildIdGetResponse buildData = getConnector().restartBuildById(buildId);
		assertNotNull(buildData);
		 assertEquals("200", buildData.getStatusCode() );
		 

	}
}
