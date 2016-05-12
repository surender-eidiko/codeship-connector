/**
 *
 */
package org.mule.modules.codeship.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Builds extends StatusResponse {
	/**
	 * The message text for the build
	 *
	 */
	private String message;
	/**
	 * The build id.
	 *
	 */
	private String id;
	/**
	 * The build status
	 *
	 */
	private String status;

	/**
	 * The id of the commit.
	 *
	 */
	private String commit_id;

	/**
	 * The project id.
	 *
	 */
	private String project_id;
	/**
	 * The build start time
	 *
	 */
	private String started_at;
	/**
	 * The branch name in the repository.
	 *
	 */
	private String branch;

	/**
	 * The name of the user.
	 *
	 */
	private String github_username;

	/**
	 * The uuid
	 *
	 */
	private String uuid;
	/**
	 * The build finish time
	 *
	 */
	private String finished_at;
	/**
	 * The message.
	 *
	 * @return The message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * The message.
	 *
	 * @param message
	 *            The message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
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
	 * The build status.
	 *
	 * @return The status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * The build status.
	 *
	 * @param status
	 *            The build status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * The commit id.
	 *
	 * @return The commit_id
	 */
	public String getCommit_id() {
		return commit_id;
	}
	/**
	 * The commit_id.
	 *
	 * @param commit_id
	 *            The commit_id
	 */
	public void setCommit_id(String commit_id) {
		this.commit_id = commit_id;
	}
	/**
	 * The project_id.
	 *
	 * @return The project_id
	 */
	public String getProject_id() {
		return project_id;
	}
	/**
	 * The project_id.
	 *
	 * @param project_id
	 *            The project_id
	 */
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
	/**
	 * The started_at.
	 *
	 * @return The started_at
	 */
	public String getStarted_at() {
		return started_at;
	}
	/**
	 * The started_at.
	 *
	 * @param started_at
	 *            The started_at
	 */
	public void setStarted_at(String started_at) {
		this.started_at = started_at;
	}
	/**
	 * The branch.
	 *
	 * @return The branch
	 */
	public String getBranch() {
		return branch;
	}
	/**
	 * The branch.
	 *
	 * @param branch
	 *            The branch
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}
	/**
	 * The github_username.
	 *
	 * @return The github_username
	 */
	public String getGithub_username() {
		return github_username;
	}
	/**
	 * The github_username.
	 *
	 * @param github_username
	 *            The github_username
	 */
	public void setGithub_username(String github_username) {
		this.github_username = github_username;
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
	/**
	 * The finished_at.
	 *
	 * @return The finished_at
	 */
	public String getFinished_at() {
		return finished_at;
	}
	/**
	 * The finished_at.
	 *
	 * @param finished_at
	 *            The finished_at
	 */
	public void setFinished_at(String finished_at) {
		this.finished_at = finished_at;
	}

	@Override
	public String toString() {
		return "ClassPojo [message = " + message + ", id = " + id
				+ ", status = " + status + ", commit_id = " + commit_id
				+ ", project_id = " + project_id + ", started_at = "
				+ started_at + ", branch = " + branch + ", github_username = "
				+ github_username + ", uuid = " + uuid + ", finished_at = "
				+ finished_at + "]";
	}

}
