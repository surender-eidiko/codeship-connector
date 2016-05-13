/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.codeship.config;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {

	@Configurable
	@Optional
	@Default("https://codeship.com/api/v1")
	private String url = "https://codeship.com/api/v1";

	@Configurable
	@Optional
	@Default("3d1228d0f8050133ec772eb9f408a9c3")
	private String apiKey = "3d1228d0f8050133ec772eb9f408a9c3";

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

}