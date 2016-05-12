/**
 *
 */
package org.mule.modules.codeship.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOfProjectsGetResponse extends StatusResponse {

	private Projects[] projects;

	/**
	 *
	 * @return The projects
	 */
	public Projects[] getProjects() {
		return projects;
	}

	/**
	 * The projects list 
	 *
	 * @param projects
	 *            The projects list
	 */
	public void setProjects(Projects[] projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "ClassPojo [projects = " + projects + "]";
	}

}
