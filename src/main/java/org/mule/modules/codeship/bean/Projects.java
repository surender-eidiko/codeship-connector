/**
 *
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRepository_name() {
		return repository_name;
	}

	public void setRepository_name(String repository_name) {
		this.repository_name = repository_name;
	}

	public Builds[] getBuilds() {
		return builds;
	}

	public void setBuilds(Builds[] builds) {
		this.builds = builds;
	}

	public String getRepository_provider() {
		return repository_provider;
	}

	public void setRepository_provider(String repository_provider) {
		this.repository_provider = repository_provider;
	}

	public String getUuid() {
		return uuid;
	}

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
