/**
 *
 */
package org.mule.modules.codeship.bean;

import java.sql.Timestamp;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BuildDataGetResponse extends StatusResponse {

  String id;
  String uuid;
  String projectId;
  String status;
  String branch;
  String commitId;
  String githubUsername;
  String message;
  Timestamp startedAt;
  Timestamp finishedAt;
  String debugConnection;

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

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public String getCommitId() {
    return commitId;
  }

  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }

  public String getGithubUsername() {
    return githubUsername;
  }

  public void setGithubUsername(String githubUsername) {
    this.githubUsername = githubUsername;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Timestamp getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(Timestamp startedAt) {
    this.startedAt = startedAt;
  }

  public Timestamp getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(Timestamp finishedAt) {
    this.finishedAt = finishedAt;
  }

  public String getDebugConnection() {
    return debugConnection;
  }

  public void setDebugConnection(String debugConnection) {
    this.debugConnection = debugConnection;
  }

}
