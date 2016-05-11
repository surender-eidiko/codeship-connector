/**
 *
 */
package org.mule.modules.codeship;

import java.util.Map;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.lifecycle.Start;
import org.mule.api.annotations.param.MetaDataKeyParam;
import org.mule.api.annotations.MetaDataScope;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.param.Default;
import org.mule.modules.codeship.bean.BuildIdGetResponse;
import org.mule.modules.codeship.bean.ListOfProjectsGetResponse;
import org.mule.modules.codeship.bean.Projects;
import org.mule.modules.codeship.config.ConnectorConfig;

/**
 * This is Codeship Connector Class
 * 
 * @author Surender
 *
 * 
 */

@Connector(name = "codeship", friendlyName = "Codeship", minMuleVersion = "3.7.2")
@MetaDataScope(DataSenseResolver.class)
public class CodeshipConnector {

	@Config
	ConnectorConfig config;

	private CodeshipClient client;

	@Start
	public void init() {
		setClient(new CodeshipClient(this));
	}

	/**
	 * DataSense processor
	 * 
	 * @param key Key to be used to populate the entity
	 * @param entity Map that represents the entity
	 * @return Some string
	 */
	@Processor
	public Map<String, Object> addEntity(@MetaDataKeyParam String key,
			@Default("#[payload]") Map<String, Object> entity) {
		/*
		 * USE THE KEY AND THE MAP TO DO SOMETHING
		 */
		return entity;
	}

	/**
	 * This method gets the List of available Projects
	 * 
	 * @return ListOfProgectsGetResponse object
	 */
	@Processor
	public ListOfProjectsGetResponse getListOfProjects() {
		return getClient().getListOfProjects();
	}

	/**
	 * This method Shows details of a project, by project ID.
	 * 
	 * @param projectId , Specify the project ID in the projectId parameter in the URI.<BR>
	 * @return ProjectIdGetResponse
	 */
	@Processor
	public Projects getProjectById(String projectId) {
		return getClient().getProjectById(projectId);
	}

	/**
	 * This method restarts a build, by build ID.
	 * 
	 * @param buildId , Specify the build ID in the buildId parameter in the URI.<BR>
	 * @return BuildIdGetResponse
	 */
	@Processor
	public BuildIdGetResponse restartBuildById(String buildId) {
		return getClient().restartBuildById(buildId);
	}

	/**
	 * @return ConnectorConfig Object
	 */
	public ConnectorConfig getConfig() {
		return config;
	}

	/**
	 * @param config
	 */
	public void setConfig(ConnectorConfig config) {
		this.config = config;
	}

	/**
	 * @return CodeshipClient Object
	 */
	public CodeshipClient getClient() {
		return client;
	}

	/**
	 * @param client
	 */
	public void setClient(CodeshipClient client) {
		this.client = client;
	}

}