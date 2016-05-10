package org.mule.modules.codeship.bean;

public class BuildIdGetResponse extends StatusResponse {
	
	String id;
	String uuid;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
}
