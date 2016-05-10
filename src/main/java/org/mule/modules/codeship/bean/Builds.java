package org.mule.modules.codeship.bean;

public class Builds {
  
  private String message;

  private String id;

  private String status;

  private String commit_id;

  private String project_id;

  private String started_at;

  private String branch;

  private String github_username;

  private String uuid;

  private String finished_at;

  public String getMessage ()
  {
      return message;
  }

  public void setMessage (String message)
  {
      this.message = message;
  }

  public String getId ()
  {
      return id;
  }

  public void setId (String id)
  {
      this.id = id;
  }

  public String getStatus ()
  {
      return status;
  }

  public void setStatus (String status)
  {
      this.status = status;
  }

  public String getCommit_id ()
  {
      return commit_id;
  }

  public void setCommit_id (String commit_id)
  {
      this.commit_id = commit_id;
  }

  public String getProject_id ()
  {
      return project_id;
  }

  public void setProject_id (String project_id)
  {
      this.project_id = project_id;
  }

  public String getStarted_at ()
  {
      return started_at;
  }

  public void setStarted_at (String started_at)
  {
      this.started_at = started_at;
  }

  public String getBranch ()
  {
      return branch;
  }

  public void setBranch (String branch)
  {
      this.branch = branch;
  }

  public String getGithub_username ()
  {
      return github_username;
  }

  public void setGithub_username (String github_username)
  {
      this.github_username = github_username;
  }

  public String getUuid ()
  {
      return uuid;
  }

  public void setUuid (String uuid)
  {
      this.uuid = uuid;
  }

  public String getFinished_at ()
  {
      return finished_at;
  }

  public void setFinished_at (String finished_at)
  {
      this.finished_at = finished_at;
  }

  @Override
  public String toString()
  {
      return "ClassPojo [message = "+message+", id = "+id+", status = "+status+", commit_id = "+commit_id+", project_id = "+project_id+", started_at = "+started_at+", branch = "+branch+", github_username = "+github_username+", uuid = "+uuid+", finished_at = "+finished_at+"]";
  }

}
