/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.codeship;

import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jackson.map.ObjectMapper;
import org.mule.modules.codeship.bean.BuildIdGetResponse;
import org.mule.modules.codeship.bean.Projects;
import org.mule.modules.codeship.bean.StatusResponse;
import org.mule.modules.codeship.bean.ListOfProjectsGetResponse;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class CodeshipClient {

	private Client client;
	private WebResource apiResource;
	private CodeshipConnector connector;
	private static final Logger log = Logger.getLogger(CodeshipClient.class
			.getName());

	public CodeshipClient(CodeshipConnector connector) {
		setConnector(connector);

		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,
				Boolean.TRUE);
		this.client = Client.create(clientConfig);
		this.apiResource = this.client.resource(getConnector().getConfig()
				.getUrl());
	}

	public ListOfProjectsGetResponse getListOfProjects(String api_key) {
		WebResource webResource = getApiResource().path("projects.json");
		 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		 if(api_key!=null){
			 queryParams.add("api_key", api_key);
		 }else{
			 queryParams.add("api_key",getConnector().getConfig().getApiKey());
		 }
	    webResource = webResource.queryParams(queryParams);
		return (ListOfProjectsGetResponse) getData(webResource,
				ListOfProjectsGetResponse.class);
	}
	
	public Projects getProjectById(String projectId,String api_key) {
		WebResource webResource = getApiResource().path("projects").path(projectId+".json");
		 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		 if(api_key!=null){
			 queryParams.add("api_key", api_key);
		 }else{
			 	queryParams.add("api_key",getConnector().getConfig().getApiKey());
		 }
     webResource = webResource.queryParams(queryParams);
			    return (Projects) getData(webResource,
			    		Projects.class);
	}
	
	public BuildIdGetResponse restartBuildById(String buildId,String api_key) {
		WebResource webResource = getApiResource().path("builds").path(buildId).path("restart.json");
		 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		 if(api_key!=null){
			 queryParams.add("api_key", api_key);
		 }else{
			 	queryParams.add("api_key",getConnector().getConfig().getApiKey());
		 }
		 webResource = webResource.queryParams(queryParams);
		 return (BuildIdGetResponse) postData(null,webResource,BuildIdGetResponse.class);
	}

	private Object getData(WebResource webResource, Class<?> returnClass) {

		WebResource.Builder builder = addHeader(webResource);

		ClientResponse clientResponse = builder.get(ClientResponse.class);
		return buildResponseObject(returnClass, clientResponse);
	}

	private Object postData(Object request, WebResource webResource,
			Class<?> returnClass) {
		WebResource.Builder builder = addHeader(webResource);
		builder.type(MediaType.APPLICATION_JSON);
	
		String input = convertObjectToString(request);

		ClientResponse clientResponse = builder.post(ClientResponse.class,
				input);

		return buildResponseObject(returnClass, clientResponse);
	}

	private WebResource.Builder addHeader(WebResource webResource) {
		WebResource.Builder builder = webResource
				.accept(MediaType.APPLICATION_JSON);

	//	builder.header("Authorization", connector.getConfig()
	//			.getAuthorization());
		return builder;
	}

	private Object buildResponseObject(Class<?> returnClass,
			ClientResponse clientResponse) {

		StatusResponse statusResponse = null;
		if (clientResponse.getStatus() == 200) {
			statusResponse = (StatusResponse) clientResponse
					.getEntity(returnClass);
			statusResponse.setStatusCode("200");
		} else {

			String strResponse = clientResponse.getEntity(String.class);
			try {
				Constructor<?> ctor = returnClass.getConstructor();
				statusResponse = (StatusResponse) ctor.newInstance();
				statusResponse.setStatusCode(String.valueOf(clientResponse
						.getStatus()));
				statusResponse.setStatusMessage(strResponse);
			} catch (Exception ex) {
				log.log(Level.SEVERE, "Error", ex);
			}
		}
System.out.println(convertObjectToString(statusResponse));
		return statusResponse;

	}

	private String convertObjectToString(Object request) {
	  ObjectMapper mapper = new ObjectMapper();
		String input = "";

		try {
			input = mapper.writeValueAsString(request);

		} catch (Exception ex) {
			log.log(Level.SEVERE, "Error", ex);
		}
		log.info("Input String = " + input);
		return input;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public WebResource getApiResource() {
		return apiResource;
	}

	public void setApiResource(WebResource apiResource) {
		this.apiResource = apiResource;
	}

	public CodeshipConnector getConnector() {
		return connector;
	}

	public void setConnector(CodeshipConnector connector) {
		this.connector = connector;
	}

}
