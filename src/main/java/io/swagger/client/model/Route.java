package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;


@ApiModel(description = "")
public class Route  {
  
  private String vehicleId = null;
  private List<Activity> activities = new ArrayList<Activity>() ;

  
  /**
   * id of vehicle that operates route
   **/
  @ApiModelProperty(value = "id of vehicle that operates route")
  @JsonProperty("vehicle_id")
  public String getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
  }

  
  /**
   * array of activities
   **/
  @ApiModelProperty(value = "array of activities")
  @JsonProperty("activities")
  public List<Activity> getActivities() {
    return activities;
  }
  public void setActivities(List<Activity> activities) {
    this.activities = activities;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Route {\n");
    
    sb.append("  vehicleId: ").append(vehicleId).append("\n");
    sb.append("  activities: ").append(activities).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
