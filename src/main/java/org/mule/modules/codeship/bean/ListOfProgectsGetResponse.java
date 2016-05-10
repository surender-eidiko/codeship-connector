/**
 *
 */
package org.mule.modules.codeship.bean;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOfProgectsGetResponse extends StatusResponse{

  private Projects[] projects;

  public Projects[] getProjects ()
  {
      return projects;
  }

  public void setProjects (Projects[] projects)
  {
      this.projects = projects;
  }

  @Override
  public String toString()
  {
      return "ClassPojo [projects = "+projects+"]";
  }
	
}
