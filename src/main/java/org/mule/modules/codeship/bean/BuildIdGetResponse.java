/**
 *
 */
package org.mule.modules.codeship.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BuildIdGetResponse extends StatusResponse {
	
	/**
	 * The build id.
	 *
	 */
	private String id;
	/**
	 * The uuid
	 *
	 */
	private String uuid;
	
	/**
	 * The build id.
	 *
	 * @return The id
	 */
	public String getId() {
		return id;
	}
	/**
	 * The build id.
	 *
	 * @param id
	 *            The build id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * The uuid.
	 *
	 * @return The uuid
	 */
	public String getUuid() {
		return uuid;
	}
	/**
	 * The uuid.
	 *
	 * @param uuid
	 *            The uuid
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
}
