package org.mule.modules.codeship.bean;

import java.util.List;

public class ProjectIdGetResponse extends StatusResponse {

	String id;
	String repositoryName;
	String uuid;
	List<BuildDataGetResponse> buildDataGetResponseList;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRepositoryName() {
		return repositoryName;
	}
	public void setRepositoryName(String repositoryName) {
		this.repositoryName = repositoryName;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public List<BuildDataGetResponse> getBuildDataGetResponseList() {
		return buildDataGetResponseList;
	}
	public void setBuildDataGetResponseList(
			List<BuildDataGetResponse> buildDataGetResponseList) {
		this.buildDataGetResponseList = buildDataGetResponseList;
	}
	
}
