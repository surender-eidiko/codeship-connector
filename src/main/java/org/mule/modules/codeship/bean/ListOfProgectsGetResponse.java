package org.mule.modules.codeship.bean;

import java.util.List;

public class ListOfProgectsGetResponse extends StatusResponse{

	List<ProjectIdGetResponse> listOfProgectsGetResponse;
	
	public List<ProjectIdGetResponse> getListOfProgectsGetResponse() {
		return listOfProgectsGetResponse;
	}
	public void setListOfProgectsGetResponse(
			List<ProjectIdGetResponse> listOfProgectsGetResponse) {
		this.listOfProgectsGetResponse = listOfProgectsGetResponse;
	}
	
	
}
