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
import com.camunda.consulting.openapi.client.model.RestartProcessInstanceModificationInstructionDto;
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
 * RestartProcessInstanceDto
 */
@JsonPropertyOrder({
  RestartProcessInstanceDto.JSON_PROPERTY_PROCESS_INSTANCE_IDS,
  RestartProcessInstanceDto.JSON_PROPERTY_HISTORIC_PROCESS_INSTANCE_QUERY,
  RestartProcessInstanceDto.JSON_PROPERTY_SKIP_CUSTOM_LISTENERS,
  RestartProcessInstanceDto.JSON_PROPERTY_SKIP_IO_MAPPINGS,
  RestartProcessInstanceDto.JSON_PROPERTY_INITIAL_VARIABLES,
  RestartProcessInstanceDto.JSON_PROPERTY_WITHOUT_BUSINESS_KEY,
  RestartProcessInstanceDto.JSON_PROPERTY_INSTRUCTIONS
})
@JsonTypeName("RestartProcessInstanceDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-13T17:49:51.183809+02:00[Europe/Berlin]")
public class RestartProcessInstanceDto {
  public static final String JSON_PROPERTY_PROCESS_INSTANCE_IDS = "processInstanceIds";
  private List<String> processInstanceIds = null;

  public static final String JSON_PROPERTY_HISTORIC_PROCESS_INSTANCE_QUERY = "historicProcessInstanceQuery";
  private HistoricProcessInstanceQueryDto historicProcessInstanceQuery;

  public static final String JSON_PROPERTY_SKIP_CUSTOM_LISTENERS = "skipCustomListeners";
  private Boolean skipCustomListeners;

  public static final String JSON_PROPERTY_SKIP_IO_MAPPINGS = "skipIoMappings";
  private Boolean skipIoMappings;

  public static final String JSON_PROPERTY_INITIAL_VARIABLES = "initialVariables";
  private Boolean initialVariables;

  public static final String JSON_PROPERTY_WITHOUT_BUSINESS_KEY = "withoutBusinessKey";
  private Boolean withoutBusinessKey;

  public static final String JSON_PROPERTY_INSTRUCTIONS = "instructions";
  private List<RestartProcessInstanceModificationInstructionDto> instructions = null;


  public RestartProcessInstanceDto processInstanceIds(List<String> processInstanceIds) {
    
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public RestartProcessInstanceDto addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

   /**
   * A list of process instance ids to restart.
   * @return processInstanceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of process instance ids to restart.")
  @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }


  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }


  public RestartProcessInstanceDto historicProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
    
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


  public RestartProcessInstanceDto skipCustomListeners(Boolean skipCustomListeners) {
    
    this.skipCustomListeners = skipCustomListeners;
    return this;
  }

   /**
   * Skip execution listener invocation for activities that are started as part of this request.
   * @return skipCustomListeners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip execution listener invocation for activities that are started as part of this request.")
  @JsonProperty(JSON_PROPERTY_SKIP_CUSTOM_LISTENERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipCustomListeners() {
    return skipCustomListeners;
  }


  public void setSkipCustomListeners(Boolean skipCustomListeners) {
    this.skipCustomListeners = skipCustomListeners;
  }


  public RestartProcessInstanceDto skipIoMappings(Boolean skipIoMappings) {
    
    this.skipIoMappings = skipIoMappings;
    return this;
  }

   /**
   * Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.16/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started as part of this request.
   * @return skipIoMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.16/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started as part of this request.")
  @JsonProperty(JSON_PROPERTY_SKIP_IO_MAPPINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipIoMappings() {
    return skipIoMappings;
  }


  public void setSkipIoMappings(Boolean skipIoMappings) {
    this.skipIoMappings = skipIoMappings;
  }


  public RestartProcessInstanceDto initialVariables(Boolean initialVariables) {
    
    this.initialVariables = initialVariables;
    return this;
  }

   /**
   * Set the initial set of variables during restart. By default, the last set of variables is used.
   * @return initialVariables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set the initial set of variables during restart. By default, the last set of variables is used.")
  @JsonProperty(JSON_PROPERTY_INITIAL_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInitialVariables() {
    return initialVariables;
  }


  public void setInitialVariables(Boolean initialVariables) {
    this.initialVariables = initialVariables;
  }


  public RestartProcessInstanceDto withoutBusinessKey(Boolean withoutBusinessKey) {
    
    this.withoutBusinessKey = withoutBusinessKey;
    return this;
  }

   /**
   * Do not take over the business key of the historic process instance.
   * @return withoutBusinessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Do not take over the business key of the historic process instance.")
  @JsonProperty(JSON_PROPERTY_WITHOUT_BUSINESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWithoutBusinessKey() {
    return withoutBusinessKey;
  }


  public void setWithoutBusinessKey(Boolean withoutBusinessKey) {
    this.withoutBusinessKey = withoutBusinessKey;
  }


  public RestartProcessInstanceDto instructions(List<RestartProcessInstanceModificationInstructionDto> instructions) {
    
    this.instructions = instructions;
    return this;
  }

  public RestartProcessInstanceDto addInstructionsItem(RestartProcessInstanceModificationInstructionDto instructionsItem) {
    if (this.instructions == null) {
      this.instructions = new ArrayList<>();
    }
    this.instructions.add(instructionsItem);
    return this;
  }

   /**
   * **Optional**. A JSON array of instructions that specify which activities to start the process instance at. If this property is omitted, the process instance starts at its default blank start event.
   * @return instructions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Optional**. A JSON array of instructions that specify which activities to start the process instance at. If this property is omitted, the process instance starts at its default blank start event.")
  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RestartProcessInstanceModificationInstructionDto> getInstructions() {
    return instructions;
  }


  public void setInstructions(List<RestartProcessInstanceModificationInstructionDto> instructions) {
    this.instructions = instructions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestartProcessInstanceDto restartProcessInstanceDto = (RestartProcessInstanceDto) o;
    return Objects.equals(this.processInstanceIds, restartProcessInstanceDto.processInstanceIds) &&
        Objects.equals(this.historicProcessInstanceQuery, restartProcessInstanceDto.historicProcessInstanceQuery) &&
        Objects.equals(this.skipCustomListeners, restartProcessInstanceDto.skipCustomListeners) &&
        Objects.equals(this.skipIoMappings, restartProcessInstanceDto.skipIoMappings) &&
        Objects.equals(this.initialVariables, restartProcessInstanceDto.initialVariables) &&
        Objects.equals(this.withoutBusinessKey, restartProcessInstanceDto.withoutBusinessKey) &&
        Objects.equals(this.instructions, restartProcessInstanceDto.instructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processInstanceIds, historicProcessInstanceQuery, skipCustomListeners, skipIoMappings, initialVariables, withoutBusinessKey, instructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestartProcessInstanceDto {\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    historicProcessInstanceQuery: ").append(toIndentedString(historicProcessInstanceQuery)).append("\n");
    sb.append("    skipCustomListeners: ").append(toIndentedString(skipCustomListeners)).append("\n");
    sb.append("    skipIoMappings: ").append(toIndentedString(skipIoMappings)).append("\n");
    sb.append("    initialVariables: ").append(toIndentedString(initialVariables)).append("\n");
    sb.append("    withoutBusinessKey: ").append(toIndentedString(withoutBusinessKey)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
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
