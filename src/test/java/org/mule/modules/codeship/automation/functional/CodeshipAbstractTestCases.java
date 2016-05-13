/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.codeship.automation.functional;

import org.junit.Before;
import org.mule.modules.codeship.CodeshipConnector;
import org.mule.modules.codeship.bean.ListOfProjectsGetResponse;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;
import org.mule.tools.devkit.ctf.mockup.ConnectorDispatcher;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

public abstract class CodeshipAbstractTestCases extends
		AbstractTestCase<CodeshipConnector> {

	private CodeshipConnector connector;
	private ConnectorDispatcher<CodeshipConnector> dispatcher;

	public CodeshipAbstractTestCases(Class<CodeshipConnector> connector) {
		 super(connector);
	}

	protected CodeshipConnector getConnector() {
		return connector;
	}

	protected ConnectorDispatcher<CodeshipConnector> getDispatcher() {
		return dispatcher;
	}

	@SuppressWarnings("deprecation")
	@Before
	public void init() throws Exception {

		// Initialization for single-test run
		ConnectorTestContext.initialize(CodeshipConnector.class, false);

		// Context instance
		ConnectorTestContext<CodeshipConnector> context = ConnectorTestContext
				.getInstance(CodeshipConnector.class);

		// Connector dispatcher
		dispatcher = context.getConnectorDispatcher();

		connector = dispatcher.createMockup();

	}
	
	public ListOfProjectsGetResponse getProjectList(){
	  
	  ListOfProjectsGetResponse listOfProjects = getConnector().getListOfProjects();
	  return listOfProjects;
	}
	
	

}
