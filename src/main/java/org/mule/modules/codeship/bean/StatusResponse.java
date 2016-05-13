/**
 * Copyright ? 1992-2016 Cisco, Inc.
 */
package org.mule.modules.codeship.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatusResponse {
	/**
	 * The status code
	 *
	 */
	private String statusCode;
	/**
	 * The status message
	 *
	 */
	private String statusMessage;
	
	/**
	 * The statusCode.
	 *
	 * @return The statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}
	/**
	 * The statusCode.
	 *
	 * @param statusCode
	 *            The statusCode
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	/**
	 * The statusMessage.
	 *
	 * @return The statusMessage
	 */
	public String getStatusMessage() {
		return statusMessage;
	}
	/**
	 * The statusMessage.
	 *
	 * @param statusMessage
	 *            The statusMessage
	 */
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

}
