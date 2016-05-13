/**
 * Copyright ? 1992-2016 Cisco, Inc.
 */
package org.mule.modules.codeship.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Projects extends StatusResponse {

	/**
	 * The unique ID for the project.
	 *
	 */
	private String id;

	/**
	 * The name of the repository.
	 *
	 */
	private String repository_name;

	/**
	 * The list of builds.
	 *
	 */
	private Builds[] builds;

	/**
	 * The owner of the repository.
	 *
	 */
	private String repository_provider;

	/**
	 * The uuid.
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
	 * The name of the repository.
	 *
	 * @return The repository_name
	 */
	public String getRepository_name() {
		return repository_name;
	}
	/**
	 * The name of the repository.
	 *
	 * @param repository_name
	 *            The repository_name
	 */
	public void setRepository_name(String repository_name) {
		this.repository_name = repository_name;
	}
	/**
	 * The list of builds.
	 *
	 * @return The builds
	 */
	public Builds[] getBuilds() {
		return builds;
	}
	/**
	 * The list of builds.
	 *
	 * @param builds
	 *            The builds
	 */
	public void setBuilds(Builds[] builds) {
		this.builds = builds;
	}
	/**
	 * The repository_provider.
	 *
	 * @return The repository_provider
	 */
	public String getRepository_provider() {
		return repository_provider;
	}
	/**
	 * The repository_provider.
	 *
	 * @param repository_provider
	 *            The repository_provider
	 */
	public void setRepository_provider(String repository_provider) {
		this.repository_provider = repository_provider;
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

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", repository_name = "
				+ repository_name + ", builds = " + builds
				+ ", repository_provider = " + repository_provider
				+ ", uuid = " + uuid + "]";
	}

}
