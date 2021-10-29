/*
 * Camunda Platform REST API
 * OpenApi Spec for Camunda Platform REST API.
 *
 * The version of the OpenAPI document: 7.16.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.camunda.consulting.openapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.camunda.consulting.openapi.client.model.HistoricProcessInstanceQueryDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SetRemovalTimeToHistoricProcessInstancesDtoAllOf
 */
@JsonPropertyOrder({
  SetRemovalTimeToHistoricProcessInstancesDtoAllOf.JSON_PROPERTY_HISTORIC_PROCESS_INSTANCE_IDS,
  SetRemovalTimeToHistoricProcessInstancesDtoAllOf.JSON_PROPERTY_HISTORIC_PROCESS_INSTANCE_QUERY,
  SetRemovalTimeToHistoricProcessInstancesDtoAllOf.JSON_PROPERTY_HIERARCHICAL
})
@JsonTypeName("SetRemovalTimeToHistoricProcessInstancesDto_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T17:49:51.183809+02:00[Europe/Berlin]")
public class SetRemovalTimeToHistoricProcessInstancesDtoAllOf {
  public static final String JSON_PROPERTY_HISTORIC_PROCESS_INSTANCE_IDS = "historicProcessInstanceIds";
  private List<String> historicProcessInstanceIds = null;

  public static final String JSON_PROPERTY_HISTORIC_PROCESS_INSTANCE_QUERY = "historicProcessInstanceQuery";
  private HistoricProcessInstanceQueryDto historicProcessInstanceQuery;

  public static final String JSON_PROPERTY_HIERARCHICAL = "hierarchical";
  private Boolean hierarchical;


  public SetRemovalTimeToHistoricProcessInstancesDtoAllOf historicProcessInstanceIds(List<String> historicProcessInstanceIds) {
    
    this.historicProcessInstanceIds = historicProcessInstanceIds;
    return this;
  }

  public SetRemovalTimeToHistoricProcessInstancesDtoAllOf addHistoricProcessInstanceIdsItem(String historicProcessInstanceIdsItem) {
    if (this.historicProcessInstanceIds == null) {
      this.historicProcessInstanceIds = new ArrayList<>();
    }
    this.historicProcessInstanceIds.add(historicProcessInstanceIdsItem);
    return this;
  }

   /**
   * The id of the process instance.
   * @return historicProcessInstanceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process instance.")
  @JsonProperty(JSON_PROPERTY_HISTORIC_PROCESS_INSTANCE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getHistoricProcessInstanceIds() {
    return historicProcessInstanceIds;
  }


  public void setHistoricProcessInstanceIds(List<String> historicProcessInstanceIds) {
    this.historicProcessInstanceIds = historicProcessInstanceIds;
  }


  public SetRemovalTimeToHistoricProcessInstancesDtoAllOf historicProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
    
    this.historicProcessInstanceQuery = historicProcessInstanceQuery;
    return this;
  }

   /**
   * Get historicProcessInstanceQuery
   * @return historicProcessInstanceQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HISTORIC_PROCESS_INSTANCE_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HistoricProcessInstanceQueryDto getHistoricProcessInstanceQuery() {
    return historicProcessInstanceQuery;
  }


  public void setHistoricProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
    this.historicProcessInstanceQuery = historicProcessInstanceQuery;
  }


  public SetRemovalTimeToHistoricProcessInstancesDtoAllOf hierarchical(Boolean hierarchical) {
    
    this.hierarchical = hierarchical;
    return this;
  }

   /**
   * Sets the removal time to all historic process instances in the hierarchy. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior.
   * @return hierarchical
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets the removal time to all historic process instances in the hierarchy. Value may only be `true`, as `false` is the default behavior.")
  @JsonProperty(JSON_PROPERTY_HIERARCHICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHierarchical() {
    return hierarchical;
  }


  public void setHierarchical(Boolean hierarchical) {
    this.hierarchical = hierarchical;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetRemovalTimeToHistoricProcessInstancesDtoAllOf setRemovalTimeToHistoricProcessInstancesDtoAllOf = (SetRemovalTimeToHistoricProcessInstancesDtoAllOf) o;
    return Objects.equals(this.historicProcessInstanceIds, setRemovalTimeToHistoricProcessInstancesDtoAllOf.historicProcessInstanceIds) &&
        Objects.equals(this.historicProcessInstanceQuery, setRemovalTimeToHistoricProcessInstancesDtoAllOf.historicProcessInstanceQuery) &&
        Objects.equals(this.hierarchical, setRemovalTimeToHistoricProcessInstancesDtoAllOf.hierarchical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historicProcessInstanceIds, historicProcessInstanceQuery, hierarchical);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetRemovalTimeToHistoricProcessInstancesDtoAllOf {\n");
    sb.append("    historicProcessInstanceIds: ").append(toIndentedString(historicProcessInstanceIds)).append("\n");
    sb.append("    historicProcessInstanceQuery: ").append(toIndentedString(historicProcessInstanceQuery)).append("\n");
    sb.append("    hierarchical: ").append(toIndentedString(hierarchical)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
