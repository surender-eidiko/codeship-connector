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
import org.mule.modules.codeship.bean.ListOfProgectsGetResponse;
import org.mule.modules.codeship.bean.ProjectIdGetResponse;
import org.mule.modules.codeship.config.ConnectorConfig;



@Connector(name="codeship", friendlyName="Codeship")
@MetaDataScope( DataSenseResolver.class )
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

     * @param key Key to be used to populate the entity
     * @param entity Map that represents the entity
     * @return Some string
     */
    @Processor
    public Map<String,Object> addEntity( @MetaDataKeyParam String key, @Default("#[payload]") Map<String,Object> entity) {
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
    public ListOfProgectsGetResponse getListOfProjects() {
      return getClient().getListOfProjects();
    }
    
    /**
     * This method Shows details of a project, by project ID.
     * 
     * @param projectId , Specify the project ID in the projectId parameter in the URI.<BR>
     * @return ProjectIdGetResponse
     */
    @Processor
    public ProjectIdGetResponse getProjectById(String projectId) {
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
    
    
    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

	public CodeshipClient getClient() {
		return client;
	}

	public void setClient(CodeshipClient client) {
		this.client = client;
	}

    
}